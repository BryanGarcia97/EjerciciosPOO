package Calculadora;

import java.util.Scanner;
import Calculadora_Basica.Calculadora_Basica;
import Calculadora_Avanzada.Calculadora_Avanzada;

public class Calculadora {

    public static void main(String[] args) {
        int calculadora, opcion;
        double n1 = 0, n2 = 0, r = 0;
        String eleccion = "";

        Scanner leer = new Scanner(System.in);

        Calculadora_Basica basica = new Calculadora_Basica();
        Calculadora_Avanzada avanzada = new Calculadora_Avanzada();

        System.out.println("Elija la calculadora que desea: ");
        System.out.println("Basica = 1");
        System.out.println("Avanzada = 2\n");
        calculadora = leer.nextInt();
   
        if (calculadora == 1) {
            System.out.println("\nElija la opcion que quiere realizar:\n");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicación");
            System.out.println("4.División\n");
            opcion = leer.nextInt();

            System.out.println("\nEscriba el primer número");
            n1 = leer.nextInt();
            System.out.println("Escriba el segundo número");
            n2 = leer.nextInt();
       
            switch (opcion) {
                case 1:
                    r=n1+n2;
                    System.out.println("El resultado es "+r);
                    break;
                case 2:
                    r=n1-n2;
                    System.out.println("El resultado es "+r);
                    break;
                case 3:
                    r=n1*n2;
                    System.out.println("El resultado es "+r);
                    break;
                case 4:
                    r=n1/n2;
                    System.out.println("El resultado es "+r);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Elija la opcion: factorial = 1, opuesto = 2, potencia = 3");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    eleccion = "factorial";
                    System.out.println("Ingrese el numero 1: ");
                    n1 = leer.nextDouble();
                    r = avanzada.factorial(n1);
                    break;
                case 2:                    
                    eleccion = "opuesto";
                    System.out.println("Ingrese el numero 1: ");
                    n1 = leer.nextDouble();
                    r = avanzada.opuesto(n1);
                    break;
                case 3:
                    eleccion = "potencia";
                    System.out.println("Ingrese el numero 1: ");
                    n1 = leer.nextDouble();
                    System.out.println("Ingrese el numero 2: ");
                    n2 = leer.nextDouble();
                    r = avanzada.potencia(n1, n2);                    
                    break;
                default:
                    break;
            }
            System.out.println("El resultado de la operacion " + eleccion + " es: " + r);
        }
        
    }

}
