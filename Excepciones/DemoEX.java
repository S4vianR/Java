public class DemoEX {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("El resultado es: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
