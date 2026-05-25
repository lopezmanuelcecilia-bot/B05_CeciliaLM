package org.example.repository;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Clase encargada de guardar eventos generados durante la simulación.
 * En archivo de texto.
 */
public class EventosR {

    private static final String ARCHIVO_EVENTOS = "eventos.txt";

    public void guardarEvento(String evento) {

        try (FileWriter writer = new FileWriter(ARCHIVO_EVENTOS, true)) {

            writer.write(evento + "\n");

        } catch (IOException e) {

            System.out.println("No se pudo guardar el evento.");
        }
    }
}