
import java.util.Scanner;

public class InstitucionesEducativas {

    
    private String nombre;
    private String tipo;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;

   
    public InstitucionesEducativas(String nombre, String tipo, int numeroAlumnos, int numeroDocentes,
            int numeroSedes, double gastosProyectadosPorEstudiante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        calcularPresupuesto();  
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
        calcularPresupuesto();  
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public double getGastosProyectadosPorEstudiante() {
        return gastosProyectadosPorEstudiante;
    }

    public void setGastosProyectadosPorEstudiante(double gastosProyectadosPorEstudiante) {
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        calcularPresupuesto();  
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    
    private void calcularPresupuesto() {
        this.presupuesto = numeroAlumnos * gastosProyectadosPorEstudiante;
    }

  
    @Override
    public String toString() {
        return "InstitucionEducativa{"
                + "nombre='" + nombre + '\''
                + ", tipo='" + tipo + '\''
                + ", numeroAlumnos=" + numeroAlumnos
                + ", numeroDocentes=" + numeroDocentes
                + ", numeroSedes=" + numeroSedes
                + ", gastosProyectadosPorEstudiante=" + gastosProyectadosPorEstudiante
                + ", presupuesto=" + presupuesto
                + '}';
    }

    class Vista {
       

        public void mostrarInstitucion(InstitucionesEducativas institucion) {
            System.out.println("Detalles de la Institución Educativa:");
            System.out.println(institucion);
        }

      
        public void mostrarMensaje(String mensaje) {
            System.out.println(mensaje);
        }

        public String obtenerInput(String mensaje) {
            Scanner scanner = new Scanner(System.in);
            mostrarMensaje(mensaje);
            return scanner.nextLine();
        }

        public int obtenerInputInt(String mensaje) {
            Scanner scanner = new Scanner(System.in);
            mostrarMensaje(mensaje);
            return scanner.nextInt();
        }

        public double obtenerInputDouble(String mensaje) {
            Scanner scanner = new Scanner(System.in);
            mostrarMensaje(mensaje);
            return scanner.nextDouble();
        }
    }

    class Controlador {

        private Vista vista;
        private InstitucionesEducativas institucion;

       
        public Controlador(Vista vista) {
            this.vista = vista;
        }

       
        public void iniciar() {
        
            String nombre = vista.obtenerInput("Ingrese el nombre de la institución: ");
            String tipo = vista.obtenerInput("Ingrese el tipo de la institución: ");
            int numeroAlumnos = vista.obtenerInputInt("Ingrese el número de alumnos: ");
            int numeroDocentes = vista.obtenerInputInt("Ingrese el número de docentes: ");
            int numeroSedes = vista.obtenerInputInt("Ingrese el número de sedes: ");
            double gastosProyectadosPorEstudiante = vista.obtenerInputDouble("Ingrese los gastos proyectados por estudiante: ");

            institucion = new InstitucionesEducativas(nombre, tipo, numeroAlumnos, numeroDocentes, numeroSedes, gastosProyectadosPorEstudiante);

            vista.mostrarInstitucion(institucion);
        }
    }

     class Main {

        public static void main(String[] args) {
            Vista vista = new Vista(); 
            Controlador controlador = new Controlador(vista);  

            controlador.iniciar();
        }
    }
}
