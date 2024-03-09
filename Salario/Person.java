package Salario;

public class Person {
    String name;
    int age;
    private int salary=10000;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
        
    }

    public Person(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }



}
