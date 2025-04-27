
import java.util.Scanner;

public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;

    public EquivalenteHora(double horas) {
        this.horas = horas;
        calcularEquivalentes();
    }
        private void calcularEquivalentes() {
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24;
    }

    public String toString() {
        return "EquivalenteHora{" + "horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + ", dias=" + dias + '}';
    }

}

 class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas: ");
        int horas = scanner.nextInt();

        EquivalenteHora equivalenteHora = new EquivalenteHora(horas);
        System.out.println(equivalenteHora);
        EquivalenteHora equivalenteHoraVacio = new EquivalenteHora(0);
        System.out.println("Objeto con constructor vacio:");
        System.out.println(equivalenteHoraVacio);

        scanner.close();
    }
}

