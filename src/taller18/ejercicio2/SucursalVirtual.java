package taller18.ejercicio2;

public class SucursalVirtual implements Retiro, Transferencia, PagoFactura {

    @Override
    public void retirar(double monto) {
        System.out.println("Generando codigo para retiro sin tarjeta de $" + monto + ".");
    }

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transferencia exitosa de $" + monto + " a la cuenta " + cuentaDestino + ".");
    }

    @Override
    public void pagarFactura(String codigoFactura) {
        System.out.println("La factura con codigo " + codigoFactura + " ha sido pagada a traves de la sucursal virtual.");
    }
}
