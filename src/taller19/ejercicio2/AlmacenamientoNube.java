package taller19.ejercicio2;

public class AlmacenamientoNube implements Almacenamiento {
    @Override
    public void guardar(String nombreArchivo, String contenido) {
        System.out.println("Subiendo '" + nombreArchivo + "' al bucket de Amazon S3 en la nube.");
    }

    @Override
    public String recuperar(String nombreArchivo) {
        return "Contenido desde la nube de " + nombreArchivo;
    }
}
