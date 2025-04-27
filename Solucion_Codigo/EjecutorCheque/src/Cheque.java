
import java.util.Random;

public class Cheque {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    // Constructor
    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        this.comisionBanco = calcularComisionBanco();
    }

    // Método para calcular la comisión del banco
    private double calcularComisionBanco() {
        return valorCheque * 0.003 / 100;
    }

    // Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
        this.comisionBanco = calcularComisionBanco(); // Actualizar comisión
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    @Override
    public String toString() {
        return "Cheque{" + "nombreCliente=" + nombreCliente + ", nombreBanco=" + nombreBanco + ", valorCheque=" + valorCheque + ", comisionBanco=" + comisionBanco + '}';
    }

    public class Vista {

        private Random random = new Random();

        public void mostrarCheque(Cheque cheque) {
            System.out.println(cheque);
        }

        public Cheque generarDatosCheque() {
            String[] nombresClientes = {"Juan Pérez", "María López", "Carlos García", "Ana Martínez", "Luis Fernández"};
            String[] nombresBancos = {"Banco A", "Banco B", "Banco C", "Banco D", "Banco E"};

            String nombreCliente = nombresClientes[random.nextInt(nombresClientes.length)];
            String nombreBanco = nombresBancos[random.nextInt(nombresBancos.length)];
            double valorCheque = 1000 + (random.nextDouble() * 9000); // Valor entre 1000 y 10000

            return new Cheque(nombreCliente, nombreBanco, valorCheque);
        }
    }

    public class Controlador {

        private Vista vista;
        private Cheque cheque;

        public Controlador(Vista vista) {
            this.vista = vista;
        }

        public void iniciar() {
            cheque = vista.generarDatosCheque();
            vista.mostrarCheque(cheque);
        }
    }
}

