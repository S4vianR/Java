import java.time.LocalDate;

public class Libros extends Ejemplar {
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

    private long ISBN;
    private String editorial;
    private int numPaginas;

    public Libros(String nombreAutor, long cedulaAutor, LocalDate fechaNAutor, String nombreEjemplar, long iSBN,
            String editorial, int numPaginas) {
        super(nombreAutor, cedulaAutor, fechaNAutor, nombreEjemplar);
        ISBN = iSBN;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
    }

    public String prestamo() {
        return "\nEl dia de hoy es: " + LocalDate.now()
                + "\nY el libro de: " + this.getNombreEjemplar()
                + " solamente se le puede prestar una semana, despues de eso devuelvalo porfavor";
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long iSBN) {
        ISBN = iSBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nISBN:" + ISBN + "\nEditorial: " + editorial + "\nNumero de paginas: " + numPaginas;
    }
}
