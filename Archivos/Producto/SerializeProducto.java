import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeProducto implements Serializable {
    public SerializeProducto() {
        Producto[] p = {
                new Producto("COMPUTADORAS",
                        "Memoria Kingston Micro SD Clase 10 32GB", (float) 439.00),
                new Producto("PANTALLAS ",
                        "Apple TV-Spa ", (float) 1599.00),
                new Producto("JUGUETES ",
                        "Automóvil Radio Control Ferrari ", (float) 199.00)
        };
        try {
            FileOutputStream f = new FileOutputStream("/home/reuben/Java/Archivos/Producto/productos.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            for (Producto producto : p) {
                s.writeObject(producto);
            }
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SerializeProducto();
    }
}