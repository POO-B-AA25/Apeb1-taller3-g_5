/*
public class EjecutorTerreno {
    public static Terreno terrenoX = new Terreno();
    public static void main(String[] args) {
        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valorMetro = (Math.random() * 10) + 1;
        System.out.println("Forma Larga: ");
        terrenoX.setAncho(ancho);
        terrenoX.setLargo(largo);
        terrenoX.setValorMetro(valorMetro);
        terrenoX.calcularArea();
        terrenoX.calcularCostoTerreno();
         System.out.println("TerrenoX: " + terrenoX.toString());
         System.out.println("Forma eficiente");
         Terreno miTerreno = new Terreno(2, 3, 3);
         miTerreno.calcularArea();
         miTerreno.calcularCostoTerreno();
         System.out.println("Mi terreno: " + miTerreno.toString());
    }
}


class Terreno {

    public double ancho;
    public double largo;
    public double valorMetro;
    public double area;
    public double costoTerreno;

    public Terreno() {
    }

    public Terreno(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetro = valorMetro;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getValorMetro() {
        return this.valorMetro;
    }

    public double getArea() {
        return this.area;
    }

    public double getCostoTerreno() {
        return this.costoTerreno;
    }

    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCostoTerreno() {
        this.costoTerreno = this.area * this.valorMetro;
    }

    public String toString() {
        return "{" + "Ancho: " + this.getAncho() + ", "
                + "Largo: " + this.getLargo() + ", "
                + "Valor del metro: " + this.getValorMetro() + ", "
                + "Area: " + this.getArea() + ", "
                + "Costo del terreno: " + this.getCostoTerreno();
    }
}
 */public class EjecutorTerreno {

    public static Terreno terrenoX = new Terreno();

    public static void main(String[] args) {
        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valorMetro = (Math.random() * 10) + 1;
        System.out.println("Forma Larga: ");
        terrenoX.setAncho(ancho);
        terrenoX.setLargo(largo);
        terrenoX.setValorMetro(valorMetro);
        terrenoX.calcularArea();
        terrenoX.calcularCostoTerreno();
        System.out.println("TerrenoX: " + terrenoX.toString());
        System.out.println("Forma eficiente");
        Terreno miTerreno = new Terreno(2, 3, 3);
        miTerreno.calcularArea();
        miTerreno.calcularCostoTerreno();
        System.out.println("Mi terreno: " + miTerreno.toString());
    }
}

class Terreno {

    public double ancho;
    public double largo;
    public double valorMetro;
    public double area;
    public double costoTerreno;

    public Terreno() {
    }

    public Terreno(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetro = valorMetro;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getValorMetro() {
        return this.valorMetro;
    }

    public double getArea() {
        return this.area;
    }

    public double getCostoTerreno() {
        return this.costoTerreno;
    }

    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCostoTerreno() {
        this.costoTerreno = this.area * this.valorMetro;
    }

    public String toString() {
        return "{" + "Ancho: " + this.getAncho() + ", "
                + "Largo: " + this.getLargo() + ", "
                + "Valor del metro: " + this.getValorMetro() + ", "
                + "Area: " + this.getArea() + ", "
                + "Costo del terreno: " + this.getCostoTerreno();
    }
}
