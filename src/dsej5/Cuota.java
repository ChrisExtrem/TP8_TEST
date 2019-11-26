package dsej5;

import java.util.Calendar;
import java.util.Date;

public class Cuota {
    
    private int numero;

    private double importe;

    private Date vencimiento;

    private double saldo;

    public Cuota(int numero, double importe) {
        this.numero = numero;
        this.importe = importe;
        this.vencimiento = calcularVencimiento(numero);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
    
    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void pagar(double monto){
        saldo -= monto;
    }
    
    private Date calcularVencimiento(int numero){
        Date actual = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actual);
        calendar.add(Calendar.MONTH, numero);
        return calendar.getTime();
    }
}
