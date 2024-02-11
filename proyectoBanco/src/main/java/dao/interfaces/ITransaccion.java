/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.interfaces;

import objetos.Transaccion;

/**
 *
 * @author fabri
 */
public interface ITransaccion {
    
    Transaccion registrarTransaccion(Transaccion t);
    Transaccion editarTransaccion(Transaccion t);
    Transaccion eliminarTransaccion(Transaccion t);
    Transaccion verTransaccion(int id);
    
}
