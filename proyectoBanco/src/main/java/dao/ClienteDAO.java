/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.excepciones.PersistenciaException;
import dao.interfaces.ICliente;
import dao.interfaces.IConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Cliente;

/**
 *
 * @author fabri
 */
public class ClienteDAO implements ICliente {

    private final IConexion conexion;

    public ClienteDAO(IConexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) throws PersistenciaException {

        String creaTransaccion = "INSERT INTO Cliente"
                + "(nombre, apellido_paterno, apellido_materno, calle, colonia, codigo_postal, fecha_nacimiento,edad)"
                + "VALUES (?,?,?,?,?,?,?,?)";

        Cliente clienteCreado = new Cliente();

        try {
            Connection con = conexion.crearConexion();
            PreparedStatement st = con.prepareStatement(creaTransaccion, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, cliente.getNombre());
            st.setString(2, cliente.getApellido_materno());
            st.setString(3, cliente.getApellido_paterno());
            st.setString(4, cliente.getCalle());
            st.setString(5, cliente.getColonia());
            st.setString(6, cliente.getCodigo_postal());
            st.setDate(7, cliente.getFecha_nacimiento());
            st.setInt(8, cliente.getEdad());

            int filasAfectadas = st.executeUpdate();

            if (filasAfectadas > 0) {
                ResultSet generatedKeys = st.getGeneratedKeys();

                if (generatedKeys.next()) {
                    int idGenerado = generatedKeys.getInt(1);
                    clienteCreado.setId(idGenerado);
                } else {
                    throw new SQLException("No se pudo obtener el ID generado.");
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, "Error en la operacion", e);
        }
        clienteCreado.setNombre(cliente.getNombre());
        return clienteCreado;

    }

    @Override
    public Cliente editarCliente(Cliente cliente) {

        String updateCliente = "UPDATE cliente SET nombre = ?, apellido_paterno = ?, apellido_materno = ?, calle = ?, colonia = ?, codigo_postal = ?, fecha_nacimiento = ?   WHERE id = ?";
        Cliente clienteActualizado = new Cliente();

        if (cliente != null) {
            try {
                Connection c = conexion.crearConexion();
                PreparedStatement updateStatement = c.prepareStatement(updateCliente);

                updateStatement.setString(1, cliente.getNombre());
                updateStatement.setString(2, cliente.getApellido_paterno());
                updateStatement.setString(3, cliente.getCalle());
                updateStatement.setString(4, cliente.getColonia());
                updateStatement.setString(5, cliente.getCodigo_postal());
                updateStatement.setDate(6, cliente.getFecha_nacimiento());
                updateStatement.setInt(7, cliente.getId());

                int filasAfectadas = updateStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    clienteActualizado.setNombre(cliente.getNombre());
                    clienteActualizado.setApellido_paterno(cliente.getApellido_paterno());
                    clienteActualizado.setApellido_materno(cliente.getApellido_materno());
                    clienteActualizado.setColonia(cliente.getColonia());
                    clienteActualizado.setCalle(cliente.getCalle());
                    clienteActualizado.setCodigo_postal(cliente.getCodigo_postal());
                    clienteActualizado.setFecha_nacimiento(cliente.getFecha_nacimiento());
                }

            } catch (SQLException e) {
                Logger.getLogger(CuentaDAO.class.getName()).log(Level.SEVERE, "Error en la operacion de editar", e);
            }
        }

        return clienteActualizado;
    }

    @Override
    public Cliente eliminarCliente(Cliente cliente) {

        String deleteCliente = "DELETE FROM cliente WHERE id = ?";
        Cliente clienteEliminado = new Cliente();

        if (cliente != null) {
            try {
                Connection c = conexion.crearConexion();
                PreparedStatement deleteStatement = c.prepareStatement(deleteCliente);
                deleteStatement.setInt(1, cliente.getId());
                int filasAfectadas = deleteStatement.executeUpdate();
                if (filasAfectadas > 0) {
                    clienteEliminado.setId(cliente.getId());
                    clienteEliminado.setNombre(cliente.getNombre());

                }

            } catch (SQLException e) {
                Logger.getLogger(CuentaDAO.class.getName()).log(Level.SEVERE, "Error en la operacion de editar", e);
            }
        }

        return clienteEliminado;

    }

    @Override
    public Cliente buscarCliente(int id) {
        String selectCliente
                = "SELECT * FROM cliente WHERE id = ?";

        Cliente clienteEncontrado = new Cliente();

        try {
            Connection c = conexion.crearConexion();
            PreparedStatement selectStatement = c.prepareStatement(selectCliente);

            selectStatement.setInt(1, id);

            ResultSet resultSet = selectStatement.executeQuery();

            if (resultSet.next()) {
                clienteEncontrado = new Cliente();
                clienteEncontrado.setId(resultSet.getInt("idCliente"));
                clienteEncontrado.setNombre(resultSet.getString("nombre"));
                clienteEncontrado.setApellido_materno(resultSet.getString("apellido_materno"));
                clienteEncontrado.setApellido_paterno(resultSet.getString("apellido_paterno"));
                clienteEncontrado.setCalle(resultSet.getString("calle"));
                clienteEncontrado.setColonia(resultSet.getString("colonia"));
                clienteEncontrado.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
                clienteEncontrado.setCodigo_postal(resultSet.getString("codigo_postal"));
            }

        } catch (SQLException e) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, "Error en la operacion", e);
        }

        return clienteEncontrado;
    }

}
