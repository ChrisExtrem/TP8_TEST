/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dsej5.Cliente;
import dsej5.Credito;
import dsej5.Plan;
import dsej5.PlanCuotaAdelantada;
import dsej5.PlanCuotaVencida;
import dsej5.TipoCliente;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class CreditoTest {
    
    public CreditoTest() {
    }

    @Test
    public void testGetTotalEntregar() {
        //Necesario
        PlanCuotaVencida p2 = new PlanCuotaVencida();
        p2.setCodigo(1);
        p2.setCuotas(3);
        p2.setDescripcion("Plan Cuota Vencida");
        p2.setInteres(0.075);
        p2.setGastosAdministrativos(0.02);
        Credito cred = new Credito();
        cred.calcular(p2, 5000);
        
        double esperado = 4900d;
        double actual = cred.getTotalEntregar();
        assertEquals(esperado,actual,0.15d);
    }
    
}
