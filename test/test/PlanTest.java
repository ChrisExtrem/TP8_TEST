/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dsej5.Plan;
import dsej5.PlanCuotaAdelantada;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PlanTest {
    
    public PlanTest() {
    }

    @Test
    public void testCalcularInteres() {
        Plan plan =  new PlanCuotaAdelantada();
        plan.setCuotas(3);
        plan.setInteres(.10d);
        double esperado = 30d;
        double actual = plan.calcularInteres(100d);
        
        assertEquals(esperado,actual,0.15d);
    }
    
}
