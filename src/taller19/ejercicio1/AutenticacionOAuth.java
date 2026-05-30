package taller19.ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public void autenticar(String usuario, String password) {
        System.out.println("Redirigiendo a servidor externo para autenticar a '" + usuario + "' via OAuth (Google/GitHub).");
    }
}