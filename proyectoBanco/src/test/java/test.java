
import dao.ClienteDAO;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.excepciones.PersistenciaException;
import dao.interfaces.IConexion;
import objetos.Cliente;
import objetos.Cuenta;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */



/**
 *
 * @author fabri
 */
public class test {
    IConexion conexion = new ConexionDB("jdbc:mysql://localhost:3306/banco", "root", "root");
    ClienteDAO cliente = new ClienteDAO(conexion); 
    CuentaDAO cuenta = new CuentaDAO(conexion);
    @Test
    void addClient() throws PersistenciaException{
        // expected y result
         
        assertEquals(true, cliente.registrarCliente(new Cliente()));
    }
    
    
    @Test
    void buscarCuenta() throws PersistenciaException{
        assertEquals(new Cuenta(),cuenta.buscarCuenta(1));
    }
    
    @Test
    void editarCliente() throws PersistenciaException{
        Cuenta anterior = cuenta.buscarCuenta(1);
        anterior.setSaldo(10000000);
        assertEquals(anterior, cuenta.editarCuenta(anterior));
    }


}
