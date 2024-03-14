import random

class Library:
    def __init__(self):
        self.book_list = []
        self.user_list = []

    def add_user(self):
        name = input("Ingresa el nombre del usuario: ")
        age = int(input("Ingresa la edad del usuario: "))

        user = User(name, age)
        self.user_list.append(user)
        print("El usuario fue agregado correctamente!")

    def delete_user(self):
        if len(self.user_list) == 0:
            print("No hay usuarios registrados!")
        else:
            user_id = input("Ingresa el ID del usuario: ")
            user = self.find_user(user_id)
            if user is not None:
                self.user_list.remove(user)
                print("El usuario fue removido correctamente!")
            else:
                print("El usuario no fue encontrado!")

    def add_book(self):
        title = input("Ingrese el titulo del libro: ")
        author = input("Ingrese el autor del libro: ")

        book = Book(title, author)
        self.book_list.append(book)
        print("El libro fue agregado correctamente!")

    def delete_book(self):
        if len(self.book_list) == 0:
            print("No hay libros registrados!")
        else:
            book_id = input("Ingresa el ID del libro: ")
            book = self.find_book(book_id)
            if book is not None:
                self.book_list.remove(book)
                print("El libro fue removido correctamente!")
            else:
                print("El libro no fue encontrado!")

    def rent_book(self):
        if len(self.user_list) == 0 or len(self.book_list) == 0:
            print("No hay usuarios o libros para rentar!")
        else:
            book_id = input("Ingresa el ID del libro: ")
            book = self.find_book(book_id)
            if book is not None:
                if not book.is_rented():
                    user_id = input("Ingresa el ID del usuario: ")
                    user = self.find_user(user_id)
                    if user is not None:
                        book.rent_book(user)
                        user.rent_book(book)
                    else:
                        print("El usuario no fue encontrado!")
                else:
                    print("Este libro ya esta rentado por: " + book.get_owner().get_name())
            else:
                print("El libro no fue encontrado!")

    def return_book(self):
        if len(self.book_list) == 0:
            print("No hay libros registrados!")
        else:
            user_id = input("Ingresa el ID del usuario: ")
            user = self.find_user(user_id)
            if user is not None:
                if len(user.get_book_list()) > 0:
                    book_id = input("Ingresa el ID del libro: ")
                    book = self.find_book(book_id)
                    if book is not None:
                        user.return_book(book)
                        book.return_book()
                        print("El libro ha sido devuelto a la libreria!")
                    else:
                        print("El libro no fue encontrado!")
                else:
                    print("Este usuario no ha rentado ningun libro hasta ahora!")
            else:
                print("El usuario no fue encontrado!")

    def show_user_list(self):
        if len(self.user_list) == 0:
            print("No hay usuarios registrados!")
        else:
            print("-------------INFORMACION DE LOS USUARIOS-------------")
            for user in self.user_list:
                print(f" | NOMBRE: {user.get_name()} | EDAD: {user.get_age()} | ID: {user.get_id()} |")
                if len(user.get_book_list()) == 0:
                    print("---------Este usuario no ha rentado ningun libro---------")
                else:
                    print("_____________LIBROS RENTADOS_____________")
                    for book in user.get_book_list():
                        print(f" | TITULO: {book.get_title()} | AUTOR: {book.get_author()} |")
                print()

    def show_user_data(self):
        if len(self.user_list) == 0:
            print("No hay usuarios registrados!")
        else:
            user_id = input("Ingresa el ID del usuario: ")
            user = self.find_user(user_id)
            if user is not None:
                print(f"INFORMACION SOBRE EL USUARIO: {user.get_name()}")
                print(f" | NOMBRE: {user.get_name()} | EDAD: {user.get_age()} | ID: {user.get_id()} |")
                if len(user.get_book_list()) == 0:
                    print("---------Este usuario no ha rentado ningun libro---------")
                else:
                    print("_____________LIBROS RENTADOS_____________")
                    for book in user.get_book_list():
                        print(f" | TITULO: {book.get_title()} | AUTOR: {book.get_author()} |")
                        print()
            else:
                print("El usuario no fue encontrado!")

    def show_book_list(self):
        if len(self.book_list) == 0:
            print("No hay libros registrados!")
        else:
            print("------------LISTA DE LIBROS------------")
            for book in self.book_list:
                print(f" | TITULO: {book.get_title()} | AUTOR: {book.get_author()} | NUMERO DE RENTAS: {book.get_rent_counter()} |")
                if not book.is_rented():
                    print(" | SIN DUENO ACTUAL | ")
                else:
                    print(f" | DUENO ACTUAL: {book.get_owner().get_name()} | ")
                print()

    def show_active_users(self):
        if len(self.user_list) == 0:
            print("No hay usuarios registrados!")
        else:
            print("Estos usuarios tienen al menos una renta en el registro.")
            for user in self.user_list:
                if user.get_rent_counter() > 0:
                    print(f" | NOMBRE: {user.get_name()} | EDAD: {user.get_age()} | ID: {user.get_id()} |")
                    print()

    def show_active_books(self):
        if len(self.book_list) == 0:
            print("No hay libros registrados!")
        else:
            for book in self.book_list:
                if book.get_rent_counter() > 0:
                    print(f" | TITULO: {book.get_title()} | AUTOR: {book.get_author()} | NUMERO DE RENTAS: {book.get_rent_counter()} |")
                    if not book.is_rented():
                        print(" | SIN DUENO ACTUAL | ")
                    else:
                        print(f" | DUENO ACTUAL: {book.get_owner().get_name()} | ")
                    print()

    def show_inactive_books(self):
        if len(self.book_list) == 0:
            print("No hay libros registrados!")
        else:
            print("Estos libros nunca han sido rentados")
            for book in self.book_list:
                if book.get_rent_counter() == 0:
                    print(f" | TITULO: {book.get_title()} | AUTOR: {book.get_author()} | NUMERO DE RENTAS: {book.get_rent_counter()} |")
                    print()

    def find_user(self, user_id):
        for user in self.user_list:
            if user.get_id() == user_id:
                return user
        return None

    def find_book(self, book_id):
        for book in self.book_list:
            if book.get_id() == book_id:
                return book
        return None


class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author
        self.id = self.generate_id()
        self.rented = False
        self.rent_counter = 0
        self.owner = None

    def get_title(self):
        return self.title

    def get_author(self):
        return self.author

    def get_id(self):
        return self.id

    def is_rented(self):
        return self.rented

    def set_rented(self, rented):
        self.rented = rented

    def get_rent_counter(self):
        return self.rent_counter

    def increase_counter(self):
        self.rent_counter += 1

    def set_owner(self, owner):
        self.owner = owner

    def get_owner(self):
        return self.owner

    def rent_book(self, owner):
        self.set_owner(owner)
        self.set_rented(True)
        self.increase_counter()
        print("El libro ha sido rentado correctamente")

    def return_book(self):
        self.set_owner(None)
        self.set_rented(False)

    def generate_id(self):
        import random
        import string
        return ''.join(random.choices(string.ascii_lowercase + string.digits, k=6))


class User:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.book_list = []
        self.id = self.generate_id()
        self.rent_counter = 0

    def get_name(self):
        return self.name

    def get_id(self):
        return self.id

    def get_age(self):
        return self.age

    def get_book_list(self):
        return self.book_list

    def get_rent_counter(self):
        return self.rent_counter

    def increase_counter(self):
        self.rent_counter += 1

    def rent_book(self, book):
        self.book_list.append(book)
        self.increase_counter()

    def return_book(self, book):
        self.book_list.remove(book)

    def generate_id(self):
        import random
        import string
        return ''.join(random.choices(string.ascii_lowercase + string.digits, k=6))


def show_options():
    print("********BIENVENIDO A LA LIBRERIA********")
    print("1. Registra un usuario")
    print("2. Elimina un usuario")
    print("3. Registra un libro")
    print("4. Elimina un libro")
    print("5. Renta un libro")
    print("6. Devuelve un libro")
    print("7. Mostrar la informacion de un usuario especifico")
    print("8. Mostrar todos los usuarios registrados")
    print("9. Mostrar todos los libros registrados")
    print("10. Mostrar los usuarios con al menos un libro rentado")
    print("11. Mostrar los libros que han sido rentados")
    print("12. Mostrar los libros que no han sido rentados")
    print("13. Salir")
    print("*********************************************************")


def main():
    lib = Library()
    flag = True

    while flag:
        show_options()
        opt = int(input())

        if opt == 1:
            lib.add_user()
        elif opt == 2:
            lib.delete_user()
        elif opt == 3:
            lib.add_book()
        elif opt == 4:
            lib.delete_book()
        elif opt == 5:
            lib.rent_book()
        elif opt == 6:
            lib.return_book()
        elif opt == 7:
            lib.show_user_data()
        elif opt == 8:
            lib.show_user_list()
        elif opt == 9:
            lib.show_book_list()
        elif opt == 10:
            lib.show_active_users()
        elif opt == 11:
            lib.show_active_books()
        elif opt == 12:
            lib.show_inactive_books()
        else:
            flag = False


if __name__ == "__main__":
    main()
