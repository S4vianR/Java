import java.util.Scanner;;

public class Empleado {
    // Scanner
    Scanner s1 = new Scanner (System.in);
    // Atributos
    protected String nombre;
    protected long numEmpleado;
    protected double sueldo;

    //Constructor vacio
    public Empleado() {
    }

    //Constructor normal
    public Empleado(String nombre, long numEmpleado, double sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    //Metodos
    public String pago(){
        double pago = 2000.00;
        double bono = 0.00;
        double pagoT = pago + bono;
        this.setSueldo(pagoT);
        return "\nSe le ha pagado al empleado: " + this.getSueldo();
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(long numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //toString
    @Override
    public String toString() {
        return "\nNumEmpleado: " + numEmpleado + "\nSueldo:" + sueldo;
    }

}