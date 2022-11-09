public abstract class Asistentes extends Persona {

    public Asistentes(String nombre, String telefono) {
        super(nombre, telefono);
    }

    public abstract Double cobro();
    public abstract String registro();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
