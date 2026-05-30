package taller19.ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando archivo PDF con el contenido: " + contenido);
        System.out.println("Estado: Reporte PDF guardado exitosamente.");
    }
}
