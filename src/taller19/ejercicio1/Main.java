package taller19.ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Probando con autenticación Local
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestor1 = new GestorAutenticacion(local);
        gestor1.iniciarSesion("admin", "1234");

        System.out.println("------------------------------------");

        // Cambiando a OAuth sin modificar el GestorAutenticacion
        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestorAutenticacion gestor2 = new GestorAutenticacion(oauth);
        gestor2.iniciarSesion("juan_perez", "token_seguro");
    }
}
