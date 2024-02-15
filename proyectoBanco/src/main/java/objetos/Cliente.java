/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.sql.Date;

/**
 *
 * @author fabri
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String calle;
    private String colonia;
    private String codigo_postal;
    private Date fecha_nacimiento;
    private String passw;
    private int edad;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido_paterno, String apellido_materno, String calle, String colonia, String codigo_postal, Date fecha_nacimiento, String passw, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.calle = calle;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
        this.fecha_nacimiento = fecha_nacimiento;
        this.passw = passw;
        this.edad = edad;
    }

    public Cliente(String nombre, String apellido_paterno, String apellido_materno, String calle, String colonia, String codigo_postal, Date fecha_nacimiento, String passw, int edad) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.calle = calle;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
        this.fecha_nacimiento = fecha_nacimiento;
        this.passw = passw;
        this.edad = edad;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", calle=" + calle + ", colonia=" + colonia + ", codigo_postal=" + codigo_postal + ", fecha_nacimiento=" + fecha_nacimiento + ", passw=" + passw + ", edad=" + edad + '}';
    }

   


}
