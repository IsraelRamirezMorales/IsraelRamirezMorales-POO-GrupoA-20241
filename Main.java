
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto: ");
        String name=sc.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double price=sc.nextDouble();

        System.out.println("Ingrese el stock del producto: ");
        int stock=sc.nextInt();


        Producto producto=new Producto(name, price, stock);
        
        

        System.out.println("Informacion del producto: ");
        System.out.println("Nombre: "+producto.getName());
        System.out.println("Precio: "+producto.getPrice());
        System.out.println("Stock actual: "+producto.getStock());

        System.out.println("Ingrese el aumento de stock: ");
        int cantidad=sc.nextInt();

        producto.AumentarStock(cantidad);
        System.out.println("Nuevo stock: "+producto.getStock());

        System.out.println("Ingresa la disminucion de stock: ");
        cantidad=sc.nextInt();

        producto.DisminuirStock(cantidad);

        System.out.println("Nuevo stock: "+producto.getStock());

        sc.close();
    }  
}