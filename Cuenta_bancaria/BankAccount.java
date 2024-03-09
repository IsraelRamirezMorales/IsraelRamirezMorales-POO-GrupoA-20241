package Cuenta_bancaria;
public class BankAccount {
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldo;

    public BankAccount(String numeroCuenta, String tipoCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldoInicial;
    }

    public void agregarDinero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad ingresada debe ser mayor que cero.");
            return;
        }

        double saldoMaximo = obtenerSaldoMaximo();
        if (saldo + cantidad > saldoMaximo) {
            System.out.println("El saldo máximo permitido para la cuenta de tipo " + tipoCuenta + " es $" + saldoMaximo + ".");
            return;
        }

        saldo += cantidad;
        System.out.println("Se agregaron $" + cantidad + " a la cuenta. Nuevo saldo: $" + saldo);
    }

    public void retirarDinero(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad ingresada debe ser mayor que cero.");
            return;
        }

        double saldoMinimo = obtenerSaldoMinimo();
        if (saldo - cantidad < saldoMinimo) {
            System.out.println("El saldo mínimo para la cuenta de tipo " + tipoCuenta + " es $" + saldoMinimo + ".");
            return;
        }

        saldo -= cantidad;
        System.out.println("Se retiraron $" + cantidad + " de la cuenta. Nuevo saldo: $" + saldo);
    }

    public void verCuenta(String nombreEmpleado) {
        System.out.println("El número de cuenta del empleado " + nombreEmpleado + " es " + numeroCuenta + ", su saldo es $" + saldo + " y la cuenta es de tipo " + tipoCuenta);
    }

    private double obtenerSaldoMaximo() {
        switch (tipoCuenta) {
            case "A":
                return 50000;
            case "B":
                return 100000;
            case "C":
                return Double.MAX_VALUE;
            default:
                return 0;
        }
    }

    private double obtenerSaldoMinimo() {
        switch (tipoCuenta) {
            case "A":
                return 1000;
            case "B":
                return 5000;
            case "C":
                return 10000;
            default:
                return 0;
        }
    }
}

