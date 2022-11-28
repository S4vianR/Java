import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        boolean valid = false;
        int num = 0;
        do {
            System.out.println("Captura un número entero: ");
            try {
                num = s1.nextInt();
                System.out.println("El número es: " + num);
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nEl valor capturado no es un número entero");
                System.out.println("\nError: " + e.getMessage() + " " + e.getStackTrace());
                valid = true;
            }

        } while (valid);
    }
}
