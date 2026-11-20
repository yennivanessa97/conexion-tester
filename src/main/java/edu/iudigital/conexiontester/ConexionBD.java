package edu.iudigital.conexiontester;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * ConexionBD.java
 * Se encarga únicamente de probar una conexión JDBC. No conoce la interfaz gráfica.
 */
public class ConexionBD {

    private static final String DRIVER_SQLITE = "org.sqlite.JDBC";

    /**
     * Intenta abrir una conexión con los datos recibidos y la cierra de inmediato.
     *
     * @return texto con el nombre y la versión de la base de datos si la conexión fue exitosa
     * @throws ClassNotFoundException si el driver no está disponible
     * @throws SQLException           si la URL o las credenciales no permiten conectar
     */
    public String probarConexion(String url, String usuario, String clave)
            throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER_SQLITE);
        try (Connection conexion = DriverManager.getConnection(url, usuario, clave)) {
            return conexion.getMetaData().getDatabaseProductName()
                    + " " + conexion.getMetaData().getDatabaseProductVersion();
        }
    }
}