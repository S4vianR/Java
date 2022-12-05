import java.io.*;
import java.util.Scanner;

public class Texto {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner s1 = new Scanner(System.in);
        limpiarConsola();
        do {
            System.out.println("\nOpciones: ");
            System.out.println("1. Crear fichero");
            System.out.println("2. Leer fichero");
            System.out.println("3. Salir");
            opcion = s1.nextInt();
            switch (opcion) {
                case 1:
                    limpiarConsola();
                    escribir();
                    System.out.println("\nFichero creado");
                    break;
                case 2:
                    limpiarConsola();
                    leer();
                    break;
                case 3:
                    limpiarConsola();
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 3);
    }

    public static void escribir() {
        FileWriter Archivo = null;
        PrintWriter pw = null;
        String texto = "\nSoy Reuben Rhienhart\nMi numero de control es: 20112048";
        try {
            Archivo = new FileWriter("/home/reuben/Java/Archivos/Practica/textoPractica.txt");
            pw = new PrintWriter(Archivo);
            pw.println(texto);
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

    public static void leer() {
        File Archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            Archivo = new File("/home/reuben/Java/Archivos/Practica/textoPractica.txt");
            fr = new FileReader(Archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null)
                System.out.println(linea);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
    }
}