/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import dao.ClienteDAO;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.excepciones.PersistenciaException;
import dao.interfaces.IConexion;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetos.Cliente;
import objetos.Cuenta;

/**
 *
 * @author abelc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    String user = "root";
     String password = "root";
     IConexion conexionDB = new ConexionDB(cadenaConexion, user, password);
    ClienteDAO CL=new ClienteDAO(conexionDB);
    Date fecha = Date.valueOf("2022-02-15");
    Cliente cliente=new Cliente("juan","perez","perez","juarez","Plano oriente","82045",
            fecha,"passw");
        try {
            CL.registrarCliente(cliente);
        } catch (PersistenciaException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    CuentaDAO cu=new CuentaDAO(conexionDB);
    Cuenta cuenta=new Cuenta(100,cliente);
    cu.registrarCuenta(cuenta);
    }
    
}
