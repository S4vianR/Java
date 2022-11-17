public class Usuario {
    protected String nombreUsuario;
    protected String numeroTelefono;

    public Usuario(String nombreUsuario, String numeroTelefono) {
        this.nombreUsuario = nombreUsuario;
        this.numeroTelefono = numeroTelefono;
    }

    Double pago() {
        return 0.0;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "\nUsuario: " + nombreUsuario + " - Telefono: " + numeroTelefono;
    }
}
