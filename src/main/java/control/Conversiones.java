/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import objetos.Cuenta;
/**
 *
 * @author abelc
 */
public class Conversiones {
 public DefaultComboBoxModel<String> cuentasComboBoxModel(List<Cuenta> listaCuentas) {
    DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

    for (Cuenta cuenta : listaCuentas) {
        comboBoxModel.addElement(cuenta.getIdCuenta()); 
    }
    
    return comboBoxModel;
}
}
