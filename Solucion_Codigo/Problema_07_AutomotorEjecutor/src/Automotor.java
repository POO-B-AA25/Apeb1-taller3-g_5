
import java.util.Scanner;

public class Automotor {

    private String cedulaDueno;
    private String marca;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String cedulaDueno, String marca, int anioFabricacion, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.valorMatricula = calcularValorMatricula();
    }

    private double calcularValorMatricula() {
        int antiguedad = 2023 - anioFabricacion;
        return (valorVehiculo * 0.002 / 100) * antiguedad;
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
        this.valorMatricula = calcularValorMatricula();
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
        this.valorMatricula = calcularValorMatricula();
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public String toString() {
        return "Automotor{" + "cedulaDueno=" + cedulaDueno + ", marca=" + marca + ", anioFabricacion=" + anioFabricacion + ", valorVehiculo=" + valorVehiculo + ", valorMatricula=" + valorMatricula + '}';
    }

}

class Vista {

    public void mostrarAutomotor(Automotor automotor) {
        System.out.println(automotor);
    }

    public Automotor obtenerDatosAutomotor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cedula del duenio: ");
        String cedulaDueno = scanner.nextLine();
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el año de fabricacion: ");
        int anioFabricacion = scanner.nextInt();
        System.out.print("Ingrese el valor del vehiculo: ");
        double valorVehiculo = scanner.nextDouble();

        return new Automotor(cedulaDueno, marca, anioFabricacion, valorVehiculo);
    }
}

class Controlador {

    private Vista vista;
    private Automotor automotor;

    public Controlador(Vista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        automotor = vista.obtenerDatosAutomotor();
        vista.mostrarAutomotor(automotor);
    }
}

