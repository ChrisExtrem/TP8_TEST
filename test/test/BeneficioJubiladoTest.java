/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dsej5.BeneficioJubilado;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class BeneficioJubiladoTest {
    
    public BeneficioJubiladoTest() {
    }
    
    @Test
    public void testObtenerBeneficioImporte() {
        BeneficioJubilado benef = new BeneficioJubilado();
        double recibido = benef.obtenerBeneficioImporte(100);
        double esperado = 75d;
        assertEquals(recibido,esperado,0.5);
    }
    
}
