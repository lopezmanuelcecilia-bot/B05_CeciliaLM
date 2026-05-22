package org.example.service;

/*
 * Estado general del parque.
 */
public class MonitorS {

    public void mostrarEstadoParque(
            int turistas,
            int dinosaurios,
            int energiaDisponible,
            int eventosActivos
    ) {

        System.out.println("\n MONITOREO DEL PARQUE 🔴🔴🔴");

        System.out.println("Turistas activos: " + turistas);
        System.out.println("Dinosaurios registrados: " + dinosaurios);
        System.out.println("Energía disponible: " + energiaDisponible + "%");
        System.out.println("Eventos activos: " + eventosActivos);

        System.out.println("================================");
    }
}
