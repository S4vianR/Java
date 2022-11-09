public class Alumnos extends Asistentes{
    private long noControl;

    public Alumnos(String nombre, String telefono, long noControl) {
        super(nombre, telefono);
        this.noControl = noControl;
    }   

    @Override
    public Double cobro() {
        return 150.00;
    }

    @Override
    public String registro() {
        return "El alumno " + nombre + " con numero de control " + noControl + " se registro";
    }

    public long getNoControl() {
        return noControl;
    }

    public void setNoControl(long noControl) {
        this.noControl = noControl;
    }

    @Override
    public String toString() {
        return "\nAlumno" + super.toString() + "\nNo. Control: " + noControl;
    }
}
