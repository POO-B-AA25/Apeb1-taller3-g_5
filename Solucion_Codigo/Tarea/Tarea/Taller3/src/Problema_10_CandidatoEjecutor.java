import java.util.Scanner;

public class Problema_10_CandidatoEjecutor {
    public static Candidato candidato1;
    public static Candidato candidato2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Candidato candidato1 = new Candidato();
        System.out.print("Ingrese el nombre del candidato 1: ");
        candidato1.setNombre(sc.nextLine());
        
        System.out.print("Ingrese la edad del candidato 1: ");
        candidato1.setEdad(sc.nextInt());
        sc.nextLine(); 
        
        System.out.print("Ingrese el partido político del candidato 1: ");
        candidato1.setPartidoPolitico(sc.nextLine());
        
        System.out.print("Ingrese el plan de gobierno del candidato 1: ");
        candidato1.setPlanGobierno(sc.nextLine());
        
        System.out.print("Ingrese el número de propuestas del candidato 1: ");
        candidato1.setNumeroPropuestas(sc.nextInt());
        
        sc.nextLine(); 
        
        Candidato candidato2 = new Candidato("Luis Torres", "Partido Renovación Nacional");


        System.out.println("\nCandidato 1:");
        System.out.println(candidato1);

        System.out.println("\nCandidato 2:");
        System.out.println(candidato2);

    }
}
class Candidato {
    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numeroPropuestas;
    private String tipoCandidato; // Nuevo atributo

    // Constructor vacío
    public Candidato() {}

    // Constructor que recibe nombre y partido político
    public Candidato(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
    }

    // Constructor que recibe todos los atributos
    public Candidato(String nombre, int edad, String partidoPolitico, String planGobierno, int numeroPropuestas) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numeroPropuestas = numeroPropuestas;
        this.tipoCandidato = determinarTipoCandidato(); // Asignar tipo de candidato
    }

    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public void setNumeroPropuestas(int numeroPropuestas) {
        this.numeroPropuestas = numeroPropuestas;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public int getNumeroPropuestas() {
        return numeroPropuestas;
    }

    public String getTipoCandidato() {
        return tipoCandidato;
    }

    // Método para validar la edad mínima (debe ser al menos 35 años en Ecuador)
    public boolean validarEdadMinima() {
        return edad >= 35;
    }

    // Método para determinar el tipo de candidato
    private String determinarTipoCandidato() {
        return validarEdadMinima() ? "Candidato Elegible" : "Candidato No Elegible";
    }

    @Override
    public String toString() {
        return "CandidatoPresidencial{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Partido Político='" + partidoPolitico + '\'' +
                ", Plan de Gobierno='" + planGobierno + '\'' +
                ", Número de Propuestas Clave=" + numeroPropuestas +
                ", Cumple Edad Mínima=" + (validarEdadMinima() ? "Sí" : "No") +
                ", Tipo de Candidato='" + tipoCandidato + '\'' +
                '}';
    }
}