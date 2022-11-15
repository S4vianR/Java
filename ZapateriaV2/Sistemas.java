public class Sistemas extends Empleado {
    // Atributos
    private String puesto;

    public Sistemas(String nombre, long numEmpleado, double sueldo, String puesto) {
        super(nombre, numEmpleado, sueldo);
        this.puesto = puesto;
    }

    public Sistemas(Sistemas mientraSistemas) {
        super(mientraSistemas.nombre,mientraSistemas.numEmpleado,mientraSistemas.sueldo);
        this.puesto = mientraSistemas.puesto;
    }

    // Metoodo
    @Override
    public double pago() {
        double bono = 3000.00;
        return bono + getSueldo();
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