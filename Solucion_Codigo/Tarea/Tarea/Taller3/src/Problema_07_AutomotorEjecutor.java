
import java.util.Scanner;

public class Problema_07_AutomotorEjecutor {
    public static Scanner sc = new Scanner(System.in);
    public static Automotor auto1;
    public static Automotor auto2;
    public static void main(String[] args) {
        
        System.out.print("Ingrese la cédula del dueño: ");
        String cedulaDueno = sc.nextLine();
        
        System.out.print("Ingrese la marca del vehículo: ");
        String marcaVehiculo = sc.nextLine();
        
        System.out.print("Ingrese el año de fabricación: ");
        int anioFabricacion = sc.nextInt();
        
        System.out.print("Ingrese el valor del vehículo: ");
        double valorVehiculo = sc.nextDouble();

        Automotor auto1 = new Automotor(cedulaDueno, marcaVehiculo, anioFabricacion, valorVehiculo);
        auto1.calcularValorMatricula();
        System.out.println(auto1);
        

        Automotor auto2 = new Automotor();
        auto2.setCedulaDueno("1234567890");
        auto2.setMarcaVehiculo("Toyota");
        auto2.setAnioFabricacion(2020);
        auto2.setValorVehiculo(20000.00);
        auto2.calcularValorMatricula();
        
        // Mostrar información del segundo automotor
        System.out.println(auto2);
    }
}
class Automotor {

    private String cedulaDueno;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {}


    public Automotor(String cedulaDueno, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula() {
        int aniosAntiguedad = 2025 - anioFabricacion;
        valorMatricula = (0.002 / 100) * valorVehiculo * aniosAntiguedad;
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    // Métodos set
    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
        
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
        
    }

    @Override
    public String toString() {
        return "Automotor{" +
                "Cédula Dueño='" + cedulaDueno + '\'' +
                ", Marca Vehículo='" + marcaVehiculo + '\'' +
                ", Año Fabricación=" + anioFabricacion +
                ", Valor Vehículo=" + valorVehiculo +
                ", Valor Matrícula=" + valorMatricula +
                '}';
    }
}
