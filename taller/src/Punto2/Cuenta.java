
package Punto2;

import java.util.ArrayList;
import java.util.Date;


public class Cuenta {
    private int numerocuenta;
    private double saldoactual;
    private Date fechadecreacion;
    private String nombrecliente;
    private ArrayList <Movimiento> mouvements;

    public Cuenta(int numerocuenta, double saldoactual, Date fechadecreacion, String nombrecliente, ArrayList<Movimiento> mouvements) {
        this.numerocuenta = numerocuenta;
        this.saldoactual = saldoactual;
        this.fechadecreacion = fechadecreacion;
        this.nombrecliente = nombrecliente;
        this.mouvements = new ArrayList <>();
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double soldecourant) {
        this.saldoactual = soldecourant;
    }

    public Date getFechadecreacion() {
        return fechadecreacion;
    }

    public void setFechadecreacion(Date fechadecreacion) {
        this.fechadecreacion = fechadecreacion;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public ArrayList<Movimiento> getMouvements() {
        return mouvements;
    }

    public void setMouvements(ArrayList<Movimiento> mouvements) {
        this.mouvements = mouvements;
    }

    
}