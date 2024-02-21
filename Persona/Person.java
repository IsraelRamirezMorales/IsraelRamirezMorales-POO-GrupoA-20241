package Persona;
public class Person{
    /*public
    private
    protected*/
  
    String name;
    int age;
    boolean isFemale;
    
  
     public Person (String name, int age, boolean isFemale){
  
       this.name=name;
       this.age=age;
       this.isFemale=isFemale;
       
  
     }
    public void imprimirDatos(){
      System.out.println("Nombre: "+name);
      System.out.println("Edad: "+age);
     
      if(isFemale){
        System.out.println("Genero: Femenino");
       }else{
        System.out.println("Genero: Mascullino");
        }
     
    }
  }