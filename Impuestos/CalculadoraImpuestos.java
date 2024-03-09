package Impuestos;

public class CalculadoraImpuestos {
    
    
        int ingresos;
        double ventas,porcentajeImpuestos, dividendos, exencion,impuestos;

        public CalculadoraImpuestos(int ingresos,double porcentajeImpuestos, double dividendos,double exencion){
            this.ingresos=ingresos;
            this.porcentajeImpuestos=porcentajeImpuestos;
            this.dividendos=dividendos;
            this.exencion=exencion;
        }

        public double calcularImpuestos(int ingresos){
            return ingresos+0.15;
        }

        public double calcularImpuestos(double ventas, double porcentajeImpuestos){
            return ventas*(porcentajeImpuestos/100);
        }

        public double calcularImpuestos(double dividendos, double porcentajeImpuestos, double exencion){
           impuestos=dividendos*(porcentajeImpuestos/100);
           if (impuestos>exencion) {
            return impuestos-exencion;
           }else{
            return 0;
           }
            
        }


    }
