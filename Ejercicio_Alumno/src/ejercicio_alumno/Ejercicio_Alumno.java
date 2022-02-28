package ejercicio_alumno;

public class Ejercicio_Alumno {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.capturaEstudiante();
        estudiante.capturaMaterias();
        estudiante.datosPersonales();

        System.out.println("-----------Datos Personales---------------");
        System.out.println("Nombre: " + estudiante.nombre);
        System.out.println("Edad: " + estudiante.edad);
        System.out.println("Carnet: " + estudiante.carnet);
        System.out.println("Genero: " + estudiante.genero);
        System.out.println("Numero Telefono: " + estudiante.numeroTelefono);
        System.out.println("Direccion: " + estudiante.direccion);
        System.out.println("Responsable: " + estudiante.responsable);

        System.out.println("-----------MATERIAS----------------");
        System.out.println("Materia 1: " + estudiante.mat1);
        System.out.println("Materia 2: " + estudiante.mat2);
        System.out.println("Materia 3: " + estudiante.mat3);
        System.out.println("Materia 4: " + estudiante.mat4);
        System.out.println("Materia 5: " + estudiante.mat5);

    }

}
