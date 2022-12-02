import java.io.*;

public class EscribirFichero {
    public static void main(String[] args) {
        FileWriter Archivo = null;
        PrintWriter pw = null;

        // public Materia(String Nombre, int calificacion, int creditos, boolean
        // aprobada) {
        try {
            Archivo = new FileWriter("/home/reuben/Java/Archivos/prueba2.txt");
            pw = new PrintWriter(Archivo);
            for (int i = 0; i < 10; i++) {
                pw.println("Hola mundo " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // e.getMessage();
        } finally {
            try {
                // Aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != Archivo) {
                    Archivo.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}