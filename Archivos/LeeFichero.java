import java.io.*;

class LeeFichero {
    public static void main(String[] arg) {
        File Archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            Archivo = new File("/home/reuben/Java/Archivos/prueba2.txt");
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