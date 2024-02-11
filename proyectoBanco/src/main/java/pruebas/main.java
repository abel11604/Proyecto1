package pruebas;

import dao.ConexionDB;
import dao.interfaces.IConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fabri
 */
public class main {

    public static void main(String[] args) throws SQLException {
        IConexion con = new ConexionDB("jdbc:mysql://localhost:3306/banco", "root", "root");
      
        
        
        
        
        
        
        
        
    }

}
