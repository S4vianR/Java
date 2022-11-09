public class General extends Asistentes{
    private String organizacion;

    public General(String nombre, String telefono, String organizacion) {
        super(nombre, telefono);
        this.organizacion = organizacion;
    }

    @Override
    public Double cobro() {
        return 50.00;
    }

    @Override
    public String registro() {
        return "El invitado " + nombre + " de la organizacion " + organizacion + " se registro";
    }
    
    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    @Override
    public String toString() {
        return "\nInvitado" + super.toString() + "\nOrganizacion: " + organizacion;
    }
}
