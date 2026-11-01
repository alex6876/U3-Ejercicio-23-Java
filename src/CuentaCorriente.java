public class CuentaCorriente extends CuentaBancaria {

    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, String titular,
                           double limiteSobregiro) {

        super(numeroCuenta, saldo, titular);

        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public boolean extraer(double monto) {

        if (monto > 0 && monto <= saldo + limiteSobregiro) {

            saldo -= monto;

            System.out.println("Extracción realizada: $" + monto);
            return true;

        } else {

            System.out.println("Se superó el límite de sobregiro.");
            return false;
        }
    }
}
