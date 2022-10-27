public class Actualiza extends Empleado {
    // Atributos
    private String encargado;

    // Constructor
    public Actualiza() {
        super();
    }

    public Actualiza(String nombre, long numEmpleado, double sueldo, String encargado) {
        super(nombre, numEmpleado, sueldo);
        this.encargado = encargado;
    }

    public Actualiza(Actualiza mientrasActualiza) {
        super(mientrasActualiza.nombre, mientrasActualiza.numEmpleado, mientrasActualiza.sueldo);
        this.encargado = encargado;
    }

    // Metoodo
    @Override
    public double pago() {
        double bono = 500.00;
        return bono + getSueldo();
    }

    // Getters y setters
    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nEncargado: " + encargado;
    }

}