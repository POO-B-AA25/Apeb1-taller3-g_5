
import java.util.Scanner;

public class Problema_04_EquipoCelularEjecutor {

    public static EquipoCelular equipo1;
    public static EquipoCelular equipo2;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        equipo1 = new EquipoCelular();
        System.out.print("Ingrese el sistema operativo: ");
        String sistemaOperativo = sc.nextLine();
        System.out.print("Ingrese el tamaño de pantalla (pulgadas): ");
        double tamanioPantalla = sc.nextDouble();
        System.out.print("Ingrese el costo inicial: ");
        double costoInicial = sc.nextDouble();
        System.out.print("Ingrese el IVA en porcentaje: ");
        double ivaPorcentaje = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese la direccion MAC: ");
        String direccionMac = sc.nextLine();

        System.out.print("Ingrese la informacion IMEI: ");
        String informacionIMEI = sc.nextLine();
        equipo1 = new EquipoCelular();
        equipo1.setSistemaOperativo(sistemaOperativo);
        equipo1.setTamanioPantalla(tamanioPantalla);
        equipo1.setTamanioPantalla(tamanioPantalla);
        equipo1.setCostoInicial(costoInicial);
        equipo1.setIvaPorcentaje(ivaPorcentaje);
        equipo1.setDireccionMac(direccionMac);
        equipo1.setInformacionIMEI(informacionIMEI);

        equipo1.calcularIvaDelCostoInicial();
        equipo1.calcularCostoFinal();
        System.out.println(equipo1);

        equipo2 = new EquipoCelular("Android", 6.5, 300.00, 12.0, "00:1A:2B:3C:4D:5E", "123456789012345");
        equipo2.calcularIvaDelCostoInicial();
        equipo2.calcularCostoFinal();
        System.out.println(equipo2);
    }
}

class EquipoCelular {

    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private String direccionMac;
    private String informacionIMEI;
    private double iva;
    private double costoFinal;

    // Constructor vacío
    public EquipoCelular() {
    }

    // Constructor con parámetros
    public EquipoCelular(String sistemaOperativo, double tamanioPantalla, double costoInicial, double ivaPorcentaje, String direccionMac, String informacionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
    }

    public void calcularIvaDelCostoInicial() {
        this.iva = costoInicial * (ivaPorcentaje / 100);
    }

    public void calcularCostoFinal() {
        this.costoFinal = costoInicial + iva;
    }

    // Métodos get
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public String getInformacionIMEI() {
        return informacionIMEI;
    }

    public double getIva() {
        return iva;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    // Métodos set
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setInformacionIMEI(String informacionIMEI) {
        this.informacionIMEI = informacionIMEI;
    }

    public String toString() {
        return "Equipo Celular:\n"
                + "Sistema Operativo: " + sistemaOperativo + "\n"
                + "Tamanioo de Pantalla: " + tamanioPantalla + " pulgadas\n"
                + "Costo Inicial: " + costoInicial + "\n"
                + "IVA en Porcentaje: " + ivaPorcentaje + "%\n"
                + "IVA del Costo Inicial: " + iva + "\n"
                + "Costo Final: " + costoFinal + "\n"
                + "Direccion MAC: " + direccionMac + "\n"
                + "Informacion IMEI: " + informacionIMEI;
    }
}

