/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.interfaces;

import dao.excepciones.PersistenciaException;
import objetos.Cliente;

/**
 *
 * @author fabri
 */
public interface ICliente {

    Cliente registrarCliente(Cliente cliente) throws PersistenciaException;

    Cliente editarCliente(Cliente cliente)throws PersistenciaException;

    Cliente eliminarCliente(Cliente cliente)throws PersistenciaException;

    Cliente buscarCliente(int id)throws PersistenciaException;
}
