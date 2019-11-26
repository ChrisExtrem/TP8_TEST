package dsej5;

public class PlanCuotaVencida extends Plan {
    
    private double gastosAdministrativos;

    public double getGastosAdministrativos() {
        return gastosAdministrativos;
    }

    public void setGastosAdministrativos(double gastosAdministrativos) {
        this.gastosAdministrativos = gastosAdministrativos;
    }

    @Override
    public double calcularDeducciones(Credito credito) {
        return credito.getMonto() * gastosAdministrativos;
    }

    @Override
    public double calcularYEstablecerBeneficios(Credito credito) {
       IEstrategiaBeneficios estrategia = obtenerEstrategiaBeneficios(credito.getCliente());
       double importe = estrategia.obtenerBeneficioImporte(credito.getDeducciones());
       estrategia.aplicarBeneficio(credito);
       return importe;
    }
}
