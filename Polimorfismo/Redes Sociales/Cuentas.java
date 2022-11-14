import java.time.LocalDate;

public class Cuentas {
    private String eMail;
    private String Contrasenia;
    private String nombre;
    private LocalDate Fnac;

    public Cuentas(String eMail, String Contrasenia, String nombre, LocalDate Fnac) {
        this.eMail = eMail;
        this.Contrasenia = Contrasenia;
        this.nombre = nombre;
        this.Fnac = Fnac;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFnac() {
        return Fnac;
    }

    public void setFnac(LocalDate Fnac) {
        this.Fnac = Fnac;
    }

    @Override
    public String toString() {
        return "\nEmail: " + eMail + "\nContraseña: " + Contrasenia + "\nNombre: " + nombre + "\nFecha de nacimiento: "
                + Fnac;
    }

}