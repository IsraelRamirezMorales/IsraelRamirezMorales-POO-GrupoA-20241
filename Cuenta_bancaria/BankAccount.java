package Cuenta_bancaria;
public class BankAccount {
    private long accountNumber;
    private double amount;
    private String type;

    public BankAccount(long accountNumber, String type,double amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount=amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void agregarDinero(double amount) {
        if (type.equals("A") || type.equals("a")) agregarDineroA(amount);
        else if (type.equals("B") || type.equals("b")) agregarDineroB(amount);
        else this.amount += amount;
    }

    private void agregarDineroA(double amount) {
        if (this.amount + amount <= 50000) {
            this.amount += amount;
        } else {
            System.out.println("No puede tener mas de 50,000 cuenta A");
        }
    }

    private void agregarDineroB(double amount) {
        if (this.amount + amount <= 100000) {
            this.amount += amount;
        } else {
            System.out.println("No puede tener mas de 100,000 cuenta B");
        }
    }

    public void retirarDinero(double amount){
        if (type.equals("A") || type.equals("a")) retirarDineroA(amount);
        else if (type.equals("B") || type.equals("b")) retirarDineroB(amount);
        else retirarDineroC(amount);
    }
   

    private void retirarDineroA(double amount){
        if (this.amount-amount>=1000) {
            this.amount-=amount;
        }else{
            System.out.println("El saldo minimo para tener en la cuenta (A) es de $1,000");
        }
    }

    private void retirarDineroB(double amount){
        if (this.amount-amount>=5000) {
            this.amount-=amount;
        }else{
            System.out.println("El saldo minimo para tener en la cuenta (B) es de $5,000");
        }
    }

    private void retirarDineroC(double amount){
        if (this.amount-amount>=10000) {
            this.amount-=amount;
        }else{
            System.out.println("El saldo minimo para tener en la cuenta (C) es de $10,000");
        }
    }

    public String toString() {
        return "El numero de cuenta es " + accountNumber + ", el saldo es $" + amount + " y la cuenta es de tipo " + type;
    }
    
}

