
import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;

    public Estudiante(String nombre, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3) {
        this.nombre = nombre;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
    }

    public double calcularPromedio() {
        return (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
    }

    public String estadoAprobacion() {
        return calcularPromedio() >= 6.5 ? "Aprobado" : "Reprobado";
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Calificación 1: " + calificacionMateria1
                + ", Calificación 2: " + calificacionMateria2
                + ", Calificación 3: " + calificacionMateria3
                + ", Promedio: " + calcularPromedio()
                + ", Estado: " + estadoAprobacion();
    }

    public class Vista {

        private Scanner scanner = new Scanner(System.in);

        public String pedirNombre() {
            System.out.print("Ingrese el nombre del estudiante: ");
            return scanner.nextLine();
        }

        public double pedirCalificacion(int numeroMateria) {
            System.out.print("Ingrese la calificación de la materia " + numeroMateria + ": ");
            return scanner.nextDouble();
        }

        public void mostrarEstudiante(Estudiante estudiante) {
            System.out.println(estudiante);
        }
    }

    public class Controlador {

        private Vista vista;

        public Controlador() {
            vista = new Vista();
        }

        public void iniciar() {
            String nombre = vista.pedirNombre();
            double calificacion1 = vista.pedirCalificacion(1);
            double calificacion2 = vista.pedirCalificacion(2);
            double calificacion3 = vista.pedirCalificacion(3);

            Estudiante estudiante = new Estudiante(nombre, calificacion1, calificacion2, calificacion3);
            vista.mostrarEstudiante(estudiante);
        }
    }
}

