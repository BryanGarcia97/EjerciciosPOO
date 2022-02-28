package Calculadora_Avanzada;

public class Calculadora_Avanzada {

    public double potencia(double n1, double potencia) {
        
        return Math.pow(n1, potencia);
    }

    public double factorial(double n1) {
        
        double factorial = 1;
        while (n1 != 0) {
            factorial = factorial * n1;
            
            n1--;
        }

        return factorial;
    }
    
    public double opuesto(double n1) {
       double opuesto = 0;
       
       if(n1 > 0){
           opuesto = n1 * -1;
       }
       else if(n1 < 0){
           
           opuesto = Math.abs(n1);
       }
       
       return opuesto;
    }
}
