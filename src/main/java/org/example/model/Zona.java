package org.example.model;

/*
    Una zona dentro del parque.
 * Cada zona tiene nombre y capacidad máxima.
 */
public class Zona {

    private String nombre;
    private int capacidadMaxima;
    private int visitantesActuales;

    public Zona(String nombre, int capacidadMaxima) {

        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.visitantesActuales = 0;
    }

    /*
     * Permite ingresar visitantes.
     */
    public void ingresarVisitante() {

        if (visitantesActuales < capacidadMaxima) {

            visitantesActuales++;

            System.out.println("Un visitante ingresó a la zona: " + nombre);

        } else {

            System.out.println("La zona está llena.");
        }
    }

    /*
     * Información básica de la zona.
     */
    public void mostrarEstadoZona() {

        System.out.println("===== ZONA =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println("Visitantes actuales: " + visitantesActuales);
    }
}