package Cuenta_bancaria;

public class Employee {
    
        private String name;
        private String lastName;
        private BankAccount account;


        public Employee(String name, String lastName,double account) {
            this.name = name;
            this.lastName = lastName;
            this.account=new BankAccount(account,tipo);
            this.account=new BankAccount(account,tipo);
        }
    
        public Employee(String name, String lastName, long accountNumber) {
            this.name = name;
            this.lastName = lastName;
            this.account = new BankAccount(accountNumber);
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public BankAccount getAccount() {
            return account;
        }


}
