public class Producto {
    private String nombre;
    private String descripcion;
    private Float precio;

    public Producto(String nombre, String descripcion, Float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto\nNombre: " + nombre + "\nDescripcion: " + descripcion + "\nPrecio: " + precio;
    }
}