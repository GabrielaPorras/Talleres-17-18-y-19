package taller18.ejercicio2;

public class Main {

    public static void main(String[] args) {
        CajeroAutomatico miCajero = new CajeroAutomatico();
        SucursalVirtual miApp = new SucursalVirtual();

        System.out.println("--- Operando en Cajero Automatico ---");
        miCajero.retirar(200.0);

        System.out.println("--- Operando en Sucursal Virtual ---");
        miApp.transferir(500.0, "0987654321");
        miApp.pagarFactura("EPM-10293");
        miApp.retirar(100.0);
    }
}
