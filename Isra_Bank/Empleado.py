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

    def get_account_por_numero(self, account_number):
        for account in self.cuentas:
            if account.get_account_number() == account_number:
                return account
        return None

    def ver_cuentas(self):
        print("Cuentas del empleado", self.name + ":")
        for account in self.cuentas:
            print(account)