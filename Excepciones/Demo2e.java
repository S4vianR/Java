public class Demo2e {
    public static void main(String[] args) {
        int a = 18, b;
        try {
            b = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e1) {
            System.out.println("AE");
        } finally {
            b = a / 2;
            System.out.println("Se dividio entre 2 " + b);
        }

    }
}