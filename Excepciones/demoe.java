public class demoe {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        try {
            arreglo[10] = 24;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No existe el subindice");
        } finally {
            arreglo[9] = 24;
            System.out.println("se inserto el elemento " + arreglo[9]);
        }
    }
}