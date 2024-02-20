/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.interfaces.IConexion;
import dao.interfaces.ITransaccion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Cuenta;
import objetos.Transaccion;

/**
 *
 * @author fabri
 */
public class TransaccionDAO implements ITransaccion {

    private final IConexion conexion;

    public TransaccionDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Transaccion registrarTransaccion(Transaccion t) {

        String creaTransaccion = "INSERT INTO Transaccion "
                + "(cantidad, tipo_transaccion, id_cuenta)"
                + "VALUES (?, ?, ?)";

        Transaccion tr = null;

        try {
            Connection con = conexion.crearConexion();
            PreparedStatement st = con.prepareStatement(creaTransaccion);
            st.setInt(1, t.getCantidad());
            st.setBoolean(2, t.isTipo_transaccion());
            st.setString(3, t.getCuenta().getIdCuenta());

        } catch (SQLException e) {
            Logger.getLogger(TransaccionDAO.class.getName()).log(Level.SEVERE, "Error al intentar eliminar la cuenta", e);

        }
        return tr;
    }

    @Override
    public Transaccion editarTransaccion(Transaccion t) {
        Logger.getLogger(TransaccionDAO.class.getName()).log(Level.SEVERE, "No puedes editar transacciones ...");
        return null;

    }

    @Override
    public Transaccion eliminarTransaccion(Transaccion t) {
        String deleteTransaccion = "DELETE FROM transaccion WHERE id_transaccion = ?";
        Transaccion transaccionEliminada = new Transaccion();

        if (t != null) {
            try {
                Connection c = conexion.crearConexion();
                PreparedStatement deleteStatement = c.prepareStatement(deleteTransaccion);
                deleteStatement.setInt(1, t.getId_transaccion());
                int filasAfectadas = deleteStatement.executeUpdate();
                if (filasAfectadas > 0) {
                    transaccionEliminada.setId_transaccion(t.getId_transaccion());
                    transaccionEliminada.setFechahora_transaccion(t.getFechahora_transaccion());
                    transaccionEliminada.setCantidad(t.getCantidad());
                    transaccionEliminada.setTipo_transaccion(t.isTipo_transaccion());
                    transaccionEliminada.setCuenta(t.getCuenta());
                }

            } catch (SQLException e) {
                Logger.getLogger(TransaccionDAO.class.getName()).log(Level.SEVERE, "Error al intentar eliminar la cuenta", e);
            }
        }

        return transaccionEliminada;

    }

    @Override
    public Transaccion verTransaccion(int id) {

        String selectTransaccion
                = "SELECT t.id_transaccion, t.fecha_transaccion, t.hora_transaccion, "
                + "t.cantidad, t.tipo_transaccion, c.id_cuenta "
                + "FROM transaccion t "
                + "JOIN cuenta c ON t.id_cuenta = c.id_cuenta "
                + "WHERE t.id_transaccion = ?";
        Transaccion transaccionEncontrada = null;

        try {
            Connection c = conexion.crearConexion();
            PreparedStatement selectStatement = c.prepareStatement(selectTransaccion);

            selectStatement.setInt(1, id);
            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                transaccionEncontrada = new Transaccion();
                transaccionEncontrada.setId_transaccion(resultSet.getInt("id_transaccion"));
                transaccionEncontrada.setFechahora_transaccion(resultSet.getTimestamp("fecha_hora_transaccion"));
                transaccionEncontrada.setTipo_transaccion(resultSet.getBoolean("tipo_transaccion"));
                transaccionEncontrada.setCantidad(resultSet.getInt("cantidad"));

                Cuenta cuenta = new Cuenta();
                cuenta.setIdCuenta(resultSet.getString("id_cuenta"));

                transaccionEncontrada.setCuenta(cuenta);

            }

        } catch (SQLException e) {
            Logger.getLogger(CuentaDAO.class.getName()).log(Level.SEVERE, "Error en la operacion, verifica los datos", e);

        }
        return transaccionEncontrada;
    }

    public ArrayList<Transaccion> verHistorial(String id) {
        ArrayList<Transaccion> transacciones = new ArrayList<>();
        try {
            Connection con = conexion.crearConexion();
            String verHistorialState = "{CALL verHistorial(?)}";
            CallableStatement callableStatement = con.prepareCall(verHistorialState);
            callableStatement.setString(1, id);
//            ResultSet resultSet = callableStatement.executeQuery();
            boolean results = callableStatement.execute();

            while (results) {
                ResultSet resultSet = callableStatement.getResultSet();
                while (resultSet.next()) {
                   // int idTransaccion = resultSet.getInt("Id");
                    Timestamp fechaTransaccion = resultSet.getTimestamp("Fecha");
                    int monto = resultSet.getInt("Monto");
                    String tipoTransaccion = resultSet.getString("Tipo de Transacción");
                    Transaccion transaccion = new Transaccion(fechaTransaccion, tipoTransaccion, monto);
                    transacciones.add(transaccion);

                }
                results = callableStatement.getMoreResults();

            }

        } catch (SQLException e) {
            Logger.getLogger(CuentaDAO.class.getName()).log(Level.SEVERE, "No ha sido posible recuperar los datos", e);

        }
        return transacciones;
    }

}
