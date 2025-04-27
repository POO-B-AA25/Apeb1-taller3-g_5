
import java.util.Scanner;

public class Celular {

    // Atributos de la clase Celular
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private String direccionMac;
    private String informacionIMEI;

    public Celular(String sistemaOperativo, double tamanioPantalla, double costoInicial, double ivaPorcentaje, 
                   String direccionMac, String informacionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
    }

    private Scanner scanner = new Scanner(System.in);

    public String pedirSistemaOperativo() {
        System.out.println("Ingrese el sistema operativo:");
        return scanner.nextLine();
    }

    public double pedirTamanioPantalla() {
        System.out.println("Ingrese el tamanio de pantalla (pulgadas):");
        return scanner.nextDouble();
    }

    public double pedirCostoInicial() {
        System.out.println("Ingrese el costo inicial:");
        return scanner.nextDouble();
    }

    public double pedirIvaPorcentaje() {
        System.out.println("Ingrese el IVA en porcentaje:");
        return scanner.nextDouble();
    }

    public String pedirDireccionMac() {
        scanner.nextLine(); 
        System.out.println("Ingrese la direccinn MAC:");
        return scanner.nextLine();
    }

    public String pedirInformacionIMEI() {
        System.out.println("Ingrese la informacion IMEI:");
        return scanner.nextLine();
    }

    public void mostrarCelular() {
        System.out.println("Celular: ");
        System.out.println("Sistema operativo: " + sistemaOperativo);
        System.out.println("Tamanio de pantalla: " + tamanioPantalla + " pulgadas");
        System.out.println("Costo inicial: " + costoInicial);
        System.out.println("IVA: " + ivaPorcentaje + "%");
        System.out.println("Direccion MAC: " + direccionMac);
        System.out.println("Informacion IMEI: " + informacionIMEI);
    }

    public class Controlador {

        private Celular vista;

        public Controlador() {
            vista = new Celular("", 0, 0, 0, "", ""); 
        }

        public void iniciar() {
            String sistemaOperativo = vista.pedirSistemaOperativo();
            double tamanioPantalla = vista.pedirTamanioPantalla();
            double costoInicial = vista.pedirCostoInicial();
            double ivaPorcentaje = vista.pedirIvaPorcentaje();
            String direccionMac = vista.pedirDireccionMac();
            String informacionIMEI = vista.pedirInformacionIMEI();
            Celular celular = new Celular(sistemaOperativo, tamanioPantalla, costoInicial, ivaPorcentaje, direccionMac, informacionIMEI);
            celular.mostrarCelular();
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular("", 0, 0, 0, "", "");
        Controlador controlador = celular.new Controlador(); 
        controlador.iniciar();
    }
}

