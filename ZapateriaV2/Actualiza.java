public class Actualiza extends Empleado {
    // Atributos
    private String encargado;

    public Actualiza(String nombre, long numEmpleado, double sueldo, String encargado) {
        super(nombre, numEmpleado, sueldo, 500.00);
        this.encargado = encargado;
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