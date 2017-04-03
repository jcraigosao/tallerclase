
package Punto2;

import java.util.Date;

public class Movimiento {
    private Date fecha;
    private double saldo_anterior;
    private double cantidad;

    public Movimiento(Date fecha, double saldo_anterior, double cantidad) {
        this.fecha = fecha;
        this.saldo_anterior = saldo_anterior;
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldo_anterior() {
        return saldo_anterior;
    }

    public void setSaldo_anterior(double saldo_anterior) {
        this.saldo_anterior = saldo_anterior;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
