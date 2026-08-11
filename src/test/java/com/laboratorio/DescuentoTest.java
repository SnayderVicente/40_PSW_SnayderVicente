package com.laboratorio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoTest {

    @Test
    void testCalcularPrecioFinal() {
        Descuento d = new Descuento();

        assertEquals(90.0, d.calcularPrecioFinal(100, 10), 0.001);
        assertEquals(160.0, d.calcularPrecioFinal(200, 20), 0.001);
        assertEquals(50.0, d.calcularPrecioFinal(50, 0), 0.001);
        assertEquals(250.0, d.calcularPrecioFinal(500, 50), 0.001);

        assertEquals(0.0, d.calcularPrecioFinal(200, 100), 0.001);
    }
}