public class Cargador extends Accesorio {
    /*
     * VENTAS PARA EL BUEN FIN
     * 
     * Codificar esta jerarquía de clases, en donde el método ventas será programado
     * para realizar un calculo diferente en cada una de las clases concretas.
     * 
     * Con un porcentaje de descuento diferente:
     * 
     * Telefonos Iphone 20% de descuento
     * Telefonos Android 30% de descuento
     * Audífonos, 40% de descuento
     * Cases y cargadores 50% de descuento
     */
    private String telefono;
    private String tipoDeConexion;

    public Cargador(Double precio, Long clave, String telefono, String tipoDeConexion) {
        super(precio, clave);
        this.telefono = telefono;
        this.tipoDeConexion = tipoDeConexion;
    }

    @Override
    public Double ventas() {
        return getPrecio() + (getPrecio() * 0.50);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoDeConexion() {
        return tipoDeConexion;
    }

    public void setTipoDeConexion(String tipoDeConexion) {
        this.tipoDeConexion = tipoDeConexion;
    }

    @Override
    public String toString() {
        return "\nCargador" + super.toString() + "\nTelefono: " + telefono + "\nTipo de conexion: " + tipoDeConexion;
    }
}
