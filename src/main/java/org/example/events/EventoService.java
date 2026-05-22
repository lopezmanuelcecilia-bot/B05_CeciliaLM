package org.example.events;

import java.util.Random;

/*
 * Eventos aleatorios
 */
public class EventoService {

    private Random random;

    public EventoService() {
        random = new Random();
    }

    /*
     * Eventos
     */
    public void generarEvento() {

        int numeroEvento = random.nextInt(8);

        switch (numeroEvento) {

            case 0:
                System.out.println("EVENTO: Lluvia fuerte en el parque.");
                break;

            case 1:
                System.out.println("EVENTO: Falla eléctrica.");
                break;

            case 2:
                System.out.println("EVENTO: Dinosaurio escapó.");
                break;

            case 3:
                System.out.println("EVENTO: Descuento especial en la tienda.");
                break;

            case 4:
                System.out.println("EVENTO: Vehículo detenido por mantenimiento.");
                break;

            case 5:
                System.out.println("EVENTO: Ruidos extraños cerca de la fuente.");
                break;

            case 6:
                System.out.println("EVENTO: Acceso gratuito al mirador.");
                break;

            case 7:
                System.out.println("EVENTO: Un dinosaurio fue averiado.");
                break;

            default:
                System.out.println("No ocurrió ningún evento.");
        }
    }
}