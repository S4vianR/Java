import java.util.Scanner;
import java.io.*;

public class Persona {
    private String numTelefono;
    private String nombre;
    private String direccion;

    public Persona(String numTelefono, String nombre, String direccion) {
        this.numTelefono = numTelefono;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "\nPersona\nNombre: " + nombre + "\nNumero de telefono: " + numTelefono + "\nDireccion: " + direccion;
    }

    public static void main(String[] args) {
        int opcion = 0;
        Scanner s1 = new Scanner(System.in);

        do {
            System.out.println("\nOpcciones: ");
            System.out.println("1. Agregar datos");
            System.out.println("2. Leer datos");
            System.out.println("3. Salir");
            System.out.println("\nIngrese una opcion: ");
            opcion = s1.nextInt();

            switch (opcion) {
                case 1:
                    escribir();
                    break;
                case 2:
                    leer();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 3);
    }

    public static void escribir() {
        /*
         * Scanner s1 = new Scanner(System.in);
         * System.out.println("Ingrese el numero de telefono: ");
         * String numTelefono = s1.nextLine();
         * System.out.println("Ingrese el nombre: ");
         * String nombre = s1.nextLine();
         * System.out.println("Ingrese la direccion: ");
         * String direccion = s1.nextLine();
         * 
         * Persona p1 = new Persona(numTelefono, nombre, direccion);
         * System.out.println(p1.toString());
         */

        FileWriter Archivo = null;
        PrintWriter pw = null;
        Persona P001 = new Persona("123456789", "Juan", "Calle 1");
        // Persona P001 = new Persona(numTelefono, nombre, direccion);
        try {
            Archivo = new FileWriter("/home/reuben/Java/Archivos/Persona/persona.txt");
            pw = new PrintWriter(Archivo);
            pw.println(P001.toString());
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
            Archivo = new File("/home/reuben/Java/Archivos/Persona/persona.txt");
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
}