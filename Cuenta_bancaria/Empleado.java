 package Cuenta_bancaria;

public class Empleado{
    
    private String name;
    private BankAccount account;

    public Empleado(String name, long accountNumber, String type) {
        if (type != "A" && type != "'B'" && type !=" C") {
            System.out.println("Tipo de cuenta no válido");
            return;
        }
        this.name = name;
       
        this.account = new BankAccount(accountNumber, type);
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
    

       





}