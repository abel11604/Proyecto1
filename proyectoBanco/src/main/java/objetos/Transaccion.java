/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author fabri
 */
public class Transaccion {

    private int id_transaccion;
    private Date fecha_transaccion;
    private Time hora_transaccion;
    private boolean tipo_transaccion;
    private int cantidad;
    private Cuenta cuenta;

    public Transaccion(int id_transaccion, Date fecha_transaccion, Time hora_transaccion, boolean tipo_transaccion, int cantidad, Cuenta cuenta) {
        this.id_transaccion = id_transaccion;
        this.fecha_transaccion = fecha_transaccion;
        this.hora_transaccion = hora_transaccion;
        this.tipo_transaccion = tipo_transaccion;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
    }

    public Transaccion() {
    }

    public Transaccion(Date fecha_transaccion, Time hora_transaccion, boolean tipo_transaccion, int cantidad, Cuenta cuenta) {
        this.fecha_transaccion = fecha_transaccion;
        this.hora_transaccion = hora_transaccion;
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

    public Date getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(Date fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    public Time getHora_transaccion() {
        return hora_transaccion;
    }

    public void setHora_transaccion(Time hora_transaccion) {
        this.hora_transaccion = hora_transaccion;
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

    @Override
    public String toString() {
        return "Transaccion{" + "id_transaccion=" + id_transaccion + ", fecha_transaccion=" + fecha_transaccion + ", hora_transaccion=" + hora_transaccion + ", tipo_transaccion=" + tipo_transaccion + ", cantidad=" + cantidad + ", cuenta=" + cuenta + '}';
    }
    
    
    
    


    
    

}
