               package dsej5;
import java.util.ArrayList;
import java.util.Date;

public class Credito {
    
    private Date fecha;

    private int numero;
    
    private double monto; //solicitado
    
    private double interes;
    
    private double deducciones;

    private double beneficios;
        
    private Plan plan;
    
    private Cliente cliente;

    private ArrayList<Cuota> cuotas;

    public Credito() {
        cuotas = new ArrayList<>();
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public double getInteres() {
        return interes;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double getBeneficios() {
        return beneficios;
    }
    
    public void agregarCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }
    
    public void calcular(Plan plan, double importe){
        this.plan = plan;
        monto = importe;
        interes = plan.calcularInteres(importe);
        double total = interes + importe;
        double importeCuota = total / plan.getCuotas();
        for(int i=1;i<=plan.getCuotas();i++){
            cuotas.add(new Cuota(i,importeCuota));
        }
        deducciones = plan.calcularDeducciones(this);
        beneficios = plan.calcularYEstablecerBeneficios(this);
    }
    
    public double getTotalEntregar(){
        return monto - deducciones + beneficios;
    }
}
