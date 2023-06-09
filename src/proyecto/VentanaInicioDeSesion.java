package proyecto;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class VentanaInicioDeSesion extends JFrame {
    private JTextField textFieldUsuario;
    private JPasswordField passwordField;
    private JButton btnIniciarSesion;

    public VentanaInicioDeSesion(String titulo) {
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel labelUsuario = new JLabel("Nombre de usuario:");
        textFieldUsuario = new JTextField(20);

        JLabel labelContraseña = new JLabel("Contraseña:");
        passwordField = new JPasswordField(20);

        btnIniciarSesion = new JButton("Iniciar sesión");
        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                String contraseña = new String(passwordField.getPassword());

                BaseDeDatos baseDeDatos = new BaseDeDatos();
                boolean resultado = baseDeDatos.verificarCredenciales(usuario, contraseña);

                if (resultado) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales inválidas");
                }
            }
        });

        add(labelUsuario);
        add(textFieldUsuario);
        add(labelContraseña);
        add(passwordField);
        add(btnIniciarSesion);
    }
}
