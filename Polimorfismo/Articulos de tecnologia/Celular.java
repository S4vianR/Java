public abstract class Celular extends Articulo {
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
    protected String IMEI;

    public Celular(Double precio, Long clave, String IMEI) {
        super(precio, clave);
        this.IMEI = IMEI;
    }

    public abstract Double ventas();

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "\nCelular" + super.toString() + "\nIMEI: " + IMEI;
    }
}
