package taller19.ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    // Se inyecta la dependencia a través del constructor
    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String password) {
        servicio.autenticar(usuario, password);
    }
}
