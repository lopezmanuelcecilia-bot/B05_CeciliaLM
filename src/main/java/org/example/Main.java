package org.example;

import org.example.model.Dinosaurio;
import org.example.model.Turista;
import org.example.model.Zona;

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

    }
}