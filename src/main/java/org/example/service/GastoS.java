package org.example.service;

/*
 * Gastos operativos del parque.
 */
public class GastoS {

    private double gastosTotales;

    public GastoS() {
        gastosTotales = 0;
    }

    public void registrarGasto(String concepto, double monto) {
        gastosTotales += monto;

        System.out.println("---------------------------------");
        System.out.println("Monto registrado: " + concepto);
        System.out.println("Monto: $" + monto);
        System.out.println("Montos acumulados: $" + gastosTotales);
    }

    public void mostrarGastos() {
        System.out.println("$ GASTOS DEL PARQUE $");
        System.out.println("Total de monto: $" + gastosTotales);
    }
}