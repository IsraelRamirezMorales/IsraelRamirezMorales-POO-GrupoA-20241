class Bank_account:
    __account_number=0
    __amount=0
    __account_type=""
    
    def __init__(self,account_number,account_type,amount):
        self.__account_number=account_number
        self.__account_type=account_type
        self.__amount=amount
    
    def get_account_number(self):
     return self.__account_number
    
    def get_account_type(self):
     return self.__account_type
 
    def get_amount(self):
     return self.__amount
    
    def add_money(self,amount):
     if self.__account_type=="A" or self.__account_type=="a" :
         self.add_money_A(amount)
         
     elif  self.__account_type=="B" or self.__account_type=="b" :
            self.add_money_B(amount) 
            
     else:
            self.__amount+=amount     
    def add_money_A(self,amount):
     if self.__amount+amount <= 50000:
       self.__amount+=amount
     else :
       print("No puede tener mas de $50,000 en la cuenta tipo (A)")       
    
    def add_money_B(self,amount):
     if self.__amount+amount <= 100000:
            self.__amount+=amount
     else :
            print("No puede tener mas de $100,000 en la cuenta tipo (A)")       
    
    
    def withdraw(self,amount):
     if self.__account_type=="A" or self.__account_type=="a":
                self.withdraw_A(amount)
     elif self.__account_type=="B" or self.__account_type=="b":
                self.withdraw_B(amount) 
     elif  self.__account_type=="C" or self.__account_type=="c":   
                self.withdraw_C(amount)
                
                
    def withdraw_A(self,amount):
     if self.__amount-amount>=1000:
            self.__amount-=amount
     else:
            print("El saldo minimo para tener en la cuenta tipo (A) es de $1,000 ")  

    def withdraw_B(self,amount):
     if self.__amount-amount>=5000:
            self.__amount-=amount
     else:
            print("El saldo minimo para tener en la cuenta tipo (B) es de $5,000 ")  

    def withdraw_C(self,amount):
     if self.__amount-amount>=10000:
            self.__amount-=amount
     else:
            print("El saldo minimo para tener en la cuenta tipo (C) es de $10,000 ")  

    def __str__(self) -> str:
         return "EL numero de cuenta es: "+ str(self.__account_number)+ ", el saldo es $ "+str(self.__amount)+" y la cuenta es de tipo "+self.__account_type
    