package org.example.service;

/*
 * Operaciones generales del parque.
 */
public class ParqueService {

    // Dinero acumulado por venta de boletos
    private double ingresosTotales;

    public ParqueService() {
        ingresosTotales = 0;
    }

    /*
     * Venta de un boleto. (Simulacion)
     */
    public void venderBoleto(String nombreTurista, double precio) {

        ingresosTotales += precio;

        System.out.println("---------------------------------");
        System.out.println("Boleto vendido a: " + nombreTurista);
        System.out.println("Precio del boleto: $" + precio);
        System.out.println("Ingresos actuales: $" + ingresosTotales);
    }

    /*
     * Ingresos generales del parque.
     */
    public void mostrarIngresos() {

        System.out.println("+++ INGRESOS DEL PARQUE +++");
        System.out.println("Total acumulado: $" + ingresosTotales);
    }
}