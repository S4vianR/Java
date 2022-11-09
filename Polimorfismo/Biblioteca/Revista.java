public class Revista extends Ejemplar{
    private String editorial;

    public Revista(String titulo, String autor, String editorial) {
        super(titulo, autor);
        this.editorial = editorial;
    }

    public void prestamo() {
        System.out.println("Prestamo de revista por una semana");
    }

    public String getEditorial() {
        return editorial;
    }
    
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "\nRevista" + super.toString() + "\nEditorial: " + editorial;
    }
}
