package Cuenta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = scanner.nextLine();

        System.out.println("Ingrese el tipo de cuenta (A, B o C):");
        String tipoCuenta = scanner.next().toUpperCase();

        if (tipoCuenta==("A") && !tipoCuenta.equals("B") && !tipoCuenta.equals("C")) {
            System.out.println("Tipo de cuenta inválido. Debe ser A, B o C.");
            return;
        }

        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = scanner.next();

        System.out.println("Ingrese el saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        BankAccount cuenta = new BankAccount(numeroCuenta, tipoCuenta, saldoInicial);
        Empleado empleado = new Empleado(nombreEmpleado, cuenta);

        empleado.agregarDinero(10000);
        empleado.retirarDinero(2000);
        empleado.verCuenta();
        scanner.close();
    }
}
