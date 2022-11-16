public class Repartidor extends Empleado {
    // Atributos
    private String ruta;

    public Repartidor(String nombre, long numEmpleado, double sueldo, String ruta) {
        super(nombre, numEmpleado, sueldo, 1000.00);
        this.ruta = ruta;
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