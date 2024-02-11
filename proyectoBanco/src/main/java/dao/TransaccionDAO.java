/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.interfaces.IConexion;
import dao.interfaces.ITransaccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

        String creaTransaccion = "INSERT INTO transaccion "
                + "(fecha_transaccion, hora_transaccion, cantidad, es_cliente, id_cuenta)"
                + "VALUES (?,?,?,?,?)";
        
        Transaccion tr = null;
        
        try{
            Connection con = conexion.crearConexion();
            PreparedStatement st = con.prepareStatement(creaTransaccion);
            st.setDate(1, t.getFecha_transaccion());
            st.setTime(2, t.getHora_transaccion());
            st.setInt(3, t.getCantidad());
            st.setBoolean(4, t.isEs_cliente());
            st.setInt(5, t.getId_cuenta());
            
        }catch(SQLException e){
            
        }
        return tr;
    }

    @Override
    public Transaccion editarTransaccion(Transaccion t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Transaccion eliminarTransaccion(Transaccion t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Transaccion verTransaccion(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
