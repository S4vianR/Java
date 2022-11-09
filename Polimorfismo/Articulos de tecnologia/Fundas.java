public class Fundas extends Accesorio{
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
    private String marca;
    private String color;
    private String telefono;

    public Fundas(Double precio, Long clave, String marca, String color, String telefono) {
        super(precio, clave);
        this.marca = marca;
        this.color = color;
        this.telefono = telefono;
    }

    @Override
    public Double ventas() {
        return getPrecio() + (getPrecio() * 0.50);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\nFundas" + super.toString() + "\nMarca: " + marca + "\nColor: " + color + "\nTelefono: " + telefono;
    }
}
