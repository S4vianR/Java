public class DemoIndexEx {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println("El valor es: " + a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage() + " " + e.getStackTrace());
        }
    }
}
