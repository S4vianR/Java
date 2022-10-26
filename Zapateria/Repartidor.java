public class Repartidor extends Empleado{
    private String ruta;

    public Repartidor(String nombre, long numEmpleado, float sueldo, String ruta) {
        super(nombre, numEmpleado, sueldo);
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRuta: " + ruta;
    }
    
    
}
