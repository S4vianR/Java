public class iPhone extends Celular {
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
    private String modelo;

    public iPhone(Double precio, Long clave, String IMEI, String modelo) {
        super(precio, clave, IMEI);
        this.modelo = modelo;
    }

    @Override
    public Double ventas() {
        return getPrecio() + (getPrecio() * 0.20);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nCelular iPhone" + super.toString() + "\nModelo: " + modelo;
    }
}
