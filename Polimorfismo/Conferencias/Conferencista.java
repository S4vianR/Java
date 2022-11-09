public class Conferencista extends Persona{
    private String conferencia;

    public Conferencista(String nombre, String telefono, String conferencia) {
        super(nombre, telefono);
        this.conferencia = conferencia;
    }

    public Double pago (){
        return 1000.00;
    }

    public String getConferencia() {
        return conferencia;
    }

    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }

    @Override
    public String toString() {
        return "\nConferencista" + super.toString() + "\nConferencia: " + conferencia;
    }
}
