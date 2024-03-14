package Library;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            showOptions();
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    Library.addUser();
                    break;

                case 2:
                    Library.deleteUser();
                    break;

                case 3:
                    Library.addBook();
                    break;

                case 4:
                    Library.deleteBook();
                    break;

                case 5:
                    Library.rentBook();

                    break;

                case 6:
                    Library.returnBook();
                    break;

                case 7:
                    Library.showUserData();

                    break;

                case 8:
                    Library.showUserList();
                    break;

                case 9:
                    Library.showBookList();
                    break;

                case 10:
                    Library.showActiveUsers();
                    break;

                case 11:
                    Library.showActiveBooks();
                    break;

                case 12:
                    Library.showInactiveBooks();
                    break;

                default:
                    flag = false;
                    break;
            }

        }


    }

    public static void showOptions(){
        System.out.println("********BIENVENIDO A LA LIBRERIA********");
        System.out.println("1. Registra un usuario");
        System.out.println("2. Elimina un usuario");
        System.out.println("3. Registra un libro");
        System.out.println("4. Elimina un libro");
        System.out.println("5. Renta un libro");
        System.out.println("6. Devuelve un libro");
        System.out.println("7. Mostrar la informacion de un usuario especifico");
        System.out.println("8. Mostrar todos los usuarios registrados");
        System.out.println("9. Mostrar todos los libros registrados");
        System.out.println("10. Mostrar los usuarios con al menos un libro rentado");
        System.out.println("11. Mostrar los libros que han sido rentados");
        System.out.println("12. Mostrar los libros que no han sido rentados");
        System.out.println("13. Salir");
        System.out.println("*********************************************************");
    }

    }

