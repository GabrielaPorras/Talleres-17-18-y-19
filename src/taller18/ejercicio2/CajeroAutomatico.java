package taller18.ejercicio2;

public class CajeroAutomatico implements Retiro {

    @Override
    public void retirar(double monto) {
        System.out.println("Dispensando el efectivo: $" + monto + " desde el Cajero Automatico.");
    }
}
