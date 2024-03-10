package Cuenta_bancaria;

import java.util.Scanner;
import Cuenta_bancaria.Banco;
import Cuenta_bancaria.Empleado;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Banco banco=new Banco();


        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1.- Agregar empleado");
            System.out.println("2.- Mostrar informacion de todos los empleados");
            System.out.println("3.- Mostrar informacion de un empleado en especifico");
            System.out.println("4.- Ver las cuentas de un empleado");
            System.out.println("5.- Agregar dinero a una cuenta");
            System.out.println("6.- Retirar dinero de una cuenta");
            System.out.println("7.- Salir");
            int opcion=scanner.nextInt();

            switch (opcion) {
                case 1:
                        agregarEmpleado(banco,scanner);

                        break;

                case 2: 

                        System.out.println("Información de todos los empleados:");
                            for (Empleado emp : banco.getEmpleados()) {
                        System.out.println("Nombre: " + emp.getName());
                         for (BankAccount account : emp.getCuentas()) {
                            System.out.println(account);
                            }
                        System.out.println();
                        }
                        break;
                    
                case 3: 

                        System.out.print("Ingrese el nombre del empleado: ");
                        //scanner.nextLine(); // Consumir la nueva línea pendiente
                        String name = scanner.nextLine();
                        Empleado empleadoEspecifico = null;
                        for (Empleado emp : banco.getEmpleados()) {
                            if (emp.getName().equals(name)) {
                                empleadoEspecifico = emp;
                                break;
                            }
                        }
                        if (empleadoEspecifico != null) {
                            System.out.println("Información del empleado " + empleadoEspecifico.getName() + ":");
                            for (BankAccount account : empleadoEspecifico.getCuentas()) {
                                System.out.println(account);
                            }
                        } else {
                            System.out.println("Empleado no encontrado.");
                        }
                        break;
                case 4: 

                        
                        break;
                default:
                    break;
            }

        }
        
        

    private static void agregarEmpleado(Empleado empleado) {
        System.out.println("Ingrese el nombre del empleado: ");
                        //scanner.nextLine(); // Consumir la nueva línea pendiente
                        String nombreEmpleado=scanner.nextLine();
                        Empleado empleado=new Empleado(nombreEmpleado);
                        System.out.println("Ingrese el numero de cuentas que quiere para el empleado: ");
                        int numCuentas=scanner.nextInt();
                        for (int i = 0; i < numCuentas; i++) {
                            System.out.println("Ingrese el numero de cuenta: ");
                            int accountNumber=scanner.nextInt();
                            System.out.println("Ingrese el saldo inicial de la cuenta: ");
                            double amount=scanner.nextDouble();
                            System.out.println("Ingrese el tipo de cuenta:");
                            System.out.println("Tipo A: Puede tener maximo $50,000");
                            System.out.println("Tipo B: Puede tener maximo $100,000");
                            System.out.println("Tipo C: Puede tener dinero ilimitado");
                            String type=scanner.next();

                            if (type != "A" && type != "B" && type != "C" && type != "a" && type != "b" && type != "c") {
                                System.out.println("Tipo de cuenta inválido. Se omite esta cuenta.");
                                continue;
                            }
                            empleado.agregarCuenta(new BankAccount(accountNumber, type, amount));
                        }
                        banco.agregarEmpleado(empleado);
    }

    private static void mostrarTodosEmpleados(Banco banco) {
        System.out.println("Información de todos los empleados:");
        for (Empleado emp : banco.getEmpleados()) {
            System.out.println("Nombre: " + emp.getName());
        }

        
    }
}

   
}