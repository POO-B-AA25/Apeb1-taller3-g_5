
import java.util.Scanner;

public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    // Constructor
    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.sueldoTotal = calcularSueldoTotal();
    }

    // Método para calcular el sueldo total
    private double calcularSueldoTotal() {
        return sueldoBasico + (sueldoBasico * 0.20);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
        this.sueldoTotal = calcularSueldoTotal(); // Actualizar sueldo total
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico + ", sueldoTotal=" + sueldoTotal + ", cedula=" + cedula + '}';
    }

    public class Vista {

        public void mostrarProfesor(Profesor profesor) {
            System.out.println(profesor);
        }

        public Profesor obtenerDatosProfesor() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del profesor: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del profesor: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el sueldo básico del profesor: ");
            double sueldoBasico = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese la cédula del profesor: ");
            String cedula = scanner.nextLine();

            return new Profesor(nombre, apellido, sueldoBasico, cedula);
        }
    }

    public class Controlador {

        private Vista vista;
        private Profesor profesor;

        public Controlador(Vista vista) {
            this.vista = vista;
        }

        public void iniciar() {
            profesor = vista.obtenerDatosProfesor();
            vista.mostrarProfesor(profesor);
         }
    }
}

