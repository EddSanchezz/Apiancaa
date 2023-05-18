package proyecto;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class VentanaInicio extends JFrame {
    public VentanaInicio() {
        setTitle("Ventana de Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 350);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        // Establecer el fondo de la ventana
        String imagePath = "C:\\Users\\edwar\\Downloads\\avion.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel background = new JLabel(imageIcon);
        background.setBounds(0, 0, 500, 300);
        getContentPane().add(background);

        // Crear y agregar el texto en el centro superior
        JLabel textoBienvenida = new JLabel("Bienvenidos a Apianca AirLines");
        textoBienvenida.setBounds(0, 50, 500, 30);
        textoBienvenida.setHorizontalAlignment(JLabel.CENTER);
        textoBienvenida.setFont(new Font("Arial", Font.BOLD, 16));
        textoBienvenida.setForeground(Color.WHITE);
        background.add(textoBienvenida);

        // Crear y agregar el botón "Iniciar sesión"
        JButton btnIniciarSesion = new JButton("Iniciar sesión");
        btnIniciarSesion.setBounds(180, 120, 140, 30);
        background.add(btnIniciarSesion);

        // Agregar acción al botón "Iniciar sesión"
        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción al hacer clic en "Iniciar sesión"
                // Abrir una nueva ventana
                VentanaInicioDeSesion ventanaInicioSesion = new VentanaInicioDeSesion("Ventana de Inicio de Sesión");
                ventanaInicioSesion.setVisible(true);
            }
        });

        // Crear y agregar el botón "Registrarse"
        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setBounds(180, 160, 140, 30);
        background.add(btnRegistrarse);

        // Agregar acción al botón "Registrarse"
        btnRegistrarse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Acción al hacer clic en "Registrarse"
                // Abrir una nueva ventana
                VentanaRegistro ventanaRegistro = new VentanaRegistro("Ventana de Registro");
                ventanaRegistro.setVisible(true);
            }
        });

        // Crear y agregar el texto en la parte inferior
        JLabel textoCreadoPor = new JLabel("Creado por: Edward Esteban Sanchez Motta, Santiago Galvis Mora y JuanPablo Rios Espinosa");
        getContentPane().add(textoCreadoPor);
        textoCreadoPor.setBounds(-6, 291, 480, 30);
        textoCreadoPor.setHorizontalAlignment(JLabel.CENTER);
        textoCreadoPor.setFont(new Font("Arial", Font.PLAIN, 8));

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaInicio();
    }
}
