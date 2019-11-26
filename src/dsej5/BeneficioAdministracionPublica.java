package dsej5;

public class BeneficioAdministracionPublica implements IEstrategiaBeneficios {

    @Override
    public double obtenerBeneficioImporte(double monto) {
        return monto/2;
    }

    @Override
    public void aplicarBeneficio(Credito credito) {
        
    }
}
