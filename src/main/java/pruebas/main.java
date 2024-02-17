package pruebas;

import dao.ClienteDAO;
import dao.ConexionDB;
import dao.excepciones.PersistenciaException;
import dao.interfaces.IConexion;
import gui.DlgCuentas;
import java.sql.SQLException;
import objetos.Cliente;

public class main {

    public static void main(String[] args) throws SQLException, PersistenciaException {

        //prueabs 
        IConexion con = new ConexionDB("jdbc:mysql://localhost:3306/banco", "root", "root");
        ClienteDAO clienteDao = new ClienteDAO(con);
        Cliente cliente = clienteDao.buscarCliente(41180);
        DlgCuentas dlg = new DlgCuentas(null, true, cliente);
        dlg.setVisible(true);

    }

}
