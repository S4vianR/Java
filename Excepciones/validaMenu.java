import java.util.Scanner;

class ExceptionMenu extends Exception {
    public ExceptionMenu(String msg) {
        super(msg);
    }
}

public class validaMenu {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String[] menuCafe = { "Café con leche", "Café solo", "Café con leche descafeinado", "Café solo descafeinado" };
        int tipoCafe;
        boolean exit = false;
        do {
            try {
                System.out.println("\nMenú de cafés disponibles:");
                for (int i = 0; i < menuCafe.length; i++) {
                    System.out.println((i + 1) + ". " + menuCafe[i]);
                }
                System.out.println("\nCaptura el numero de café");
                tipoCafe = s1.nextInt();
                if (tipoCafe < 1 || tipoCafe > 4) {
                    throw new ExceptionMenu("Opción no válida");
                } else {
                    System.out.println("\nEl café seleccionado es: " + menuCafe[tipoCafe - 1]);
                }
                exit = false;
            } catch (ExceptionMenu e) {
                System.out.println("\nError: " + e.getMessage());
                exit = true;
                s1.nextLine();
            }
        } while (exit);
    }
}