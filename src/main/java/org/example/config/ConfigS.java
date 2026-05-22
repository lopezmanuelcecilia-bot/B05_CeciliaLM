package org.example.config;

import java.io.InputStream;
import java.util.Properties;

/*
 * Lee configuraciones desde el archivo application.properties.
 */
public class ConfigS {

    private Properties properties;

    public ConfigS() {

        properties = new Properties();

        try {
            InputStream archivo = getClass()
                    .getClassLoader()
                    .getResourceAsStream("application.properties");

            if (archivo != null) {
                properties.load(archivo);
            } else {
                System.out.println("No se encontró el archivo application.properties.");
            }

        } catch (Exception e) {
            System.out.println("Error al cargar configuraciones.");
        }
    }

    public String obtenerPropiedad(String clave) {
        return properties.getProperty(clave);
    }
}