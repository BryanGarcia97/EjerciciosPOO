package Mascotas;

import java.util.Scanner;

class Animal {
    String nombre;
    int edad;
    String alimento;
}

//Con extends realizamos la herencia de la clase animal y asi tenemos acceso a cada uno de sus miembros
class Gallo extends Animal {

    String color_plumas;

    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del gallo: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del gallo: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del gallo: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese el color de plumas del gallo: ");
        color_plumas = leer.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("nombre del gallo: " + nombre);
        System.out.println("edad del gallo: " + edad);
        System.out.println("alimento del gallo: " + alimento);
        System.out.println("color de plumas del gallo: " + color_plumas + "\n");

    }
}

class Perro extends Animal {

    String color_pelaje;
    
    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del perro: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del perro: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del perro: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese el color de pelaje del perro: ");
        color_pelaje = leer.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("nombre del perro: " + nombre);
        System.out.println("edad del perro: " + edad);
        System.out.println("alimento del perro: " + alimento);
        System.out.println("color de pelaje del perro: " + color_pelaje + "\n");

    }
}

class Gato extends Animal {

    String color_ojos;
    
    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del gato: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del gato: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del gato: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese el color de ojos del gato: ");
        color_ojos = leer.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("nombre del gato: " + nombre);
        System.out.println("edad del gato: " + edad);
        System.out.println("alimento del gato: " + alimento);
        System.out.println("color de ojos del gato: " + color_ojos + "\n");

    }
}

class Hamster extends Animal {

    int cantidad_pulgas;
    
    public void Captura() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hamster: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese la edad del hamster: ");
        edad = leer.nextInt();
        System.out.println("Ingrese el alimento del hamster: ");
        alimento = leer.nextLine();
        alimento = leer.nextLine();
        System.out.println("Ingrese la cantidad de pulgas del hamster: ");
        cantidad_pulgas = leer.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("nombre del hamster: " + nombre);
        System.out.println("edad del hamster: " + edad);
        System.out.println("alimento del hamster: " + alimento);
        System.out.println("cantidad de pulgas del hamster: " + cantidad_pulgas);

    }
}

public class Mascotas {

    public static void main(String[] args) {
        
        Gallo gallo = new Gallo();
        Perro perro = new Perro();
        Gato gato = new Gato();
        Hamster hamster = new Hamster();
        
        gallo.Captura();
        gallo.mostrarDatos();
        
        perro.Captura();
        perro.mostrarDatos();
        
        gato.Captura();
        gato.mostrarDatos();
        
        hamster.Captura();
        hamster.mostrarDatos();
    }

}
