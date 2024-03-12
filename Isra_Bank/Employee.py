class Employee:
    __name=""
    __accounts=[]
    
    def __init__(self,name):
        self.__name=name
        self.__accounts=[]
        
    def get_name(self):
        return self.__name
    
    def add_account(self,account):
     self.__accounts.append(account)
    
    def get_accounts(self):
     return self.__accounts
    
    def get_accounts_by_number(self,account_number):
     for account in self.__accounts:
         if account.get_account_number()==account_number:
             return account
     return None
    
    def view_bank_accounts(self):
     print("Cuentas del empleado "+ self.__name +":")
     for account in self.__accounts:
      print(account)
    
    