/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author fabri
 */
public interface IConexion {
        Connection crearConexion() throws SQLException;

}
