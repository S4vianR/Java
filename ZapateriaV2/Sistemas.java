public class Sistemas extends Empleado {
    // Atributos
    private String puesto;

    public Sistemas(String nombre, long numEmpleado, double sueldo, String puesto) {
        super(nombre, numEmpleado, sueldo, 3000.00);
        this.puesto = puesto;
    }

    // Getters y setters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + puesto;
    }   

}