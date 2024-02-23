package Calculadora;
public class Main {
    public static void main(String[] args) {
      Calculadora calculadora=new Calculadora(1, 2);

      System.out.printf("Suma: %.2f",calculadora.suma());
      System.out.printf("\nResta: %.2f", calculadora.resta());
      System.out.printf("\nMultiplicacion: %.2f", calculadora.multiplicacion());
      System.out.printf("\nDivision: %.2f", calculadora.division());
    }
  }


