package Sobrecarga_de_metodos;

public class Metodos {
    int n1,n2;
    double m1,m2;

    public Metodos(int n1, int n2, double m1, double m2){

        this.n1=n1;
        this.n2=n2;
        this.m1=m1;
        this.m2=m2;

    }

    int suma(){
        return n1+n2;
    }

    double suma(double m1,double m2){

        return m1+m2;
    }

    int resta(){
        return n1-n2;
    }
    double resta(double m1,double m2){
        return m1-m2;
    }

    int multiplicacion(){

        return n1*n2;
    }

    double multiplicacion(double m1, double m2){

        return m1*m2;
    }

    String division(double m1,double m2){

        if (m2!=0) {

            return String.format("%.2f", m1/m2);
        }

        return "No es posible dividir entere cero";
    
        }
}
