package Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa el sueldo base: ");
        double sueldoBase=scanner.nextDouble();

        System.out.println("Quieres agregar una bonificacion (1: Si / 0: No)");
        int option1=scanner.nextInt();

        double bonificacion=0;

        if (option1==1) {
            System.out.println("Ingrese la bonificacion: ");
            bonificacion=scanner.nextDouble();
        }

        System.out.println("Quieres agregar una horas extras (1: Si / 0: No)");
        int option2=scanner.nextInt();

        double horasExtras=0;

        if (option2==1) {
            System.out.println("Ingrese las horas extras: ");
            horasExtras=scanner.nextDouble();
        }

        Empleado empleado=new Empleado(sueldoBase, bonificacion, horasExtras);

        if (option1==0 && option2==0) {
            System.out.println("Salario: "+empleado.calcularSalario(sueldoBase));
        }else if (option1==1 && option2==0) {
            System.out.println("Salario: "+empleado.calcularSalario(sueldoBase, bonificacion));
        }else if(option1==1 && option2==1){
            System.out.println("Salario: "+empleado.calcularSalario(sueldoBase, bonificacion, horasExtras));
        }
        scanner.close();
    }
}
