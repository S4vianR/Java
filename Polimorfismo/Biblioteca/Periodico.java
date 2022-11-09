import java.time.LocalDate;
public class Periodico extends Ejemplar{
    private String editorial;
    private LocalDate fechaPublicacion;

    public Periodico(String titulo, String autor, String editorial, LocalDate fechaPublicacion) {
        super(titulo, autor);
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
    }

    public void prestamo() {
        System.out.println("Prestamo de periodico por una semana");
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "\nPeriodico" + super.toString() + "\nEditorial: " + editorial + "\nFecha de publicacion: " + fechaPublicacion;
    }
}
