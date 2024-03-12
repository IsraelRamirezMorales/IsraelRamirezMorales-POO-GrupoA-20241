package Cuenta_bancaria;

import java.util.ArrayList;

public class Banco {

    public static ArrayList<Integer> IDsExistentes = new ArrayList<>();

    private ArrayList<Empleado> empleados;

    public Banco(ArrayList<Empleado> empleados){
        this.empleados=new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    }

    
