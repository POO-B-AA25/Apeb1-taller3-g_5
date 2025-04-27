
public class CandidatoPresidencial {

    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numeroPropuestasClave;

    public CandidatoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.edad = 0;
        this.planGobierno = ""; 
        this.numeroPropuestasClave = 0; 
    }

    public CandidatoPresidencial(String nombre, int edad, String partidoPolitico, String planGobierno, int numeroPropuestasClave) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numeroPropuestasClave = numeroPropuestasClave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public void setNumeroPropuestasClave(int numeroPropuestasClave) {
        this.numeroPropuestasClave = numeroPropuestasClave;
    }

    public int getNumeroPropuestasClave() {
        return numeroPropuestasClave;
    }

    public boolean validarEdadMinima() {
        return edad >= 35; 

    }

    @Override
    public String toString() {
        return "CandidatoPresidencial{" + "nombre=" + nombre + ", edad=" + edad + ", partidoPolitico=" + partidoPolitico + ", planGobierno=" + planGobierno + ", numeroPropuestasClave=" + numeroPropuestasClave + '}';
    }

    public class Main {

        public static void main(String[] args) {
        
            CandidatoPresidencial candidato1 = new CandidatoPresidencial("Juan Pérez", "Partido A");
            System.out.println(candidato1);
            System.out.println("Cumple con la edad mínima: " + candidato1.validarEdad);
        }
    }
}