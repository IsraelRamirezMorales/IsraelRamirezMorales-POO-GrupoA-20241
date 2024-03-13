class Banco:
    def __init__(self):
        self.empleados = []

    def agregar_empleado(self, empleado):
        self.empleados.append(empleado)

    def get_empleados(self):
        return self.empleados


def agregar_empleado(banco):
    print("Ingrese el nombre del empleado:")
    nombre_empleado = input()
    empleado = Empleado(nombre_empleado)
    print("Ingrese el numero de cuentas que quiere para el empleado:")
    num_cuentas = int(input())
    for _ in range(num_cuentas):
        print("Ingrese el numero de cuenta:")
        account_number = int(input())
        print("Ingrese el saldo inicial de la cuenta:")
        amount = float(input())
        print("Ingrese el tipo de cuenta:")
        print("Tipo A: Puede tener maximo $50,000")
        print("Tipo B: Puede tener maximo $100,000")
        print("Tipo C: Puede tener dinero ilimitado")
        type = input().upper()
        if type in ["A", "B", "C"]:
            empleado.agregar_cuenta(BankAccount(account_number, type, amount))
        else:
            print("Tipo de cuenta inválido. Se omite esta cuenta.")
            continue
    banco.agregar_empleado(empleado)


def mostrar_todos_empleados(banco):
    print("Información de todos los empleados:")
    for emp in banco.get_empleados():
        print("Nombre:", emp.get_name())


def mostrar_empleado_especifico(banco):
    print("Ingrese el nombre del empleado:")
    name = input()
    empleado_especifico = None
    for emp in banco.get_empleados():
        if emp.get_name() == name:
            empleado_especifico = emp
            break
    if empleado_especifico is not None:
        empleado_especifico.ver_cuentas()
    else:
        print("Empleado no encontrado.")


def ver_cuentas_empleado(banco):
    print("Ingrese el nombre del empleado:")
    name = input()
    empleado = None
    for emp in banco.get_empleados():
        if emp.get_name() == name:
            empleado = emp
            break
    if empleado is not None:
        empleado.ver_cuentas()
    else:
        print("Empleado no encontrado.")


def depositar_dinero(banco):
    print("Ingrese el nombre del empleado:")
    nombre_deposito = input()
    print("Ingrese el número de cuenta:")
    numero_cuenta_deposito = int(input())
    print("Ingrese el monto a depositar:")
    monto_deposito = float(input())
    empleado = buscar_empleado_por_nombre(banco, nombre_deposito)
    if empleado is not None:
        account = empleado.get_account_por_numero(numero_cuenta_deposito)
        if account is not None:
            account.agregar_dinero(monto_deposito)
        else:
            print("Cuenta no encontrada.")
    else:
        print("Empleado no encontrado.")


def buscar_empleado_por_nombre(banco, nombre):
    for emp in banco.get_empleados():
        if emp.get_name() == nombre:
            return emp
    return None


def retirar_dinero(banco):
    print("Ingrese el nombre del empleado:")
    nombre_retiro = input()
    print("Ingrese el número de cuenta:")
    numero_cuenta_retiro = int(input())
    print("Ingrese el monto a retirar:")
    monto_retiro = float(input())
    empleado = buscar_empleado_por_nombre(banco, nombre_retiro)
    if empleado is not None:
        account = empleado.get_account_por_numero(numero_cuenta_retiro)
        if account is not None:
            account.retirar_dinero(monto_retiro)
        else:
            print("Cuenta no encontrada.")
    else: 
        print("Empleado no encontrado")

        




