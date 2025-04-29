
public class Problema_03_InstitucionEducativaEjecutor {
    public static InstitucionEducativa institucion1;
    public static InstitucionEducativa institucion2;
    public static void main(String[] args) {
        
        institucion1 = new InstitucionEducativa();
        String nombre = "Institucion Secundaria";
        String tipo = "Pública";
        int numeroAlumnos = 129;
        int numeroDocentes = 30;
        int numeroSedes = 12;
        double proyeccion = 120.4;
        
        institucion1.setNombre(nombre) ; 
        institucion1.setTipoInstitucion(tipo);
        institucion1.setNumeroAlumnos(numeroAlumnos);
        institucion1.setNumeroDocentes(numeroDocentes);
        institucion1.setNumeroSedes(numeroSedes);
        institucion1.setNumeroSedes(numeroSedes);
        institucion1.setGastosProyectadosPorEstudiante(proyeccion); 
        institucion1.calcularPresupuesto();
        
        System.out.println(institucion1); 

        institucion2 = new InstitucionEducativa("Escuela Primaria", "Pública", 300, 20, 2,300);
        institucion2.calcularPresupuesto(); 
        System.out.println(institucion2);
    }
}



class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;

    public InstitucionEducativa() {}

    public InstitucionEducativa(String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosProyectadosPorEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }
    
    public void setGastosProyectadosPorEstudiante(double gastosProyectadosPorEstudiante) {
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public double getGastosProyectadosPorEstudiante() {
        return gastosProyectadosPorEstudiante;
    }
    public double getCalcularPresupuesto() {
        return presupuesto;
    }

    public void calcularPresupuesto() {
        this.presupuesto = numeroAlumnos * gastosProyectadosPorEstudiante;
    }

    @Override
    public String toString() {
        return "Institución Educativa:\n"
                + "Nombre: " + nombre + "\n"
                + "Tipo: " + tipoInstitucion + "\n"
                + "Número de Alumnos: " + numeroAlumnos + "\n"
                + "Número de Docentes: " + numeroDocentes + "\n"
                + "Número de Sedes: " + numeroSedes + "\n"
                + "Gastos Proyectados por Estudiante: " + gastosProyectadosPorEstudiante + "\n"
                + "Presupuesto Total: " + presupuesto;
    }

    void setGastosProyectadosPorEstudiante() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
