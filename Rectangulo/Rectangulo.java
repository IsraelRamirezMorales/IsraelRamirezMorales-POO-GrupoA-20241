package Rectangulo;
public class Rectangulo {
    double ancho,altura;

    public Rectangulo(double altura,double ancho){
        this.altura=altura;
        this.ancho=ancho;
    }

    public double calcularArea(int ancho,int altura){
        return ancho*altura;
    }

    public double calcularArea(double ancho,double altura){
        return ancho*altura;
    }

    public double calcularPerimetro(int ancho,int altura){
        return 2*(ancho+altura);
    }

    public double calcularPerimetro(double ancho,double altura){
        return 2*(ancho+altura);
    }

}