package taller18.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Camion miCamion = new Camion();
        Moto miMoto = new Moto();

        System.out.println("--- Reporte del Camion ---");
        miCamion.conducir();
        miCamion.cargarMercancia();

        System.out.println("--- Reporte de la Moto ---");
        miMoto.conducir();
        // La moto no tiene el metodo cargarMercancia(), cumpliendo el ISP.
    }
}