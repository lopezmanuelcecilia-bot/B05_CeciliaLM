package org.example;

import org.example.model.Dinosaurio;

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
    }
}