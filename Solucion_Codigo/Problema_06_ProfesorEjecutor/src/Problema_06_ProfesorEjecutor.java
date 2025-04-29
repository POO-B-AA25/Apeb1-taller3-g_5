
import java.util.Scanner;

public class Problema_06_ProfesorEjecutor {

    public static Profesor profesor01;
    public static Profesor profesor02;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        profesor01 = new Profesor();

        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = sc.nextLine();
        profesor01.setNombre(nombre);

        System.out.print("Ingrese el apellido del profesor: ");
        String apellido = sc.nextLine();
        profesor01.setApellido(apellido);

        System.out.print("Ingrese la cedula del profesor: ");
        String cedula = sc.nextLine();
        profesor01.setCedula(cedula);

        System.out.print("Ingrese el sueldo basico del profesor: ");
        double sueldoBasico = sc.nextDouble();
        profesor01.setSueldoBasico(sueldoBasico);

        profesor01.calcularSueldoTotal();

        System.out.println(profesor01);

        profesor02 = new Profesor("Ana", "Garcia", "123456789", 1500.00);
        profesor02.calcularSueldoTotal();

        System.out.println(profesor02);
    }
}

class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String cedula, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = sueldoBasico + (sueldoBasico * 0.20); // Sueldo total es sueldo básico + 20% del sueldo básico
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String toString() {
        return "Profesor:\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido: " + apellido + "\n"
                + "Cedula: " + cedula + "\n"
                + "Sueldo Basico: " + sueldoBasico + "\n"
                + "Sueldo Total: " + sueldoTotal;
    }
}


