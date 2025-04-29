
import java.util.Scanner;

public class Problema_02_EquivalenteHoraEjecutor {

    public static EquivalenteHora equivalente1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas: ");
        double horasIngresadas = sc.nextDouble();

        equivalente1 = new EquivalenteHora(horasIngresadas);
        equivalente1.calcularEquivalentes();

        System.out.println(equivalente1);
    }
}

class EquivalenteHora {

    public double horas;
    public double minutos;
    public double segundos;
    public double dias;

    public EquivalenteHora() {
    }

    public EquivalenteHora(double horas) {
        this.horas = horas;
    }

    public void calcularEquivalentes() {
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24;
    }

    public String toString() {
        return String.format("EquivalenteHora {horas= %.2f, minutos= %.2f, segundos= %.2f, dias= %.2f}",
                horas, minutos, segundos, dias);
    }
}

