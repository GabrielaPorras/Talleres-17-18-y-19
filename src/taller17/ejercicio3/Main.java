package taller17.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Transporte transporteGeneral = new Transporte();
        Transporte miCoche = new Coche();
        Transporte miBicicleta = new Bicicleta();

        System.out.println("--- Prueba de Sustitucion de Liskov ---");

        transporteGeneral.avanzar();
        miCoche.avanzar();
        miBicicleta.avanzar();
    }
}
