public class Repartidor extends Empleado {
    // Atributos
    private String ruta;

    // Constructor
    public Repartidor(String nombre, long numEmpleado, double sueldo, String ruta) {
        super(nombre, numEmpleado, sueldo);
        this.ruta = ruta;
    }

    // Metoodo
    @Override
    public String pago() {
        double pago = 3000.00;
        double bono = 1000.00;
        double pagoT = pago + bono;
        this.setSueldo(pagoT);
        System.out.println("\nTendra un bono mensual de gasolina de: $" + bono + " pesos");
        return "\nSe le ha pagado al empleado: " + this.getSueldo();
    }

    // Getters y setters
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nRuta: " + ruta;
    }

}
