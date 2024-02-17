/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ClienteDAO;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.TransaccionDAO;
import dao.excepciones.PersistenciaException;
import dao.interfaces.IConexion;
import gui.DlgRegistro;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import objetos.Cliente;

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
        cuentaDAO= new CuentaDAO(conexionDB);
    }

    public boolean registrarCliente(JFrame frame) {
        Cliente cliente = new Cliente();
        //Cuenta cuenta=new Cuenta();
        DlgRegistro dlgRegistro;
        dlgRegistro = new DlgRegistro(frame, true, cliente);
        try {
            clienteDAO.registrarCliente(cliente);
           // cuenta.setCliente(cliente);
            //cuenta.setSaldo(1000);
            //cuentaDAO.registrarCuenta(cuenta);
        } catch (PersistenciaException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
