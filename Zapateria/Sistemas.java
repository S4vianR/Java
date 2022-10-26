public class Sistemas extends Empleado {
    private String puesto;

    public Sistemas(String nombre, long numEmpleado, float sueldo, String puesto) {
        super(nombre, numEmpleado, sueldo);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + puesto;
    }

}
