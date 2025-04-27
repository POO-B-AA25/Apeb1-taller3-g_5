
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int calcularAntiguedad(Fecha fechaActual) {
        int antiguedad = fechaActual.getAnio() - this.anio;

        if (fechaActual.getMes() < this.mes || (fechaActual.getMes() == this.mes && fechaActual.getDia() < this.dia)) {
            antiguedad--;
        }

        return antiguedad;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

    public class Emprendimiento {

        private String nombreComercial;
        private String ruc;
        private String sectorEconomico;
        private String propietario;
        private String ubicacion;
        private Fecha fechaInicio;
        private double capitalInicial;

        public Emprendimiento(String nombreComercial, String ruc, String sectorEconomico, String propietario, String ubicacion, Fecha fechaInicio, double capitalInicial) {
            this.nombreComercial = nombreComercial;
            this.ruc = ruc;
            this.sectorEconomico = sectorEconomico;
            this.propietario = propietario;
            this.ubicacion = ubicacion;
            this.fechaInicio = fechaInicio;
            this.capitalInicial = capitalInicial;
        }

        public void actualizarInformacion(String nuevoNombre, String nuevoRuc, String nuevoSector, String nuevoPropietario, String nuevaUbicacion, double nuevoCapital) {
            this.nombreComercial = nuevoNombre;
            this.ruc = nuevoRuc;
            this.sectorEconomico = nuevoSector;
            this.propietario = nuevoPropietario;
            this.ubicacion = nuevaUbicacion;
            this.capitalInicial = nuevoCapital;
        }

        public int calcularAntiguedad(Fecha fechaActual) {
            return fechaInicio.calcularAntiguedad(fechaActual);
        }

    }
}
