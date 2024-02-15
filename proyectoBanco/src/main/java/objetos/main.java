package objetos;


import dao.ClienteDAO;
import dao.ConexionDB;
import dao.CuentaDAO;
import dao.excepciones.PersistenciaException;
import dao.interfaces.IConexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;


public class main {

    public static void main(String[] args) throws SQLException, PersistenciaException {
        IConexion con = new ConexionDB("jdbc:mysql://localhost:3306/banco", "root", "root");

        CuentaDAO cuenta = new CuentaDAO(con);
   
    }

}