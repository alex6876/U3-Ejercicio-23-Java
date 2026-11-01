public class CajaAhorro extends CuentaBancaria {

    public CajaAhorro(String numeroCuenta, double saldo, String titular) {
        super(numeroCuenta, saldo, titular);
    }

    public void aplicarIntereses(double porcentaje) {

        if (porcentaje > 0) {
            double interes = saldo * porcentaje / 100;

            saldo += interes;

            System.out.println("Intereses agregados: $" + interes);
        } else {
            System.out.println("Porcentaje de interés no válido.");
        }
    }
}
