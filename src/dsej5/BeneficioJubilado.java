package dsej5;

public class BeneficioJubilado implements IEstrategiaBeneficios {

    @Override
    public double obtenerBeneficioImporte(double monto) {
       return monto*0.75;
    }

    @Override
    public void aplicarBeneficio(Credito credito) {
        Cuota cuota =credito.getCuotas().get(credito.getPlan().getCuotas()-1);
        cuota.pagar(cuota.getImporte()/2);
    }
}
