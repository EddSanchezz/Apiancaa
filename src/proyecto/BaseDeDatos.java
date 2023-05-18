package proyecto;

import java.util.HashMap;

class BaseDeDatos {
    private HashMap<String, Usuario> usuarios;

    public BaseDeDatos() {
        usuarios = new HashMap<>();
    }

    public boolean guardarDatos(String usuario, String fechaNacimiento, String contraseña) {
        if (usuarios.containsKey(usuario)) {
            return false; // Usuario ya existe en la base de datos
        }

        Usuario nuevoUsuario = new Usuario(usuario, fechaNacimiento, contraseña);
        usuarios.put(usuario, nuevoUsuario);
        return true; // Datos guardados correctamente
    }

    public boolean verificarCredenciales(String usuario, String contraseña) {
        if (usuarios.containsKey(usuario)) {
            Usuario usuarioActual = usuarios.get(usuario);
            return usuarioActual.getContraseña().equals(contraseña);
        }
        return false; // Usuario no encontrado en la base de datos
    }

    private class Usuario {
        private String nombreUsuario;
        private String fechaNacimiento;
        private String contraseña;

        public Usuario(String nombreUsuario, String fechaNacimiento, String contraseña) {
            this.nombreUsuario = nombreUsuario;
            this.fechaNacimiento = fechaNacimiento;
            this.contraseña = contraseña;
        }

        public String getContraseña() {
            return contraseña;
        }
    }
}
