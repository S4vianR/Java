public class Libro extends Ejemplar {
    private String ISBN;
    private String editorial;
    private byte edicion;

    public Libro(String titulo, String autor, String iSBN, String editorial, byte edicion) {
        super(titulo, autor);
        ISBN = iSBN;
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public void prestamo() {
        System.out.println("Prestamo de libro por una semana");
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public byte getEdicion() {
        return edicion;
    }

    public void setEdicion(byte edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "\nLibro" + super.toString() + "\nISBN: " + ISBN + "\nEditorial:" + editorial + "\nEdicion: " + edicion;
    }

}
