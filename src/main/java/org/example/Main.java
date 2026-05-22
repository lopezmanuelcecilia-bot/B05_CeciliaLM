package org.example;

import org.example.model.Dinosaurio;
import org.example.model.Turista;
import org.example.model.Zona;
import org.example.service.ParqueService;
import org.example.events.EventoService;

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
                "Alo",
                "Alosaurio",
                100,
                true
        );

        // Mostrar información
        rex.mostrarInformacion();

        Turista turista = new Turista("Elvira", 34, true);
        turista.mostrarInformacion();

        Zona recintoCentral = new Zona("Recinto C", 5);

        recintoCentral.ingresarVisitante();
        recintoCentral.ingresarVisitante();

        recintoCentral.mostrarEstadoZona();

        ParqueService parqueService = new ParqueService();

        parqueService.venderBoleto("Elvira", 60.0);
        parqueService.venderBoleto("Victor", 60.0);

        parqueService.mostrarIngresos();

        EventoService eventoService = new EventoService();

        System.out.println("\n`` EVENTOS DEL PARQUE ``");

        eventoService.generarEvento();
        eventoService.generarEvento();
        eventoService.generarEvento();
    }
}