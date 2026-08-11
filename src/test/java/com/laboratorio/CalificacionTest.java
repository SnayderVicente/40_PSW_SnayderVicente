package com.laboratorio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {

    @Test
    void testCalcularPromedio() {
        Calificacion c = new Calificacion();
        assertEquals(15.0, c.calcularPromedio(15, 14, 16), 0.001);
        assertEquals(12.0, c.calcularPromedio(10, 12, 14), 0.001);
        assertEquals(18.0, c.calcularPromedio(20, 18, 16), 0.001);
    }

    @Test
    void testEstaAprobado() {
        Calificacion c = new Calificacion();
        assertTrue(c.estaAprobado(15));
        assertTrue(c.estaAprobado(13)); 
        assertFalse(c.estaAprobado(12));
        assertFalse(c.estaAprobado(5));
    }

    @Test
    void testEstaAprobadoLimiteInferior() {
        Calificacion c = new Calificacion();
        assertFalse(c.estaAprobado(12.99));
    }
}