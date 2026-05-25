# B05_CeciliaLM
# Parque Turístico de Dinosaurios

## Descripción 

Este proyecto consiste en una simulación de un parque turístico de dinosaurios desarrollada en Java 17 utilizando Maven.

---

## Objetivo

Se buscó implementar:

- Lógica básica de negocio.
- Simulación de eventos aleatorios.
- Organización modular del código.
- Uso de servicios y modelos.
- Manejo de Git y GitHub.
- Estructuración del proyecto con Maven.

---

## Tecnologías utilizadas

- Java 17
- Maven
- IntelliJ IDEA
- Git
- GitHub

---

## Funciones implementadas

- Registro y visualización de dinosaurios.
- Registro básico de turistas.
- Registro de empleados del parque.
- Sistema de zonas y control de visitantes.
- Venta básica de boletos.
- Registro simple de gastos operativos.
- Monitoreo general del parque.
- Alimentación de dinosaurios.
- Simulación de eventos aleatorios.
- Configuración mediante application.properties.
- Organización modular utilizando paquetes y servicios.
---

## Eventos implementados

Durante la ejecución de la simulación pueden ocurrir distintos eventos aleatorios, entre ellos:

- Tormentas.
- Fallas eléctricas.
- Descuentos en tiendas.
- Acceso gratuito a zonas especiales.
- Incidentes dentro de los recintos.

Generando un omportamiento más dinámico dentro del sistema.

---

## Estructura del proyecto

```text
## Estructura del proyecto

```text
src/main/java/org/example
│
├── model
│   ├── Dinosaurio
│   ├── Turista
│   ├── Zona
│   └── Empleado
│
├── service
│   ├── ParqueService
│   ├── MonitorService
│   └── GastoService
│
├── events
│   └── EventoService
│
├── repository
│   └── EventosR
│
├── config
│   └── ConfigService
│
└── utils
```
```

---

## Ejecución del proyecto

1. Abrir el proyecto en IntelliJ IDEA.
2. Esperar a que Maven cargue las dependencias.
3. Ejecutar la clase `Main.java`.
4. Observar la simulación desde consola.

---

## Funcionamiento

Durante la ejecución se muestran:

- Datos de dinosaurios.
- Información de turistas.
- Estado de las zonas.
- Venta de boletos.
- Eventos aleatorios.
- Monitoreo general del parque.

---

## Conclusión
* Este proyecto ayudó a entender mejor cómo organizar un programa grande en Java utilizando diferentes clases y paquetes.
* La simulación del parque permitió trabajar de una forma más práctica y creativa con conceptos vistos durante el curso.
* También sirvió para aprender a manejar mejor herramientas como GitHub y Maven durante el desarrollo del proyecto.
* Los eventos aleatorios y las distintas zonas del parque hicieron que el sistema se sintiera más dinámico e interesante durante la ejecución.
* En general, el proyecto permitió reforzar conocimientos de programación mientras se desarrollaba una simulación funcional y más cercana a un entorno real.
