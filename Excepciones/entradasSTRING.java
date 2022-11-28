import java.util.Scanner;

public class entradasSTRING {
    public static void main(String[] args) {
        String[] dias = { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES"/* , "SABADO", "DOMINGO " */ };
        Scanner scanner = new Scanner(System.in);
        int day = 0; // día no valido por default
        do {
            System.out.print("Indique un día de la semana : ");
            try {
                day = scanner.nextInt();
            } catch (java.util.InputMismatchException e) // error con otros caracteres
            {
                System.out.println("Error: valor no válido. ");
                day = 0;
                // scanner = new Scanner(System.in);
            }
            if (day <= dias.length && day > 0) { // evita valores menores o iguales a cero y mayores a 7
                System.out.println(dias[day - 1]);
            } else {
                System.out.println("Día incorrecto");
            }
        } while (day != -1);
    }
}