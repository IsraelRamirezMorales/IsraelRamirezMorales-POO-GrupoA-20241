package Cuenta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingresa el nombre del empleado: ");
        String name=sc.nextLine();

        System.out.println("Ingresa el numero de cuenta del empleado: ");
        long accountNumber=sc.nextLong();

        System.out.println("Ingresa el tipo de cuenta: ");
        System.out.println("1.- Tipo A, puede tener hasta $50,000");
        System.out.println("2.- Tipo B, puede tener hasta $100,000");
        System.out.println("3.- Tipo C, puede tener dinero ilimitado");
        String opcion=sc.nextLine();

        switch (opcion) {
            case :
                
                break;
        
            default:
                break;
        }


        Empleado empleado=new Empleado(name,accountNumber,opcion);

        System.out.println(empleado.getName());
        System.out.println(empleado.getAccount().getAccountNumber());
        System.out.println(empleado.getAccount().getType());
        System.out.println(empleado.getAccount().getAmount());

        System.out.println("*********");

        empleado.getAccount().agregarDinero(10000);
        System.out.println(empleado.getAccount().getAmount());

        System.out.println("*********");

        empleado.getAccount().agregarDinero(50000);
        System.out.println(empleado.getAccount().getAmount());
        
        sc.close();
    }
}
