package Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);

      System.out.println("Ingresa el ancho: ");
      double ancho=scanner.nextDouble();

      System.out.println("Ingresa la altura: ");
      double altura=scanner.nextDouble();

      Rectangulo rectangulo=new Rectangulo(altura, ancho);

      System.out.println("Area: "+rectangulo.calcularArea(ancho, altura));
      System.out.println("Perimetro: "+rectangulo.calcularPerimetro(ancho, altura));
      scanner.close();
    }
  }
