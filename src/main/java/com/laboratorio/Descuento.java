package com.laboratorio;

public class Descuento {

    public double calcularPrecioFinal(double precio, double descuento) {
        return precio - (precio * descuento / 100.0);
    }
}