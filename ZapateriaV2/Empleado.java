public class Empleado {
    // Atributos
    protected String nombre;
    protected long numEmpleado;
    protected double sueldo;

    // Constructor vacio
    public Empleado() {
    }

    // Constructor normal
    public Empleado(String nombre, long numEmpleado, double sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    // Metodos
    public double pago() {
        return getSueldo();
    }

    // Getters y setters
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
        if (numEmpleado < 0)
            System.out.println("Escriba un numero de empleado valido:");
        else if (numEmpleado > 0) {
            this.numEmpleado = 22180000 + numEmpleado;
        }

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo<1000)
            System.out.println("Escriba un salario valido, 1000 pesos es lo minimo");
        else
            this.sueldo = sueldo;
    }

    // toString
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nNumEmpleado: " + numEmpleado + "\nSueldo: " + sueldo;
    }

}