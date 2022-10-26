import java.util.Scanner;;

public class Empleado {
    // Scanner
    Scanner s1 = new Scanner (System.in)
    // Atributos
    protected String nombre;
    protected long numEmpleado;
    protected float sueldo;

    public Empleado() {
    }

    public Empleado(String nombre, long numEmpleado, float sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

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
        do{
            if (numEmpleado<0){
            System.out.println("Numero de empleado no valido, porfavor escriba otro: ");
            numEmpleado = s1.nextLong();
            }
        } while (numEmpleado>0);
        this.numEmpleado = numEmpleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + "]";
    }

}