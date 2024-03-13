class BankAccount:
    def __init__(self, account_number, type, amount):
        self.account_number = account_number
        self.type = type
        self.amount = amount

    def get_account_number(self):
        return self.account_number

    def get_type(self):
        return self.type

    def get_amount(self):
        return self.amount

    def agregar_dinero(self, amount):
        if self.type.lower() == "a" and self.amount + amount <= 50000:
            self.amount += amount
        elif self.type.lower() == "b" and self.amount + amount <= 100000:
            self.amount += amount
        else:
            self.amount += amount

    def retirar_dinero(self, amount):
        if self.type.lower() == "a" and self.amount - amount >= 1000:
            self.amount -= amount
        elif self.type.lower() == "b" and self.amount - amount >= 5000:
            self.amount -= amount
        elif self.type.lower() == "c" and self.amount - amount >= 10000:
            self.amount -= amount
        else:
            print("El saldo es insuficiente para realizar el retiro")

    def __str__(self):
        return f"El número de cuenta es {self.account_number}, el saldo es ${self.amount} y la cuenta es de tipo {self.type}"
