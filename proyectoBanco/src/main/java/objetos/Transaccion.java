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

    int id_transaccion;
    Date fecha_transaccion;
    Time hora_transaccion;
    boolean es_cliente;
    int cantidad;
    int id_cuenta;

    public Transaccion(int id_transaccion, Date fecha_transaccion, Time hora_transaccion, boolean es_cliente, int cantidad, int id_cuenta) {
        this.id_transaccion = id_transaccion;
        this.fecha_transaccion = fecha_transaccion;
        this.hora_transaccion = hora_transaccion;
        this.es_cliente = es_cliente;
        this.cantidad = cantidad;
        this.id_cuenta = id_cuenta;
    }

    public Transaccion(Date fecha_transaccion, Time hora_transaccion, boolean es_cliente, int cantidad, int id_cuenta) {
        this.fecha_transaccion = fecha_transaccion;
        this.hora_transaccion = hora_transaccion;
        this.es_cliente = es_cliente;
        this.cantidad = cantidad;
        this.id_cuenta = id_cuenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public boolean isEs_cliente() {
        return es_cliente;
    }

    public void setEs_cliente(boolean es_cliente) {
        this.es_cliente = es_cliente;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "id_transaccion=" + id_transaccion + ", fecha_transaccion=" + fecha_transaccion + ", hora_transaccion=" + hora_transaccion + ", es_cliente=" + es_cliente + ", id_cuenta=" + id_cuenta + '}';
    }
    
    
    
    
    
    
    

}
