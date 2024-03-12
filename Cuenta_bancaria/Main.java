package Cuenta_bancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Banco banco=new Banco(null);
        
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
                        agregarEmpleado(banco, scanner);
                        break;

                case 2: 

                        mostrarTodosEmpleados(banco);
                        break;
                    
                case 3: 

                       mostrarEmpleadoEspecifico(banco, scanner);
                        break;
                case 4: 
                        verCuentasEmpleado(banco, scanner);
                        
                        break;
                case 5:

                        depositarDinero(banco, scanner);
                        break;

                case 6: 
                        retirarDinero(banco, scanner);
                        break;

                case 7: 
                
                        System.exit(0);
                        break;
                default:
                    break;
            }
        }
        }
        
    private static void agregarEmpleado(Banco banco,Scanner scanner){
                System.out.println("Ingrese el nombre del empleado: ");
                scanner.nextLine(); // Consumir la nueva línea pendiente
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

                    if (type.equals("A") || type.equals("B") || type.equals("C") || type.equals("a") || type.equals("b")|| type.equals("c")) {
                        empleado.agregarCuenta(new BankAccount(accountNumber, type, amount));
                    }else{ System.out.println("Tipo de cuenta inválido. Se omite esta cuenta.");
                    continue;
                }
                   
                }
                banco.agregarEmpleado(empleado);
    }    

    private static void mostrarTodosEmpleados(Banco banco) {
        System.out.println("Información de todos los empleados:");
        for (Empleado emp : banco.getEmpleados()) {
            System.out.println("Nombre: " + emp.getName());
        }
    
    }

    public static void mostrarEmpleadoEspecifico(Banco banco, Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        scanner.nextLine(); // Consumir la nueva línea pendiente
        String name = scanner.nextLine();
        Empleado empleadoEspecifico = null;
        for (Empleado emp : banco.getEmpleados()) {
            if (emp.getName().equals(name)) {
                empleadoEspecifico = emp;
                break;
            }
        }
        if (empleadoEspecifico != null) {
            empleadoEspecifico.verCuentas();
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    public static void verCuentasEmpleado(Banco banco, Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        scanner.nextLine(); 
        String name = scanner.nextLine();
        Empleado empleado = null;
        for (Empleado emp : banco.getEmpleados()) {
            if (emp.getName().equals(name)) {
                empleado = emp;
                break;
            }
        }
        if (empleado != null) {
            empleado.verCuentas();
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    public static void depositarDinero(Banco banco, Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        scanner.nextLine(); // Consumir la nueva línea pendiente
        String nombreDeposito = scanner.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuentaDeposito = scanner.nextInt();
        System.out.print("Ingrese el monto a depositar: ");
        double montoDeposito = scanner.nextDouble();
        Empleado empleado = buscarEmpleadoPorNombre(banco, nombreDeposito);
        if (empleado != null) {
            BankAccount account = empleado.getAccountPorNumero(numeroCuentaDeposito);
            if (account != null) {
                account.agregarDinero(montoDeposito);
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }

    public static Empleado buscarEmpleadoPorNombre(Banco banco, String nombre) {
        for (Empleado emp : banco.getEmpleados()) {
            if (emp.getName().equals(nombre)) {
                return emp;
            }
            
        }
        return null;
    }


    public static void retirarDinero(Banco banco, Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        scanner.nextLine(); // Consumir la nueva línea pendiente
        String nombreRetiro = scanner.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuentaRetiro = scanner.nextInt();
        System.out.print("Ingrese el monto a retirar: ");
        double montoRetiro = scanner.nextDouble();
        Empleado empleado = buscarEmpleadoPorNombre(banco, nombreRetiro);
        if (empleado != null) {
         BankAccount account = empleado.getAccountPorNumero(numeroCuentaRetiro);
            if (account != null) {
                account.retirarDinero(montoRetiro);
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
   
}