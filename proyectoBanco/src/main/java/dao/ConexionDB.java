/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.interfaces.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fabri
 */
public class ConexionDB implements IConexion {

    private final String cadenaConexion;
    private final String usuario;
    private final String contra;

    public ConexionDB(String cadenaConexion, String usuario, String contra) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.contra = contra;
    }

    @Override
    public Connection crearConexion() throws SQLException {
        Connection c = DriverManager.getConnection(cadenaConexion, usuario, contra);
        return c;
    }

}
