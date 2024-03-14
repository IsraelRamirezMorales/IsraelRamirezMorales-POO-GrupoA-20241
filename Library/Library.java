package Library;
import java.util.*;
public class Library{
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<Book> bookList=new ArrayList<>();
    static ArrayList<User> userList=new ArrayList<>();

    public Library(){
    }

    public static  void addUser(){
        System.out.println("Ingresa el nombre del usuario: ");
        String name=scanner.next();
        System.out.println("Ingresa la edad del usuario: ");
        int age=scanner.nextInt();

        userList.add(new User(name, age));
        System.out.println("El usuario fue agregado correctamente!");
    }

    public static void  deleteUser(){
        if (userList.isEmpty()){
            System.out.println("No hay empleados registrados!");
        }else{
            int i=getUserIndex();
            if (validUserIndex(i)){
                userList.remove(i);
                System.out.println("El usuario fue removido correctamente!");
            }else {
                System.out.println("El usuario no fue encontrado!");
            }
        }
    }

    public static void addBook(){
        System.out.println("Ingrese el titulo del libro: ");
        String title=scanner.next();
        System.out.println("Ingrese el autor del libro: ");
        String author=scanner.next();

        bookList.add(new Book(title,author));
        System.out.println("El libro fue agregado correctamente!");
    }

    public static void deleteBook(){
        if (bookList.isEmpty()){
            System.out.println("No hay ningun libro registrado");
        }else {
            int i=getBookIndex();
            if (validBookIndex(i)){
                bookList.remove(i);
                System.out.println("El libro fue removido correctamente!");
            }
        }
    }


    public static void rentBook(){
        if(userList.isEmpty() || bookList.isEmpty()){
            System.out.println("No hay usuarios o libros para rentar!");
        }
        else{
            int i = getBookIndex();
            if(validBookIndex(i)){
                if (!bookList.get(i).isRented()){
                    int j = getUserIndex();
                    if(validUserIndex(j)){
                        bookList.get(i).rentBook(userList.get(j));
                        userList.get(j).rentBook(bookList.get(i));
                    }
                    else{
                        System.out.println("El usuario no fue encontrado!");
                    }
                }
                else{
                    System.out.println("Este libro ya esta rentado por: " + bookList.get(i).getOwner().getName());
                }
            }
            else{
                System.out.println("El libro no fue encontrado!");
            }
        }
    }

    public static void returnBook(){
        if(bookList.isEmpty()){
            System.out.println("No hay libros registrados");
        }
        else{
            int i = getUserIndex();
            if(validUserIndex(i)){
                if(!userList.get(i).getBookList().isEmpty()){
                    int n = getBookIndex(i);
                    if(validBookIndex(n)){
                        userList.get(i).returnBook(bookList.get(n));
                        bookList.get(n).returnBook();
                        System.out.println("El libro ha sido devuelto a la libreria!");
                    }
                    else{
                        System.out.println("EL libro no fue encontrado!");
                    }
                }
                else{
                    System.out.println("Este usuario no ha rentado ningun libro hasta ahora!");
                }
            }
            else{
                System.out.println("EL usuario no fue encontrado!");
            }
        }
    }

    public  static void showUserList(){
        if(userList.isEmpty()){
            System.out.println("No hay usuarios registrados");
        }
        else{
            System.out.println(" -------------INFORMACION DE LOS USUARIOS------------- ");
            for (User user : userList) {
                System.out.printf("\n | NOMBRE: %s | EDAD: %s | ID: %s |",user.getName(), user.getAge(), user.getID());
                if(user.getBookList().isEmpty()){
                    System.out.println("\n---------Este usuario no ha rentado ningun libro---------");
                }
                else{
                    System.out.println(" \n_____________LIBROS RENTADOS_____________ ");
                    for (Book book : user.getBookList()) {
                        System.out.printf("\n | TITULO: %s| AUTOR: %s |", book.getTitle(), book.getAuthor());
                    }
                }
                System.out.println();
            }
        }
    }

    public static void showUserData(){
        if(userList.isEmpty()){
            System.out.println("No hay usuarios registrados!");
        }
        else{
            int i = getUserIndex();
            if(validUserIndex(i)){
                System.out.println(" INFORMACION SOBRE EL USUARIO: " + userList.get(i).getName());
                System.out.printf(" | NOMBRE: %s | EDAD: %s | ID: %s |", userList.get(i).getName(), userList.get(i).getAge(), userList.get(i).getID());
                if(userList.get(i).getBookList().isEmpty()){
                    System.out.println("\n---------Este usuario no ha rentado ningun libro---------");
                }
                else{
                    System.out.println(" \n_____________LIBROS RENTADOS_____________ ");
                    for (Book book : userList.get(i).getBookList()) {
                        System.out.printf(" | TITULO: %s| AUTOR: %s |", book.getTitle(), book.getAuthor());
                        System.out.println();
                    }
                }
                System.out.println();
            }
            else{
                System.out.println("El usuario no fue encontrado!");
            }

        }
    }
    public static void showBookList(){
        if(bookList.isEmpty()){
            System.out.println("No hay libros registrados");
        }
        else{
            System.out.println(" ------------LISTA DE LIBROS------------");
            for (Book book : bookList) {
                System.out.printf("\n | TITULO: %s| AUTOR: %s | NUMERO DE RENTAS: %d | ", book.getTitle(), book.getAuthor(), book.getRentCounter());
                if(!book.isRented()){
                    System.out.print(" | SIN DUENO ACTUAL | ");
                }
                else{
                    System.out.printf(" | DUENO ACTUAL: %s | ", book.getOwner().getName());
                }
                System.out.println();
            }
        }
    }

    public static void showActiveUsers(){
        if(userList.isEmpty()){
            System.out.println("No hay usuarios registrados");
        }
        else{
            System.out.println("Estos usuarios tienen al menos una renta en el registro.");
            for (User user : userList) {
                if(user.getRentCounter() > 0){
                    System.out.printf("\n | NOMBRE: %s | EDAD: %s | ID: %s |",user.getName(), user.getAge(), user.getID());
                    System.out.println();
                }
            }
        }
    }

    public static void showActiveBooks(){
        if(bookList.isEmpty()){
            System.out.println("No hay libros registrados");
        }
        else{
            for (Book book : bookList) {
                if(book.getRentCounter() > 0){
                    System.out.printf("\n | TITULO: %s| AUTOR: %s | NUMERO DE RENTAS: %d | ", book.getTitle(), book.getAuthor(), book.getRentCounter());
                    if(!book.isRented()){
                        System.out.print(" | SIN DUENO ACTUAL | ");
                    }
                    else{
                        System.out.printf(" | DUENO ACTUAL: %s| ", book.getOwner().getName());
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void showInactiveBooks(){
        if(bookList.isEmpty()){
            System.out.println("No hay libros registrados");
        }
        else{
            System.out.println("Estos libros nunca han sido rentados");
            for (Book book : bookList) {
                if(book.getRentCounter() == 0){
                    System.out.printf("\n | TITULO: %s| AUTOR: %s | NUMERO DE RENTAS: %d | ", book.getTitle(), book.getAuthor(), book.getRentCounter());
                    System.out.println();
                }
            }
        }
    }








    private static void showUserNames(){
        System.out.println("Estos son los ID disponibles");
        System.out.println("----------------------------------");
        for (User user : userList) {
            System.out.printf(" | NOMBRE: %s | ID: %s | ", user.getName(), user.getID());
            System.out.println();

        }
    }

    private static int getUserIndex(){
        int verification = -1;
        showUserNames();
        System.out.println("Ingrese el ID del usuario");
        String ID = scanner.next();

        for (int i = 0; i < userList.size(); i++) {
            if(ID.equals(userList.get(i).getID())){
                verification = i;
                break;
            }
        }
        return verification;
    }

    private static boolean validUserIndex(int i){
        if(i == -1){
            return false;
        }
        else{
            return true;
        }
    }


    private static void showBookTitles(){
        System.out.println("Estos son los ID disponibles");
        System.out.println("----------------------------------");
        for (Book book : bookList) {
            System.out.printf(" | TITULO: %s | ID: %s | ", book.getTitle(), book.getID());
            System.out.println();

        }
    }

    private static void showBookTitles(int i){
        System.out.printf("Estos son los ID disponibles para el usuario: %s", userList.get(i).getName());
        System.out.println("----------------------------------");
        for (Book book : userList.get(i).getBookList()) {
            System.out.printf(" | TITULO: %s | ID: %s | ", book.getTitle(), book.getID());
            System.out.println();
        }
    }

    private static int getBookIndex(){
        int verification = -1;
        showBookTitles();
        System.out.println("Ingresa el ID del libro");
        String ID = scanner.next();

        for (int i = 0; i < bookList.size(); i++) {
            if(ID.equals(bookList.get(i).getID())){
                verification = i;
                break;
            }
        }
        return verification;
    }

    private static int getBookIndex(int i){
        int verification = -1;
        showBookTitles(i);
        System.out.println("Ingresa el ID del libro");
        String ID = scanner.next();

        for (int j = 0; j < bookList.size(); j++) {
            if(ID.equals(userList.get(i).getBookList().get(j).getID())){
                verification= j;
                break;
            }
        }
        return verification;
    }

    private static boolean validBookIndex(int i){
        if(i == -1){
            return false;
        }
        else{
            return true;
        }
    }




}

