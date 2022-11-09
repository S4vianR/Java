public abstract class Accesorio extends Articulo{
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
    public Accesorio(Double precio, Long clave) {
        super(precio, clave);
    }
    
    public abstract Double ventas();

    @Override
    public String toString() {
        return "\nAccesorio" + super.toString();
    }
}
