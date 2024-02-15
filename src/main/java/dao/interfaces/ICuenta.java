/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.interfaces;

import dao.excepciones.PersistenciaException;
import objetos.Cuenta;

/**
 *
 * @author fabri
 */
public interface ICuenta {
    Cuenta registrarCuenta(Cuenta cuenta)throws PersistenciaException;
    Cuenta editarCuenta(Cuenta cuenta)throws PersistenciaException;
    Cuenta eliminarCuenta(Cuenta cuenta)throws PersistenciaException;
    Cuenta buscarCuenta(int id)throws PersistenciaException;
}
