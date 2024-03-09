package Sobrecarga_de_metodos;

public class Main {
 public static void main(String[] args) {
    Metodos metodos=new Metodos(1, 2, 3, 4);
    
    System.out.println(metodos.suma());
    System.out.println(metodos.suma(3, 4));
    System.out.println(metodos.resta());
    System.out.println(metodos.resta(3, 4));
    System.out.println(metodos.multiplicacion());
    System.out.println(metodos.multiplicacion(3, 4));
    System.out.println(metodos.division(3, 4));
   
 }   
}
