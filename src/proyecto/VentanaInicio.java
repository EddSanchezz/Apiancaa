package proyecto;

import javax.swing.*;
import java.awt.*;

public class VentanaInicio extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VentanaInicio() {
        setTitle("Ventana de Inicio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        // Establecer el fondo de la ventana
        String imagePath = "C:\\Users\\edwar\\Downloads\\avion.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel background = new JLabel(imageIcon);
        background.setBounds(0, 0, 500, 300);
        add(background);

        // Crear y agregar el texto en el centro superior
        JLabel textoBienvenida = new JLabel("Bienvenidos a Apianca AirLines");
        textoBienvenida.setBounds(0, 50, 500, 30);
        textoBienvenida.setHorizontalAlignment(JLabel.CENTER);
        textoBienvenida.setFont(new Font("Arial", Font.BOLD, 16));
        background.add(textoBienvenida);

        // Crear y agregar los botones en el centro
        JButton btnIniciarSesion = new JButton("Iniciar sesión");
        btnIniciarSesion.setBounds(180, 120, 140, 30);
        background.add(btnIniciarSesion);

        JButton btnRegistrarse = new JButton("Registrarse");
        btnRegistrarse.setBounds(180, 160, 140, 30);
        background.add(btnRegistrarse);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaInicio();
    }
}
