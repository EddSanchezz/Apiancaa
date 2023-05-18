package proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class VentanaRegistro extends JFrame {
    private JTextField textFieldUsuario;
    private JTextField textFieldFechaNacimiento;
    private JPasswordField passwordField;
    private JButton btnRegistrar;

    public VentanaRegistro(String titulo) {
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel labelUsuario = new JLabel("Nombre de usuario:");
        textFieldUsuario = new JTextField(20);

        JLabel labelFechaNacimiento = new JLabel("Fecha de nacimiento:");
        textFieldFechaNacimiento = new JTextField(20);

        JLabel labelContraseña = new JLabel("Contraseña:");
        passwordField = new JPasswordField(20);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                String fechaNacimiento = textFieldFechaNacimiento.getText();
                String contraseña = new String(passwordField.getPassword());

                BaseDeDatos baseDeDatos = new BaseDeDatos();
                boolean resultado = baseDeDatos.guardarDatos(usuario, fechaNacimiento, contraseña);

                if (resultado) {
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe en la base de datos");
                }
            }
        });

        add(labelUsuario);
        add(textFieldUsuario);
        add(labelFechaNacimiento);
        add(textFieldFechaNacimiento);
        add(labelContraseña);
        add(passwordField);
        add(btnRegistrar);
    }
}