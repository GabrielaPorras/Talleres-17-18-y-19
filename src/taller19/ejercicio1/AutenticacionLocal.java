package taller19.ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public void autenticar(String usuario, String password) {
        System.out.println("Autenticando al usuario '" + usuario + "' mediante la Base de Datos Local.");
    }
}
