package Ejercicio;

public class Producto {
    String name;
    private double price;
    private int stock;

    public Producto(String name, double price, int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }

    public Producto(String name, double price){
        this.name=name;
        this.price=price;
        this.stock=0;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if (price >= 0) {
            this.price=price;
        } else {
            System.out.println("El precio no puede ser negativo o cero");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()) {
            this.name=name;
        } else {
            System.out.println("El nombre no puede ser nulo o vacío");
        }
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        if (stock >= 0) {
            this.stock=stock;
        }
    }

    public void AumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }

    public void DisminuirStock(int cantidad) {
        if (this.stock < cantidad) {
            System.out.println("La cantidad de disminución es mayor al stock");
        } else {
            this.stock -= cantidad;
        }
    }
}