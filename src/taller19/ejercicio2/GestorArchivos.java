package taller19.ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    // Inyeccion de dependencia por constructor
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarGuardado(String archivo, String data) {
        almacenamiento.guardar(archivo, data);
    }
}
