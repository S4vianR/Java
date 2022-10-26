public class Sistemas extends Empleado {
    //Atributos
    private String puesto;

    //Constructor
    public Sistemas(String nombre, long numEmpleado, double sueldo, String puesto) {
        super(nombre, numEmpleado, sueldo);
        this.puesto = puesto;
    }

    //Metoodo
    @Override
    public String pago(){
        double pago = 4500.00;
        double bono = 3000.00;
        double pagoT = pago + bono;
        System.out.println("Tendra un bono mensual de: $" + bono + " pesos por pertenecer al departamento de sistemas");
        this.setSueldo(pagoT);
        return "\nSe le ha pagado al empleado: " + this.getSueldo();
    }

    //Getters y setters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nPuesto: " + puesto;
    }

}
