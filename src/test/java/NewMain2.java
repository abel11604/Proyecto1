/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import dao.ClienteDAO;
import dao.ConexionDB;
import dao.interfaces.IConexion;

/**
 *
 * @author abelc
 */
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    String user = "root";
     String password = "root";
     IConexion conexionDB = new ConexionDB(cadenaConexion, user, password);
    ClienteDAO CL=new ClienteDAO(conexionDB);
        System.out.println(CL.buscarCliente(10145).getPassw());
    }
    
}
