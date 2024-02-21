package Rectangulo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Area y perimetro de rectangulos");
        System.out.println();
        
        Calculos primerRectangulo= new Calculos(1, 2);
        System.out.println("Primer rectangulo");
        primerRectangulo.Resultados();
        System.out.println("-------------------");

        Calculos segundoRectangulo= new Calculos(2, 3);
        System.out.println("Segundo rectangulo");
        segundoRectangulo.Resultados();
        System.out.println("-------------------");

        Calculos tercerRectangulo= new Calculos(3, 4);
        System.out.println("Tercer rectangulo");
        tercerRectangulo.Resultados();
        System.out.println("-------------------");

        Calculos cuartoRectangulo= new Calculos(4, 5);
        System.out.println("Cuarto rectangulo");
        cuartoRectangulo.Resultados();
        System.out.println("-------------------");

        Calculos quintoRectangulo= new Calculos(5, 6);
        System.out.println("Quinto rectangulo");
        quintoRectangulo.Resultados();
        


    }
    

}
