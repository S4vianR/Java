public class nullPointer {
    public static void main(String[] args) {
        String nombre = null;
        try {
            System.out.println("Nombre tiene " + nombre.length() + " letras");
        }

        catch (NullPointerException e) {
            System.out.println("el objeto es nulo");
        } catch (Exception e1) {
            System.out.println("ocurrio un error");
        }
    }
}