package org.example;

import org.example.model.Dinosaurio;
import org.example.model.Turista;
import org.example.model.Zona;
import org.example.service.GastoS;
import org.example.service.ParqueService;
import org.example.events.EventoService;
import org.example.config.ConfigS;
import org.example.model.Empleado;
import org.example.service.GastoS;

/*
 * Clase principal del sistema
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("***********************************");
        System.out.println(" PARQUE TURÍSTICO DE DINOSAURIOS 🦕");
        System.out.println("***********************************");

        ConfigS config = new ConfigS();

        System.out.println("Nombre del parque: "
                + config.obtenerPropiedad("parque.nombre"));

        System.out.println("Capacidad máxima: "
                + config.obtenerPropiedad("parque.capacidad"));

        System.out.println();

        // Dinosaurio de prueba
        Dinosaurio rex = new Dinosaurio(
                "Alo",
                "Alosaurio",
                10,
                true
        );

        // Mostrar información
        rex.mostrarInformacion();
        System.out.println("\nAlimentando dinosaurio...\n");

        rex.alimentar();

        System.out.println();

        rex.mostrarInformacion();

        Turista turista = new Turista("Elvira", 34, true);
        turista.mostrarInformacion();

        Zona recintoCentral = new Zona("Recinto C", 5);

        recintoCentral.ingresarVisitante();
        recintoCentral.ingresarVisitante();

        Empleado empleado = new Empleado(
                "Victor",
                "Empleado de Caja 1"
        );
        GastoS gastoS = new GastoS();

        gastoS.registrarGasto("Mantenimiento de la planta de energía ", 200.0);
        gastoS.registrarGasto("Revisión de vehículos ", 80.0);
        gastoS.mostrarGastos();
        System.out.println();
        empleado.mostrarInformacion();

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