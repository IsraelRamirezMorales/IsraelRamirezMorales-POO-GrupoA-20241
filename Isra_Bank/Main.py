


def agregarEmpleado(banco, scanner):
    employee_name = input("Ingrese el nombre del empleado: ")
    employee = Employee(employee_name)
    print("Ingrese el numero de cuentas que quiere para el empleado: ")
    numCuentas = scanner.nextInt()
    for i in range(numCuentas):
        print("Ingrese el numero de cuenta: ")
        accountNumber = scanner.nextInt()
        print("Ingrese el saldo inicial de la cuenta: ")
        amount = scanner.nextDouble()
        print("Ingrese el tipo de cuenta:")
        print("Tipo A: Puede tener maximo $50,000")
        print("Tipo B: Puede tener maximo $100,000")
        print("Tipo C: Puede tener dinero ilimitado")
        type = scanner.next()

        if type == "A" or type == "B" or type == "C" or type == "a" or type == "b" or type == "c":
            empleado.agregarCuenta(BankAccount(accountNumber, type, amount))
        else:
            print("Tipo de cuenta inválido. Se omite esta cuenta.")


