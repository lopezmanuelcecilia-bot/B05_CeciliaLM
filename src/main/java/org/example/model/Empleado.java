package org.example.model;

/*
 * Empleado
 */
public class Empleado {

    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {

        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void mostrarInformacion() {

        System.out.println("!! EMPLEADO !!");
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
    }
}