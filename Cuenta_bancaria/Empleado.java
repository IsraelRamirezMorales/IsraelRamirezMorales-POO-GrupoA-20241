package Cuenta_bancaria;

public class Empleado{
    
    private String nombre;
    private BankAccount cuenta;

    public Empleado(String nombre, BankAccount cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void verCuenta() {
        if (cuenta != null) {
            cuenta.verCuenta(nombre);
        } else {
            System.out.println(nombre + " no tiene cuenta bancaria.");
        }
    }

    public void agregarDinero(double cantidad) {
        if (cuenta != null) {
            cuenta.agregarDinero(cantidad);
        } else {
            System.out.println(nombre + " no tiene cuenta bancaria.");
        }
    }

    public void retirarDinero(double cantidad) {
        if (cuenta != null) {
            cuenta.retirarDinero(cantidad);
        } else {
            System.out.println(nombre + " no tiene cuenta bancaria.");
        }
    }


       





}
    
        



