package taller19.ejercicio3;

public class GestorReportes {
    private GeneradorReporte generador;

    // Inyección de dependencia: El gestor no crea el objeto, lo recibe.
    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String datos) {
        generador.generar(datos);
    }
}
