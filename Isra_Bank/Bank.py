
class Bank:
    __employees=[]
    
    def __init__(self,employees) :
        self.__employees=[]
        
    def add_employee(self,employee):
     self.__employees.append(employee)
    
    def get_employees(self):
     return self.__employees
 