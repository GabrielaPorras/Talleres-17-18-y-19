package taller19.ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Guardando '" + nombreArchivo + "' en el disco duro local C:/Datos.");
    }

    @Override
    public String recuperar(String nombreArchivo) {
        return "Contenido local de " + nombreArchivo;
    }
}