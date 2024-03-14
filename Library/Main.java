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
                    library.addUser();
                    break;

                case 2:
                    library.deleteUser();
                    break;

                case 3:
                    library.addBook();
                    break;

                case 4:
                    library.deleteBook();
                    break;

                case 5:
                    library.rentBook();

                    break;

                case 6:
                    library.returnBook();
                    break;

                case 7:
                    library.showUserData();

                    break;

                case 8:
                    library.showUserList();
                    break;

                case 9:
                    library.showBookList();
                    break;

                case 10:
                    library.showActiveUsers();
                    break;

                case 11:
                    library.showActiveBooks();
                    break;

                case 12:
                    library.showInactiveBooks();
                    break;

                default:
                    System.out.println("Saliendo de la libreria...");
                    flag = false;
                    break;
            }

        }

        sc.close();
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

