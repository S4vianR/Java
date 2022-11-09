public abstract class Ejemplar {
    protected String titulo;
    protected String autor;

    public Ejemplar(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void prestamo();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo + "\nAutor: " + autor;
    }

}