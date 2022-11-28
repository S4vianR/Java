class ExcepcionEdades extends Exception {
    public ExcepcionEdades(String msg) {
        super(msg);
    }
}

public class Edades {
    public static void main(String[] args) {
        String edad = "12";
        try {
            int edadN = Integer.parseInt(edad);
            if (edadN < 18 || edadN > 40) {
                throw new ExcepcionEdades("Números fuera del intervalo de edades permitidos");
            }
        } catch (ExcepcionEdades e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("Edad valido");
        }
    }
}