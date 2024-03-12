 package Cuenta_bancaria;

import java.util.ArrayList;

public class Empleado{
    
    private String name;
    private ArrayList<BankAccount> cuentas;


    public Empleado(String name) {
       
        this.name = name;
        this.cuentas=new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void agregarCuenta(BankAccount account){
        cuentas.add(account);
    }
    
    public ArrayList<BankAccount> getCuentas(){
        return cuentas;
    }

    public BankAccount getAccountPorNumero(long accountNumber) {
        for (BankAccount account : cuentas) {
            if (account.getAccountNumber()==accountNumber) {
                return account;
            }
        }
        return null;
    }

    
    public void verCuentas() {
        System.out.println("Cuentas del empleado " + name + ":");
        for (BankAccount account : cuentas) {
            System.out.println(account);
        }
    }

    
}