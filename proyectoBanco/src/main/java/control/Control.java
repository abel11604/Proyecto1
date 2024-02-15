/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ClienteDAO;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.TransaccionDAO;
import dao.interfaces.IConexion;
import javax.swing.JFrame;

/**
 *
 * @author abelc
 */
public class Control {

    private String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    private String user = "root";
    private String password = "root";
    private IConexion conexionDB = new ConexionDB(cadenaConexion, user, password);
    private ClienteDAO clienteDAO;
    private CuentaDAO cuentaDAO;
    private TransaccionDAO transaccionDAO;

    public Control() {
        clienteDAO = new ClienteDAO(conexionDB);
    }
    
    //public boolean registrarCliente(JFrame frame){
    //}
}
