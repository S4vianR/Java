public class Actualiza extends Empleado{
    private String encargado;

    public Actualiza(String nombre, long numEmpleado, float sueldo, String encargado) {
        super(nombre, numEmpleado, sueldo);
        this.encargado = encargado;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEncargado: " + encargado;
    }
    
    
}
