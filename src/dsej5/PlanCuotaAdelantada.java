package dsej5;

public class PlanCuotaAdelantada extends Plan {

    @Override
    public double calcularDeducciones(Credito credito) {
        Cuota cuota = credito.getCuotas().get(0);
        cuota.pagar(cuota.getImporte());
        return cuota.getImporte();
    }

    @Override
    public double calcularYEstablecerBeneficios(Credito credito) {
       IEstrategiaBeneficios estrategia = obtenerEstrategiaBeneficios(credito.getCliente());
       Cuota cuota = credito.getCuotas().get(0);
       double importe = estrategia.obtenerBeneficioImporte(cuota.getImporte());
       estrategia.aplicarBeneficio(credito);
       return importe;
    }
}
