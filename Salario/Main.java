package Salario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa tu salario: ");
        int customSalary=scanner.nextInt();

        Person manager=new Person("Juan", 20,customSalary);
        
        Person teacher=new Person("Pedro", 50);

        System.out.println(manager.getSalary()+" Manager");
        System.out.println(teacher.getSalary()+" Teacher");
     
        teacher.setSalary(1000);
        System.out.println(teacher.getSalary()+" Salario modificado");
    }
}
