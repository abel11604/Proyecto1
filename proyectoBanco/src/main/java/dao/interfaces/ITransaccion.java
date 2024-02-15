/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.interfaces;

import dao.excepciones.PersistenciaException;
import objetos.Transaccion;

/**
 *
 * @author fabri
 */
public interface ITransaccion {
    
    Transaccion registrarTransaccion(Transaccion t)throws PersistenciaException;
    Transaccion editarTransaccion(Transaccion t)throws PersistenciaException;
    Transaccion eliminarTransaccion(Transaccion t)throws PersistenciaException;
    Transaccion verTransaccion(int id)throws PersistenciaException;
    
}
