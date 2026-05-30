package taller19.ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando hoja de calculo Excel (.xlsx) con los datos: " + contenido);
        System.out.println("Estado: Reporte Excel exportado exitosamente.");
    }
}

