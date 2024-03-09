package Empleado;

public class Empleado {
    double sueldoBase,bonificacion,horasExtras;

    public Empleado(double sueldoBase,double bonificacion,double horasExtras){
        this.sueldoBase=sueldoBase;
        this.bonificacion=bonificacion;
        this.horasExtras=horasExtras;
    }
    
    public double calcularSalario(double sueldoBase){
        return sueldoBase;
    }
    
    public double calcularSalario(double sueldoBase,double bonificacion){
        return sueldoBase+bonificacion;
    }

    public double calcularSalario(double sueldoBase,double bonificacion,double horasExtras){
        return sueldoBase+bonificacion+(horasExtras*20);
    }
}
