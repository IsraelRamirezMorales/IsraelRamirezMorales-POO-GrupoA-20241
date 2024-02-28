package Impuestos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("¿Quieres ingresar solo los ingresos? (1: Si / 0: No) ");
        int option=scanner.nextInt();

        int ingresos=0;
        double ventas=0;
        double porcentajeImpuestos=0;
        double dividendos=0;
        double exencion=0;

        if (option == 1) {
            System.out.println("Ingrese los ingresos: ");
            ingresos = scanner.nextInt();
        } else {
            System.out.println("¿Quieres agregar ventas y porcentaje de impuesto? (1: Si / 0: No)");
            int option1 = scanner.nextInt();
            if (option1 == 1) {
                System.out.println("Ingrese las ventas: ");
                ventas = scanner.nextDouble();
                System.out.println("Ingrese el porcentaje de impuesto: ");
                porcentajeImpuestos = scanner.nextDouble();
            } else {
                System.out.println("¿Quieres agregar dividendos, porcentaje de impuesto y exencion? (1: Si / 0: No)");
                int option2 = scanner.nextInt();
                if (option2 == 1) {
                    System.out.println("Ingrese los dividendos: ");
                    dividendos = scanner.nextDouble();
                    System.out.println("Ingrese el porcentaje de impuesto: ");
                    porcentajeImpuestos = scanner.nextDouble();
                    System.out.println("Ingrese la exencion: ");
                    exencion = scanner.nextDouble();
                }
            }
        }

        CalculadoraImpuestos calculadoraImpuestos=new CalculadoraImpuestos(ingresos, porcentajeImpuestos, dividendos, exencion);
        double impuestosCalculados = 0;

        if (option == 1) {
            impuestosCalculados = calculadoraImpuestos.calcularImpuestos(ingresos);
        } else if (ventas != 0 && porcentajeImpuestos != 0) {
            impuestosCalculados = calculadoraImpuestos.calcularImpuestos(ventas, porcentajeImpuestos);
        } else if (dividendos != 0 && porcentajeImpuestos != 0 && exencion != 0) {
            impuestosCalculados = calculadoraImpuestos.calcularImpuestos(dividendos, porcentajeImpuestos, exencion);
        }

        System.out.println("Impuestos calculados: " + impuestosCalculados);
    }
}
