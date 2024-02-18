/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

import dao.ConexionDB;
import dao.CuentaDAO;
import dao.interfaces.IConexion;
import objetos.Cuenta;

/**
 *
 * @author abelc
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    String user = "root";
     String password = "root";
     IConexion conexionDB = new ConexionDB(cadenaConexion, user, password);
     CuentaDAO cu=new CuentaDAO(conexionDB);
     String id="1838448853823866";
     Cuenta cuenta=cu.buscarCuenta(id);
        if (cuenta != null) {
    System.out.println("ID de cuenta encontrado: " + cuenta.getCliente().getId());
} else {
    System.out.println("La cuenta no fue encontrada.");
}
    }
    
}
