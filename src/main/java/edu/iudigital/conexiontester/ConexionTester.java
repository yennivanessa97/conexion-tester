package edu.iudigital.conexiontester;

import javax.swing.*;
import java.awt.*;

/**
 * ConexionTester.java
 * Ventana principal para probar una conexión JDBC.
 */
public class ConexionTester extends JFrame {

    private final JTextField campoUrl = new JTextField("jdbc:sqlite:inventario.db");
    private final JTextField campoUsuario = new JTextField();
    private final JPasswordField campoClave = new JPasswordField();
    private final JButton botonProbar = new JButton("Probar conexión");
    private final JTextArea areaResultado = new JTextArea();

    public ConexionTester() {
        super("Probador de conexión JDBC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        add(construirPanelSuperior(), BorderLayout.NORTH);
        add(construirPanelCentral(), BorderLayout.CENTER);
        setSize(640, 420);
        setLocationRelativeTo(null);
    }

    private JPanel construirPanelSuperior() {
        JPanel formulario = new JPanel(new GridLayout(3, 2, 8, 8));
        formulario.add(new JLabel("URL de conexión"));
        formulario.add(campoUrl);
        formulario.add(new JLabel("Usuario"));
        formulario.add(campoUsuario);
        formulario.add(new JLabel("Contraseña"));
        formulario.add(campoClave);

        JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        botones.add(botonProbar);

        JPanel superior = new JPanel(new BorderLayout(8, 8));
        superior.setBorder(BorderFactory.createEmptyBorder(12, 12, 0, 12));
        superior.add(formulario, BorderLayout.CENTER);
        superior.add(botones, BorderLayout.SOUTH);
        return superior;
    }

    private JScrollPane construirPanelCentral() {
        areaResultado.setEditable(false);
        areaResultado.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        JScrollPane scroll = new JScrollPane(areaResultado);
        scroll.setBorder(BorderFactory.createTitledBorder("Resultado de la prueba"));
        return scroll;
    }
}