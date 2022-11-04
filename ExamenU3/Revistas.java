import java.time.LocalDate;

public class Revistas extends Ejemplar {
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

    private long codigo;
    private String especialidad;
    private LocalDate fechaEdicion;

    public Revistas(String nombreAutor, long cedulaAutor, LocalDate fechaNAutor, String nombreEjemplar, long codigo,
            String especialidad, LocalDate fechaEdicion) {
        super(nombreAutor, cedulaAutor, fechaNAutor, nombreEjemplar);
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.fechaEdicion = fechaEdicion;
    }

    public String prestamo() {
        return "\nEl dia de hoy es: " + LocalDate.now() + "\nY la revista: " + this.getNombreEjemplar()
                + " solo se le prestara por 3 dias";
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(LocalDate fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCodigo de revista: " + codigo + "\nEspecialidad: " + especialidad
                + "\nFecha de edicion: " + fechaEdicion;
    }
}
