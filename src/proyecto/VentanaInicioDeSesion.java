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
    private JButton btnVerificar;

    public VentanaInicioDeSesion(String titulo) {
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel labelUsuario = new JLabel("Nombre de usuario:");
        add(labelUsuario);

        textFieldUsuario = new JTextField(15);
        add(textFieldUsuario);

        JLabel labelContraseña = new JLabel("Contraseña:");
        add(labelContraseña);

        passwordField = new JPasswordField(15);
        add(passwordField);

        btnVerificar = new JButton("Verificar");
        add(btnVerificar);

        btnVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                String contraseña = new String(passwordField.getPassword());

                // Verificar los datos en la base de datos
                BaseDeDatos baseDeDatos = new BaseDeDatos();
                if (baseDeDatos.verificarCredenciales(usuario, contraseña)) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión fallido");
                }
            }
        });
    }
}
