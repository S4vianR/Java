import java.time.LocalDate;;

class validaMes extends Exception {
    public validaMes(String msg) {
        super(msg);
    }
}

class validaAño extends Exception {
    public validaAño(String msg) {
        super(msg);
    }
}

public class INE {
    private int numTarjeta;
    private String nombre;
    private LocalDate fechaExpedicion;

    public INE(int numTarjeta, String nombre, LocalDate fechaExpedicion) {
        this.numTarjeta = numTarjeta;
        this.nombre = nombre;
        this.fechaExpedicion = fechaExpedicion;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    @Override
    public String toString() {
        return "\nTarjeta INE\nnumTarjeta: " + numTarjeta + "\nNombre: " + nombre + "\nFechaExpedicion: " + fechaExpedicion;
    }
}
