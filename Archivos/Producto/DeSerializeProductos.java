import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DeSerializeProductos implements Serializable{
    DeSerializeProductos() {
        Producto p = null;
        try {
            FileInputStream f = new FileInputStream("/home/reuben/Java/Archivos/Producto/productos.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            System.out.println("Objetos Producto Deserializados de productos.ser");
            int i = 0;
            try {
                while (true) {
                    p = (Producto) s.readObject();
                    System.out.println((++i) + ": " + p);
                }
            } catch (EOFException e) {
                System.out.println("Proceso terminado...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DeSerializeProductos();
    }
}