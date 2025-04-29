import java.util.Scanner;

public class Problema_08_ChequeEjecutor {
    public static Cheque cheque1;
    public static Cheque cheque2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        
        System.out.print("Ingrese el nombre del banco: ");
        String nombreBanco = sc.nextLine();
        
        System.out.print("Ingrese el valor del cheque: ");
        double valorCheque = sc.nextDouble();


        cheque1 = new Cheque(nombreCliente, nombreBanco, valorCheque);


        System.out.println(cheque1);

        cheque2.setNombreCliente("Maria Lopez");
        cheque2.setNombreBanco("Banco de Guayaquil");
        cheque2.setValorCheque(1000.00);

        System.out.println(cheque2);
    }
}
class Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    // Constructor vacío
    public Cheque() {}

    // Constructor que recibe nombre del cliente, nombre del banco y valor del cheque
    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularComisionBanco();
    }

    private void calcularComisionBanco() {
        comisionBanco = (0.003 / 100) * valorCheque;
    }

    // Métodos get
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    // Métodos set
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;

    }

    @Override
    public String toString() {
        return "Cheque{" +
                "Nombre Cliente='" + nombreCliente + '\'' +
                ", Nombre Banco='" + nombreBanco + '\'' +
                ", Valor Cheque=" + valorCheque +
                ", Comisión Banco=" + comisionBanco +
                '}';
    }
}