public class Repartidor extends Empleado {
    // Atributos
    private String ruta;

    // Constructor
    public Repartidor() {
        super();
    }

    public Repartidor(String nombre, long numEmpleado, double sueldo, String ruta) {
        super(nombre, numEmpleado, sueldo);
        this.ruta = ruta;
    }

    public Repartidor(Repartidor mientrasRepartidor) {
        super(mientrasRepartidor.nombre, mientrasRepartidor.numEmpleado, mientrasRepartidor.sueldo);
        this.ruta = mientrasRepartidor.ruta;
    }

    // Metoodo
    @Override
    public double pago() {
        double bono = 1000.00;
        return bono + getSueldo();
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