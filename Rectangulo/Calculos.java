package Rectangulo;

public class Calculos {
    double area;
    double perimetro;
    double altura;
    double ancho;
    int i;

    public Calculos(double ancho,double altura){
        this.altura=altura;
        this.ancho=ancho;
    }

    public void Resultados(){
        i++;
        System.out.println("El area es: "+ancho*altura);
        System.out.println("El perimetro es: "+(ancho+ancho+altura+altura));
    }

    
}
