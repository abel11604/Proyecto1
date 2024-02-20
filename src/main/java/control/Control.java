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
import gui.DlgSeleccionarcuenta;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import objetos.Cliente;
import objetos.Cuenta;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author abelc
 */
public class Control {

    Conversiones conversiones;
    private String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    private String user = "root";
    private String password = "root";
    private IConexion conexionDB = new ConexionDB(cadenaConexion, user, password);
    private ClienteDAO clienteDAO;
    private CuentaDAO cuentaDAO;
    private TransaccionDAO transaccionDAO;

    public Control() {
        clienteDAO = new ClienteDAO(conexionDB);
        cuentaDAO = new CuentaDAO(conexionDB);
        conversiones = new Conversiones();
    }

    public boolean registrarCliente(JFrame frame) {
        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();
        DlgRegistro dlgRegistro;
        dlgRegistro = new DlgRegistro(frame, true, cliente,1);
        System.out.println(cliente.getNombre());
        try {
            clienteDAO.registrarCliente(cliente);
            cuenta.setCliente(cliente);
            cuenta.setSaldo(1000);
            cuentaDAO.registrarCuenta(cuenta);
        } catch (PersistenciaException ex) {
            Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
public boolean actualizarCliente(Cliente cliente){
        Cuenta cuenta = new Cuenta();
        DlgRegistro dlgRegistro;
        dlgRegistro = new DlgRegistro(null, true, cliente,2);
        clienteDAO.editarCliente(cliente);
        return true;
}
    /**
     * Metodo que encripta la contraseña de un cliente con el mismo formato con
     * el que se guardan en la base de datos
     *
     * @param cliente
     * @return objeto cliente con la contraseña encriptada
     */
    private Cliente encriptarPassw(Cliente cliente) {
        String contraseña = cliente.getPassw();

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = md.digest(contraseña.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            String hash = sb.toString();

            cliente.setPassw(hash);

            return cliente;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

            return cliente;
        }
    }

    public String encriptarPassw(String passw) {
        String contraseña = passw;

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = md.digest(contraseña.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }

            String hash = sb.toString();

            return passw;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();

            return passw;
        }
    }

    public Cliente iniciarSesion(Cliente cliente) {

        Cliente clienteEncontrado = clienteDAO.buscarCliente(cliente.getId());

        if (clienteEncontrado == null) {
            return null;
        }

        String contraseñaEncriptadaCliente = encriptarPassw(cliente).getPassw();

        if (clienteEncontrado.getPassw().equals(contraseñaEncriptadaCliente)) {

            return clienteEncontrado;
        } else {

            return null;
        }

    }

    public Cuenta seleccionarCuenta(Cliente cliente, JFrame frame) {
        Cuenta cuenta;
        DefaultComboBoxModel<String> cuentasComboBoxModel;
        DlgSeleccionarcuenta dlgCuenta;
        String numCuenta = null;
        cuentasComboBoxModel = conversiones.cuentasComboBoxModel(cuentaDAO.buscarCuentaPorCliente(cliente.getId()));
        dlgCuenta = new DlgSeleccionarcuenta(frame, true, cliente, cuentasComboBoxModel, numCuenta);
        numCuenta=dlgCuenta.getNumCuenta();
       
        cuenta = cuentaDAO.buscarCuenta(numCuenta);
        
        return cuenta;
    }

    public Cuenta agregarCuentaCliente(Cliente cliente) {
        cliente = clienteDAO.buscarCliente(cliente.getId());
        Cuenta cuenta = new Cuenta(1000, cliente);
        cuentaDAO.registrarCuenta(cuenta);
        return cuenta;
    }
}
