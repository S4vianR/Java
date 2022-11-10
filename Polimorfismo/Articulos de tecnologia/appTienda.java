import java.util.ArrayList;

public class appTienda {
    static ArrayList<Articulo> articulos = new ArrayList<Articulo>();

    public static void main(String[] args) {
        articulos.add(new iPhone(17000.0, (long) 10965, "123456789", "iPhone 12"));
        articulos.add(new Android(10000.0, (long) 20578, "987654321", "Galaxy S20", "Samsung"));
        articulos.add(new Audifonos(1000.0, (long) 30117, "Audifonos Sony"));
        articulos.add(new Cargador(200.00, (long) 40999, "Samsung", "Tipo C"));
        articulos.add(new Fundas(500.00, (long) 50178, "Otterbox", "Negro", "Samsung Galaxy A53 5G"));
        System.out.println("articulos:");
        for (Articulo art : articulos) {
            System.out.println(art);
            if (art instanceof Celular) {
                System.out.println("Precio de venta original es de: " + ((Celular) art).getPrecio()
                        + "\nPrecio de venta total sumando impuestos: " + ((Celular) art).ventas());
            } else if (art instanceof Accesorio) {
                System.out.println("Precio de venta original es de: " + ((Accesorio) art).getPrecio()
                        + "\nPrecio de venta total sumando impuestos: " + ((Accesorio) art).ventas());
            }
        }
    }
}
