package org.example;

import org.example.model.Dinosaurio;
import org.example.model.Turista;
import org.example.model.Zona;
import org.example.service.ParqueService;

/*
 * Clase principal del sistema
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("***********************************");
        System.out.println(" PARQUE TURÍSTICO DE DINOSAURIOS 🦕");
        System.out.println("***********************************");

        // Dinosaurio de prueba
        Dinosaurio rex = new Dinosaurio(
                "Rex",
                "Tyrannosaurus Rex",
                80,
                true
        );

        // Mostrar información
        rex.mostrarInformacion();

        Turista turista = new Turista("Ana", 24, true);
        turista.mostrarInformacion();

        Zona recintoCentral = new Zona("Recinto Central", 5);

        recintoCentral.ingresarVisitante();
        recintoCentral.ingresarVisitante();

        recintoCentral.mostrarEstadoZona();

        ParqueService parqueService = new ParqueService();

        parqueService.venderBoleto("Ana", 45.0);
        parqueService.venderBoleto("Luis", 45.0);

        parqueService.mostrarIngresos();
    }
}