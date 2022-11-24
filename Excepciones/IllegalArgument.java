public class IllegalArgument {
    public static void main(String[] args) {
        int b[] = {1, 2, 3, 4, 5};
        try {
            System.out.println("La suma es: " + suma(b));
        } catch (IllegalArgumentException e) {
            System.out.println("El arreglo no tiene datos");
        }

    }

    public static int suma(int[] a) throws IllegalArgumentException {
        int sum = 0;
        if (a.length == 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }
        }
        return sum;
    }
}