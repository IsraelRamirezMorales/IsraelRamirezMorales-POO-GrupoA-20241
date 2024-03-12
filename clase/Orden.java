package clase;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;

public class Orden {
    
    private ArrayList<Platillos> priceList;
    private double totalOrden;
    private ArrayList<Platillos> platillosList;

    public Orden(ArrayList<Platillos> priceList,ArrayList<Platillos> platillosList,double totalOrden,ArrayList<Clientes> clientes){


    }


    public void sumarOrden(double price){
        for(int i=0;i<orderList.size();i++){
            totalOrden+=price;           
        }        
    }

    public double mostrarTotalOrden(){
        return totalOrden;
    }

    public void mostrarOrdenes(){

    }

    public ArrayList<Platillos> getPlatillos(){
        return platillosList;
    }

    public ArrayList<Platillos> getOrden(){
        return orden;
    }

    public static void mostrarTodasLasOrdenes(Orden orden,Scanner scanner){
         System.out.println("Informacion de todas las ordenes: ");
         for (Clientes cli:orden.getOrden()){
            System.out.println("Nombre: "+cli.getName());
         }
    }

    public static void mostrarOrdenEspecifico(Orden orden,Scanner scanner){
        System.out.println("Ingresa el nombre del cliente: ");
        scanner.nextLine();
        String name=scanner.nextLine();
        Cliente clienteEspecifico=null;
        for (Client cli: orden.getClient()) {
            if (cli.getName().equals) {
                
            }
        }
    }
}
