package taller17.ejercicio2;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        double interes = saldo * (tasaInteres / 100);
        depositar(interes);
    }
}
