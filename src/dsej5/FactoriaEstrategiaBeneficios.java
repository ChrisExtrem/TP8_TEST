package dsej5;

public class FactoriaEstrategiaBeneficios {
    private static FactoriaEstrategiaBeneficios _instance;
    
    protected FactoriaEstrategiaBeneficios()
    {
        
    }
    
    public static synchronized FactoriaEstrategiaBeneficios getInstance(){
        if(_instance == null)
        {
            _instance = new FactoriaEstrategiaBeneficios();
        }
        return _instance;
    }
    
    public IEstrategiaBeneficios getEstrategia(Cliente cliente){
        try {
            return  (IEstrategiaBeneficios)Class.forName("dsej5.Beneficio"+cliente.getTipoCliente().toString()).newInstance();
        } catch (Exception ex) {
            return new BeneficioParticular();
        }
    }
}
