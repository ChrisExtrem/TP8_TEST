/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dsej5.BeneficioAdministracionPublica;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class BeneficioAdministracionPublicaTest {
    
    public BeneficioAdministracionPublicaTest() {
    }

    @Test
    public void testObtenerBeneficioImporte() {
        BeneficioAdministracionPublica benef = new BeneficioAdministracionPublica();
        double actual = benef.obtenerBeneficioImporte(100);
        double esperado = 50d;
        
        assertEquals(esperado,actual,0.15d);
    }
    
}
