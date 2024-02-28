package Ejercicio;

import java.util.Scanner;

public class Producto {
    private String name;
    private double price;
    private int stock;
    public int aumentarStock;

    public Producto(String name,double price, int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }

    public Producto(String name,double price){
        this.name=name;
        this.price=price;
        price=0;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(){
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=name;
    }

    public double getStock(){
        return stock;
    }

    public void setStock(){
        this.stock=stock;
    }

    public int getAumentarStock(int aumento) {
        return aumentarStock+aumento;
    }

    public void setAumentarStock(int aumentarStock) {
        this.aumentarStock = aumentarStock;
    }

    String getDisminuirStock(int disminucion) {
        if (disminucion<stock) {
            return String.format("%.2f", stock-disminucion);
        }
        return "No puede quedar una disminucion negativa";
    }

    public void setDisminuirStock(int aumentarStock) {
        this.aumentarStock = aumentarStock;
    }
    
}
