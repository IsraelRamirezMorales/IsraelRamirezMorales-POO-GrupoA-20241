package Calculadora;
public class Calculadora {
    int numeroUno;
    int numeroDos;
    double resultado;

    public Calculadora(int numeroUno,int numeroDos){
        this.numeroUno=numeroUno;
        this.numeroDos=numeroDos;
 
    }

    double suma(){
        return numeroUno+numeroDos;
    }
    double resta(){
        return numeroUno-numeroDos;
    }
    double multiplicacion(){
        return this.numeroUno*this.numeroDos;
    }
    
    double division(){

        if(this.numeroDos==0){
        System.out.println("No se puede dividir entre 0 ");
    }

    resultado=(double)this.numeroUno/this.numeroDos;
        
        return resultado;
    }
}