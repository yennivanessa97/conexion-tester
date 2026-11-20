package edu.iudigital.conexiontester;

import javax.swing.*;

/**
 * MainUI.java
 * Punto de entrada de la aplicación.
 */
public class MainUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ConexionTester().setVisible(true));
    }
}