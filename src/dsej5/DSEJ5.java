
package dsej5;

public class DSEJ5 {


    public static void main(String[] args) {
        PlanCuotaAdelantada p1 = new PlanCuotaAdelantada();
        p1.setCodigo(1);
        p1.setCuotas(3);
        p1.setDescripcion("Plan Cuota Adelantada");
        p1.setInteres(0.05);
        
        PlanCuotaVencida p2 = new PlanCuotaVencida();
        p2.setCodigo(1);
        p2.setCuotas(3);
        p2.setDescripcion("Plan Cuota Vencida");
        p2.setInteres(0.075);
        p2.setGastosAdministrativos(0.02);
        
        Cliente c = new Cliente();
        c.setTipoCliente(TipoCliente.Particular);
        
        Credito cr = new Credito();
        cr.agregarCliente(c);
        cr.calcular(p2, 5000);
        
         System.out.println("Saldo: " + cr.getTotalEntregar()); 
    }
}
