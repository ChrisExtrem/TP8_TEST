/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dsej5.BeneficioParticular;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class BeneficioParticularTest {
    
    public BeneficioParticularTest() {
    }

    @Test
    public void testObtenerBeneficioImporte() {
        BeneficioParticular benef = new BeneficioParticular();
        double actual = benef.obtenerBeneficioImporte(100d);
        double esperado = 0;
        
        assertEquals(esperado,actual,0.15d);
    }
    
}
