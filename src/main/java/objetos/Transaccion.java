/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.sql.Timestamp;


/**
 *
 * @author fabri
 */
public class Transaccion {
    private String formatoTipoTransaccion;
    private int id_transaccion;
    private Timestamp fechahora_transaccion;
    private boolean tipo_transaccion;
    private int cantidad;
    private Cuenta cuenta;

    public Transaccion(int id_transaccion, Timestamp fechahora_transaccion, boolean tipo_transaccion, int cantidad, Cuenta cuenta) {
        this.id_transaccion = id_transaccion;
        this.fechahora_transaccion=fechahora_transaccion;
        this.tipo_transaccion = tipo_transaccion;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
    }

    public Transaccion(Timestamp fechahora_transaccion, String formatoTipoTransaccion, int cantidad) {
        this.fechahora_transaccion = fechahora_transaccion;
        this.formatoTipoTransaccion = formatoTipoTransaccion;
        this.cantidad = cantidad;
    }

    public Transaccion() {
    }

    public Transaccion(Timestamp fechahora_transaccion, boolean tipo_transaccion, int cantidad, Cuenta cuenta) {
       this.fechahora_transaccion=fechahora_transaccion;
        this.tipo_transaccion = tipo_transaccion;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
    }

    public Transaccion(boolean tipo_transaccion, int cantidad, Cuenta cuenta) {
        this.tipo_transaccion = tipo_transaccion;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
    }



    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public Timestamp getFechahora_transaccion() {
        return fechahora_transaccion;
    }

    public void setFechahora_transaccion(Timestamp fechahora_transaccion) {
        this.fechahora_transaccion = fechahora_transaccion;
    }

   

    public boolean isTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(boolean tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String getFormatoTipoTransaccion() {
        return formatoTipoTransaccion;
    }

    public void setFormatoTipoTransaccion(String formatoTipoTransaccion) {
        this.formatoTipoTransaccion = formatoTipoTransaccion;
    }

    @Override
    public String toString() {
        return "\nTransaccion: " + formatoTipoTransaccion  + "\nFecha: " + fechahora_transaccion + "\nCantidad: " + cantidad + "\n";
    }

   

   
    
    
    
    


    
    

}
