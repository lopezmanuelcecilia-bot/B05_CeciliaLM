package org.example.model;

/*
 * Representa a un turista dentro del parque.
 */
public class Turista {

    private String nombre;
    private int edad;
    private boolean tieneBoleto;

    public Turista(String nombre, int edad, boolean tieneBoleto) {
        this.nombre = nombre;
        this.edad = edad;
        this.tieneBoleto = tieneBoleto;
    }

    public void mostrarInformacion() {
        System.out.println("***** TURISTA *****");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Tiene boleto: " + tieneBoleto);
    }
}