package taller19.ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Uso de almacenamiento Local
        Almacenamiento local = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(local);
        gestorLocal.procesarGuardado("tesis.pdf", "Contenido de la tesis...");

        System.out.println("------------------------------------");

        // Uso de almacenamiento en la Nube
        Almacenamiento nube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(nube);
        gestorNube.procesarGuardado("foto_perfil.jpg", "Binarios de la imagen...");
    }
}
