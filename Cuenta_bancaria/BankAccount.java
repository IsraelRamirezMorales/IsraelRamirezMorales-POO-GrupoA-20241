package Cuenta_bancaria;
public class BankAccount {
    private long accountNumber;
    private double amount=0;
    private char tipo;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double addMoney(double cantidad){
        return amount+cantidad;
    }

    public double withdrawMoney(double cantidad){
        return amount-cantidad;
    }

}