package dsej5;

public abstract class Plan {

    private int codigo;
    
    private String descripcion;
    
    private int cuotas;

    private double interes;

    protected IEstrategiaBeneficios obtenerEstrategiaBeneficios(Cliente cliente){
        return FactoriaEstrategiaBeneficios.getInstance().getEstrategia(cliente);
    }
    
    public abstract double calcularDeducciones(Credito credito);
    public abstract double calcularYEstablecerBeneficios(Credito credito);
        
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public double calcularInteres(double importe){
        return cuotas * interes * importe;
    }
}
