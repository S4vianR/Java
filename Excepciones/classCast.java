import java.util.Vector;

public class classCast {
    public static void main(String[] args) {
        Vector V = new Vector();
        Integer entero = 9;
        String nombre = "Hola";
        V.add(entero);
        V.add(nombre);
        Object O = V;
        try {
            String Letrero = (String) O;
            V.add(Letrero);
        } catch (ClassCastException e) {
            System.out.println("Se produjo un error de casteo");
            System.out.println(V);
        }
    }
}