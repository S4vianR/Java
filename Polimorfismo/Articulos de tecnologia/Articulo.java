public abstract class Articulo {
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
     protected Double precio;
     protected Long clave;

     public Articulo(Double precio, Long clave) {
         this.precio = precio;
         this.clave = clave;
     }

        public abstract Double ventas();

        public Double getPrecio() {
            return precio;
        }

        public void setPrecio(Double precio) {
            this.precio = precio;
        }

        public Long getClave() {
            return clave;
        }

        public void setClave(Long clave) {
            this.clave = clave;
        }

        @Override
        public String toString() {
            return "\nClave: " + clave + "\nPrecio: " + precio;
        }
}