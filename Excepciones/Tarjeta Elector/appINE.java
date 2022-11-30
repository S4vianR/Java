import java.time.LocalDate;
import java.util.Scanner;

public class appINE {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int numTarjeta, dia, mes, año;
        String nombre;
        try {
            System.out.println("Ingrese el nombre del titular de la tarjeta");
            nombre = s1.nextLine();
            System.out.println("Ingrese el numero de la credencial");
            numTarjeta = s1.nextInt();
            System.out.println("Ingrese el dia de vencimiento");
            dia = s1.nextInt();
            System.out.println("Ingrese el mes de vencimiento");
            mes = s1.nextInt();
            validaM(mes);
            System.out.println("Ingrese el año de vencimiento");
            año = s1.nextInt();
            INE tarjeta = new INE(numTarjeta, nombre, LocalDate.of(año, mes, dia));
            System.out.println(tarjeta);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (validaMes e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validaM(int mes) throws validaMes {
        if (mes < 1 || mes > 12) {
            throw new validaMes("El mes debe estar entre 1 y 12");
        }
    }

    public static void validaa(int año) throws validaAño {
        if (año < 2020) {
            throw new validaAño("El año debe ser mayor o igual a 2020");
        }
    }
}