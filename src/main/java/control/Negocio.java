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
import objetos.Cliente;
import objetos.Cuenta;
import objetos.Transaccion;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author abelc
 */
// Por si cambiamos la log de negocios a java hice esta clase
public class Negocio {

    private Cliente cliente;
    private Cuenta cuenta;
    private Transaccion transaccion;
    private String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    private String user = "root";
    private String password = "root";
    private IConexion conexionDB = new ConexionDB(cadenaConexion, user, password);
    private ClienteDAO clienteDAO;
    private CuentaDAO cuentaDAO;

    public Negocio() {
        cliente = new Cliente();
        cuenta = new Cuenta();
        transaccion = new Transaccion();
        clienteDAO = new ClienteDAO(conexionDB);
        cuentaDAO = new CuentaDAO(conexionDB);
    }

    public Cliente generarID(Cliente cliente) {
        boolean id = false;
// se repite hasta que lo que regrese el metodo buscar cliente sea null, osea no repetido 
        while (!id) {
            String idCliente = RandomStringUtils.randomNumeric(5);
            if (clienteDAO.buscarCliente(Integer.parseInt(idCliente)) == null) {

                cliente.setId(Integer.parseInt(idCliente));
                id = true;
            }
        }
        return cliente;
    }
}
