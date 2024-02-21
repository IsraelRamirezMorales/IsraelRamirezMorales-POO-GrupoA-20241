package Persona;
public class Main {
    public static void main(String[] args) {
  
    System.out.println("5 Personas y sus atributos");  
    System.out.println();
    
    Person firstPerson= new Person("Israel",18,false);
      
    firstPerson.imprimirDatos();
  
     System.out.println("-------------------");
     
     Person secondPerson= new Person("Diego",21,false);
      
     secondPerson.imprimirDatos();
  
     System.out.println("-------------------");
      
     Person thirdPerson= new Person("Jose",19,false);
      
     thirdPerson.imprimirDatos();
   
    System.out.println("-------------------"); 
    Person fourthPerson= new Person("Valeria",17,true);
      
    fourthPerson.imprimirDatos();
  
    System.out.println("-------------------"); 

    Person fifthPerson= new Person("Daniela",35,true);
      
    fifthPerson.imprimirDatos();
  
    }
  }