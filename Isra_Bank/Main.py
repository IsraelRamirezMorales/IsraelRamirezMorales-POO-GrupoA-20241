class Empleado:
    def __init__(self, name):
        self.name = name
        self.cuentas = []

    def get_name(self):
        return self.name

    def agregar_cuenta(self, account):
        self.cuentas.append(account)

    def get_cuentas(self):
        return self.cuentas

    def get_account_por_numero(self, accountNumber):
        for account in self.cuentas:
            if account.get_account_number() == accountNumber:
                return account
        return None

    def ver_cuentas(self):
        print("Cuentas del empleado " + self.name + ":")
        for account in self.cuentas:
            print(f"Numero de cuenta: {account.get_account_number()} saldo: {account.get_amount()} el tipo de la cuenta es: {account.get_type()}")


class BankAccount:
    def __init__(self, accountNumber, type, amount):
        self.account_number = accountNumber
        self.type = type
        self.amount = amount

    def get_account_number(self):
        return self.account_number

    def get_type(self):
        return self.type

    def get_amount(self):
        return self.amount

    def agregar_dinero(self, amount):
        if self.type == "A" or self.type == "a":
            self.agregar_dinero_a(amount)
        elif self.type == "B" or self.type == "b":
            self.agregar_dinero_b(amount)
        else:
            self.amount += amount

    def agregar_dinero_a(self, amount):
        if self.amount + amount <= 50000:
            self.amount += amount
        else:
            print("No puede tener más de 50,000 cuenta A")

    def agregar_dinero_b(self, amount):
        if self.amount + amount <= 100000:
            self.amount += amount
        else:
            print("No puede tener más de 100,000 cuenta B")

    def retirar_dinero(self, amount):
        if self.type == "A" or self.type == "a":
            self.retirar_dinero_a(amount)
        elif self.type == "B" or self.type == "b":
            self.retirar_dinero_b(amount)
        else:
            self.retirar_dinero_c(amount)

    def retirar_dinero_a(self, amount):
        if self.amount - amount >= 1000:
            self.amount -= amount
        else:
            print("El saldo minimo para tener en la cuenta (A) es de $1,000")

    def retirar_dinero_b(self, amount):
        if self.amount - amount >= 5000:
            self.amount -= amount
        else:
            print("El saldo minimo para tener en la cuenta (B) es de $5,000")

    def retirar_dinero_c(self, amount):
        if self.amount - amount >= 10000:
            self.amount -= amount
        else:
            print("El saldo minimo para tener en la cuenta (C) es de $10,000")

    def to_string(self):
        return "El número de cuenta es " + str(self.account_number) + ", el saldo es $" + str(self.amount) + " y la cuenta es de tipo " + self.type


class Banco:
    def __init__(self, empleados):
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def get_empleados(self):
        return self.empleados


def agregar_empleado(banco, scanner):
    print("Ingrese el nombre del empleado: ")
    nombre_empleado = input()
    empleado = Empleado(nombre_empleado)
    print("Ingrese el numero de cuentas que quiere para el empleado: ")
    num_cuentas = int(input())
    for i in range(num_cuentas):
        print("Ingrese el numero de cuenta: ")
        account_number = int(input())
        print("Ingrese el saldo inicial de la cuenta: ")
        amount = float(input())
        print("Ingrese el tipo de cuenta:")
        print("Tipo A: Puede tener maximo $50,000")
        print("Tipo B: Puede tener maximo $100,000")
        print("Tipo C: Puede tener dinero ilimitado")
        type = input()

        if type == "A" or type == "B" or type == "C" or type == "a" or type == "b" or type == "c":
            empleado.agregar_cuenta(BankAccount(account_number, type, amount))
        else:
            print("Tipo de cuenta inválido. Se omite esta cuenta.")

    banco.agregar_empleado(empleado)


def mostrar_todos_empleados(banco):
    empleados = banco.get_empleados()
    for empleado in empleados:
        print("Nombre del empleado: " + empleado.get_name())
        


def mostrar_empleado_especifico(banco, scanner):
    print("Ingrese el nombre del empleado: ")
    nombre_empleado = input()
    empleados = banco.get_empleados()
    for empleado in empleados:
        if empleado.get_name() == nombre_empleado:
            print("Nombre del empleado: " + empleado.get_name())
            empleado.ver_cuentas()
            return
    print("No se encontró el empleado con ese nombre.")


def ver_cuentas_empleado(banco, scanner):
    print("Ingrese el nombre del empleado: ")
    nombre_empleado = input()
    empleados = banco.get_empleados()
    for empleado in empleados:
        if empleado.get_name() == nombre_empleado:
            empleado.ver_cuentas()
            return
    print("No se encontró el empleado con ese nombre.")


def depositar_dinero(banco, scanner):
    print("Ingrese el nombre del empleado: ")
    nombre_empleado = input()
    empleados = banco.get_empleados()
    for empleado in empleados:
        if empleado.get_name() == nombre_empleado:
            print("Ingrese el numero de cuenta: ")
            account_number = int(input())
            account = empleado.get_account_por_numero(account_number)
            if account is not None:
                print("Ingrese la cantidad a depositar: ")
                amount = float(input())
                account.agregar_dinero(amount)
                print("Dinero depositado exitosamente.")
            else:
                print("No se encontró la cuenta con ese número.")
            return
    print("No se encontró el empleado con ese nombre.")


def retirar_dinero(banco, scanner):
    print("Ingrese el nombre del empleado: ")
    nombre_empleado = input()
    empleados = banco.get_empleados()
    for empleado in empleados:
        if empleado.get_name() == nombre_empleado:
            print("Ingrese el numero de cuenta: ")
            account_number = int(input())
            account = empleado.get_account_por_numero(account_number)
            if account is not None:
                print("Ingrese la cantidad a retirar: ")
                amount = float(input())
                account.retirar_dinero(amount)
                print("Dinero retirado exitosamente.")
            else:
                print("No se encontró la cuenta con ese número.")
            return
    print("No se encontró el empleado con ese nombre.")

def main():
 

    banco = Banco([])
    while True:
        print("\nMenu: ")
        print("1.- Agregar empleado")
        print("2.- Mostrar informacion de todos los empleados")
        print("3.- Mostrar informacion de un empleado en especifico")
        print("4.- Ver las cuentas de un empleado")
        print("5.- Agregar dinero a una cuenta")
        print("6.- Retirar dinero de una cuenta")
        print("7.- Salir")
        opcion = int(input())

        if opcion == 1:
            agregar_empleado(banco, None)
        elif opcion == 2:
            mostrar_todos_empleados(banco)
        elif opcion == 3:
            mostrar_empleado_especifico(banco, None)
        elif opcion == 4:
            ver_cuentas_empleado(banco, None)
        elif opcion == 5:
            depositar_dinero(banco, None)
        elif opcion == 6:
            retirar_dinero(banco, None)
        elif opcion == 7:
            break
        
if __name__ == "__main__":
    main()