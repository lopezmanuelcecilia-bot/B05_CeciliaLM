package org.example.model;

/*
 * Se representa un dinosaurio dentro del parque.
 * Aquí se almacenan sus datos principales.
 */
public class Dinosaurio {

    // Nombre del dinosaurio
    private String nombre;

    // Tipo de dinosaurio
    private String especie;

    // Nivel de hambre del dinosaurio
    private int nivelHambre;

    // Estado actual del dinosaurio
    private boolean peligroso;

    /*
     * Nuevos dinosaurios.
     */
    public Dinosaurio(String nombre, String especie, int nivelHambre, boolean peligroso) {

        this.nombre = nombre;
        this.especie = especie;
        this.nivelHambre = nivelHambre;
        this.peligroso = peligroso;
    }

    //Nivel de hambre
    public void alimentar() {

        nivelHambre -= 20;

        // Evita valores negativos
        if (nivelHambre < 0) {
            nivelHambre = 0;
        }

        System.out.println(nombre + " fue alimentado.");
        System.out.println("Nivel de hambre actual: " + nivelHambre);
    }

    // Información del dinosaurio
    public void mostrarInformacion() {

        System.out.println("-- DINOSAURIO --");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Nivel de hambre: " + nivelHambre);
        System.out.println("¿Es peligroso?: " + peligroso);
    }
}