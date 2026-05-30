package taller17.ejercicio2;

public class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Deposito exitoso. Nuevo saldo: $" + saldo);
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: Fondos insuficientes para retirar $" + monto);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
