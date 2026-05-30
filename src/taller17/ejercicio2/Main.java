package taller17.ejercicio2;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuentaNormal = new CuentaBancaria(1000.0);
        CuentaBancaria cuentaAhorro = new CuentaAhorros(500.0, 5.0);

        System.out.println("--- Operaciones Cuenta Normal ---");
        cuentaNormal.retirar(200.0);

        System.out.println("--- Operaciones Cuenta Ahorro (Sustituyendo a la base) ---");
        cuentaAhorro.depositar(100.0);
        cuentaAhorro.retirar(700.0);
        cuentaAhorro.retirar(200.0);
    }
}
