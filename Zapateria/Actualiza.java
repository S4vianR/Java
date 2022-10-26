public class Actualiza extends Empleado{
    // Atributos
    private String encargado;

    //Constructor
    public Actualiza(String nombre, long numEmpleado, double sueldo, String encargado) {
        super(nombre, numEmpleado, sueldo);
        this.encargado = encargado;
    }

    //Metoodo
    @Override
    public String pago(){
        double pago = 2500.00;
        double bono = 500.00;
        double pagoT = pago + bono;
        System.out.println("Tendra un bono mesual añadido a su sueldo de: $" + bono + " pesos");
        this.setSueldo(pagoT);
        return "\nSe le ha pagado al empleado: " + this.getSueldo();
    }

    //Getters y setters
    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nEncargado: " + encargado;
    }
    
    
}
