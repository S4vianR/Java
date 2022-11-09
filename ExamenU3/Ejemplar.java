import java.time.LocalDate;

public class Ejemplar {
    /*
     * Realizar jerarquía de clases para controlar el préstamo de libros en la
     * biblioteca de la ciudad
     * 
     * 1.-Se realizará una jerarquía de clases, con una clase base llamada
     * “Ejemplar” que tiene los atributos el autor y el título del ejemplar .
     * 
     * 2.-Se tienen 2 clases derivadas una para “Libros” y otra para “Revistas” ya
     * que la clase libros tienen además los atributos código, ISBN, editorial y
     * número de páginas. y las revistas tienen código, especialidad y fecha de
     * edición.
     * 
     * 3.-Las dos clases derivadas tienen un método llamado préstamo en el que se se
     * imprimirá la indicación el libro se puede prestar por una semana y las
     * revistas por 3 días.
     * 
     * 4.-Crear en main un objeto de una de las clases derivadas e imprimirlos con
     * el toString así como el método préstamo de cada uno de los objetos
     */

    protected String nombreAutor;
    protected long cedulaAutor;
    protected LocalDate fechaNAutor;
    protected String nombreEjemplar;

    public Ejemplar(String nombreAutor, long cedulaAutor, LocalDate fechaNAutor, String nombreEjemplar) {
        this.nombreAutor = nombreAutor;
        this.cedulaAutor = cedulaAutor;
        this.fechaNAutor = fechaNAutor;
        this.nombreEjemplar = nombreEjemplar;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public long getCedulaAutor() {
        return cedulaAutor;
    }

    public void setCedulaAutor(long cedulaAutor) {
        this.cedulaAutor = cedulaAutor;
    }

    public LocalDate getFechaNAutor() {
        return fechaNAutor;
    }

    public void setFechaNAutor(LocalDate fechaNAutor) {
        this.fechaNAutor = fechaNAutor;
    }

    public String getNombreEjemplar() {
        return nombreEjemplar;
    }

    public void setNombreEjemplar(String nombreEjemplar) {
        this.nombreEjemplar = nombreEjemplar;
    }

    @Override
    public String toString() {
        return "\nNombre del autor: " + nombreAutor + "\nCedula del autor: " + cedulaAutor
                + "\nFecha de nacimiento del autor: " + fechaNAutor
                + "\nNombre del ejemplar: " + nombreEjemplar;
    }
}