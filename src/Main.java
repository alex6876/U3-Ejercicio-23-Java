public class Main {

    public static void main(String[] args) {

        // Crear cuentas
        CajaAhorro ahorro = new CajaAhorro(
                "CA001", 100000, "Juan"
        );

        CuentaCorriente corriente = new CuentaCorriente(
                "CC001", 50000, "Pedro", 30000
        );

        // Operaciones de caja de ahorro
        System.out.println("=== CAJA DE AHORRO ===");

        ahorro.depositar(20000);
        ahorro.aplicarIntereses(2);
        ahorro.extraer(30000);

        // Operaciones de cuenta corriente
        System.out.println("\n=== CUENTA CORRIENTE ===");

        corriente.depositar(10000);
        corriente.extraer(80000);
        corriente.extraer(20000);

        // Mostrar estados finales
        System.out.println("\n=== SALDOS FINALES ===");

        ahorro.mostrarInformacion();

        System.out.println();

        corriente.mostrarInformacion();
    }
}
