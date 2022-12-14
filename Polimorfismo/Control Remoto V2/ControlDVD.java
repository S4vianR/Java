public class ControlDVD extends ControlRemoto implements Cambios {
    private String Pelicula;
    private String Idioma;

    public ControlDVD(String Pelicula, String Idioma, String color, String marca, String modelo) {
        super(color, marca, modelo);
        this.Pelicula = Pelicula;
        this.Idioma = Idioma;
    }

    public void cambiar() {
        System.out.println("Puedes cambiar pelicila e idioma");
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nControl DVD" + "\nPelicula: " + Pelicula + "\nIdioma: " + Idioma;
    }
}