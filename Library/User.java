package Library;
import java.util.ArrayList;
import java.util.Random;

public class User {
     Random ran = new Random();
    private String name;

    private int age;

    private ArrayList<Book> bookList=new ArrayList<>();
    private String ID;
    private int rentCounter;

    public User(String name, int age) {
        this.name = name;
        this.age=age;
        this.ID =generateID();
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public int getRentCounter() {
        return rentCounter;
    }

    public void increaseCounter(){
        rentCounter++;
    }

    public void rentBook(Book book){
        bookList.add(book);
        rentCounter++;
    }

    public void returnBook(Book book){
        bookList.remove(book);
    }

    private String generateID(){
        String car = "abcdefghijklmnopqrstuvwxyz0123456789";
        String com = "";
        for (int i = 0; i < 6; i++) {
            com += car.charAt(ran.nextInt(car.length()));
        }

        return com;
    }
}
