# Conexion Tester UI BD

Aplicación de escritorio en Java (Swing) para probar una conexión a una base de datos con JDBC. El usuario escribe la URL, el usuario y la contraseña, pulsa **Probar conexión** y ve el resultado: **verde** si se conectó y **rojo** si hubo un error.

Proyecto de la actividad **EA3. Incorporando UI y BD** (Programación Orientada a Objetos II).

## Tecnologías

Java 21, Maven, Swing, JDBC y SQLite (driver `sqlite-jdbc`).

## Clases

| Clase | Qué hace |
| --- | --- |
| `MainUI` | Arranca la aplicación. |
| `ConexionTester` | La ventana: campos, botón y área de resultados. |
| `ConexionBD` | Abre la conexión con `DriverManager` y la cierra con `try-with-resources`. |

## Cómo ejecutarlo

1. Clonar el repositorio y abrirlo en IntelliJ IDEA.
2. Esperar a que Maven descargue el driver (o usar **Reload All Maven Projects**).
3. Ejecutar la clase `MainUI`.

## Cómo usarlo

Con la URL por defecto `jdbc:sqlite:inventario.db` y el usuario y la contraseña vacíos, la conexión es exitosa. Con una ruta que no existe, como `jdbc:sqlite:/carpeta/que/no/existe/inventario.db`, se muestra el error en rojo.

## Ramas

`main` (estable), `dev` (integración) y una rama `feature/*` por cada funcionalidad.

## Autores

Yenni Vanessa Delgado Velasco

Docente: Jorge Armando Julio Cruz · Institución Universitaria Digital de Antioquia, 2026
