package Cuenta_bancaria;

import java.util.ArrayList;


public class Banco {

    private ArrayList<Empleado> empleados;

    public Banco() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

        
    }
}
