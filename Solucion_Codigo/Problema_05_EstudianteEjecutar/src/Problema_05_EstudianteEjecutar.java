
import java.util.Scanner;

public class Problema_05_EstudianteEjecutar {

    public static Scanner sc = new Scanner(System.in);
    public static Estudiante estudiante1 = new Estudiante();
    public static Estudiante estudiante2 = new Estudiante();

    public static void main(String args[]) {

        estudiante1 = new Estudiante();

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = sc.nextLine();
        estudiante1.setNombreEstudiante(nombreEstudiante);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificacion de la materia 1: ");
        double ca1 = sc.nextDouble();
        estudiante1.setCalificacionMateria1(ca1);

        System.out.print("Ingrese la calificacion de la materia 2: ");
        double ca2 = sc.nextDouble();
        estudiante1.setCalificacionMateria2(ca2);

        System.out.print("Ingrese la calificacion de la materia 3: ");
        double ca3 = sc.nextDouble();
        estudiante1.setCalificacionMateria3(ca3);

        estudiante1.calcularPromedio();
        estudiante1.determinarEstado();

        System.out.println(estudiante1);

        estudiante2 = new Estudiante("Juan Perez", 7.5, 8.0, 6.0);
        estudiante2.calcularPromedio();
        estudiante2.determinarEstado();

       
        System.out.println(estudiante2);
    }
}

class Estudiante {

    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedio;
    private String estado;

    public Estudiante() {
    }

    public Estudiante(String nombreEstudiante, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3) {
        this.nombreEstudiante = nombreEstudiante;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
    }

    public void calcularPromedio() {
        this.promedio = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3) / 3;
    }

    public void determinarEstado() {
        this.estado = promedio >= 6.5 ? "Aprobado" : "Reprobado";
    }

    // Métodos get
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public double getCalificacionMateria1() {
        return calificacionMateria1;
    }

    public double getCalificacionMateria2() {
        return calificacionMateria2;
    }

    public double getCalificacionMateria3() {
        return calificacionMateria3;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEstado() {
        return estado;
    }

    // Métodos set
    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public void setCalificacionMateria1(double calificacionMateria1) {
        this.calificacionMateria1 = calificacionMateria1;
    }

    public void setCalificacionMateria2(double calificacionMateria2) {
        this.calificacionMateria2 = calificacionMateria2;
    }

    public void setCalificacionMateria3(double calificacionMateria3) {
        this.calificacionMateria3 = calificacionMateria3;
    }

   
    public String toString() {
        return "Estudiante:\n"
                + "Nombre: " + nombreEstudiante + "\n"
                + "Calificacion Materia 1: " + calificacionMateria1 + "\n"
                + "Calificacion Materia 2: " + calificacionMateria2 + "\n"
                + "Calificacion Materia 3: " + calificacionMateria3 + "\n"
                + "Promedio: " + promedio + "\n"
                + "Estado: " + estado;
    }
}


