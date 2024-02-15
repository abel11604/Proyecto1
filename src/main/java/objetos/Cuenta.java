/**
 * Clase creada el 02/
 */
package objetos;

import java.sql.Date;

/**
 *
 * @author fabri
 */
public class Cuenta {

    private String idCuenta;
    private Date fechaApertura;
    private int saldo;
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(String idCuenta, Date fechaApertura, int saldo, Cliente cliente) {
        this.idCuenta = idCuenta;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.cliente = cliente;
    }

   

    public Cuenta(Date fechaApertura, int saldo, Cliente cliente) {
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }


    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return  "  $" + saldo;
        //return "Cuenta{" + "idCuenta=" + idCuenta + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    

}
