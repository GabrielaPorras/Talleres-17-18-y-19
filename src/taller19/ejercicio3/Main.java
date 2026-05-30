package taller19.ejercicio3;

public class Main {
    public static void main(String[] args) {
        String datosVentas = "Ventas Totales Q1: $500,000 USD";

        // Generando un PDF
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPdf = new GestorReportes(pdf);
        gestorPdf.crearReporte(datosVentas);

        System.out.println("------------------------------------");

        // Generando un Excel
        GeneradorReporte excel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(excel);
        gestorExcel.crearReporte(datosVentas);
    }
}
