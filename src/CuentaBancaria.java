public class CuentaBancaria {

    protected String numeroCuenta;
    protected double saldo;
    protected String titular;

    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: $" + monto);
        } else {
            System.out.println("El monto no es válido.");
        }
    }

    public boolean extraer(double monto) {

        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Extracción realizada: $" + monto);
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
