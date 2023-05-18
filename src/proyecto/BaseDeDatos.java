package proyecto;

class BaseDeDatos {
    public boolean verificarCredenciales(String usuario, String contraseña) {
        // Lógica para verificar los datos en la base de datos
        // Aquí deberías implementar la verificación real y retornar true o false según corresponda
        // Ejemplo básico:
        return usuario.equals("admin") && contraseña.equals("123456");
    }
}