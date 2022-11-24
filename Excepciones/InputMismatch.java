import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num = 0;
        System.out.println("Captura un número entero: ");
        try {
            num = s1.nextInt();
            System.out.println("El número es: " + num);
        } catch (java.util.InputMismatchException e) {
            // System.out.println("Error: " + e.getMessage() + " " + e.getStackTrace());
            System.out.println("\nEl valor capturado no es un número entero");
            System.out.println("El mensaje del error es: \n");
            e.printStackTrace();
        }
    }
}
