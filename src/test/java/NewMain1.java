/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import control.Control;
import dao.ClienteDAO;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.interfaces.IConexion;
import objetos.Cliente;
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
    Cliente cliente = new Cliente();
    cliente.setId(10145);
    cliente.setPassw("123");
    Control control = new Control();
    Cliente clienteAutenticado = control.iniciarSesion(cliente);
    if (clienteAutenticado != null) {
        System.out.println("Inicio de sesión exitoso para el cliente: " + clienteAutenticado.getNombre());
    } else {
        System.out.println("Inicio de sesión fallido. Cliente no encontrado o contraseña incorrecta.");
    }
    }
    
}
