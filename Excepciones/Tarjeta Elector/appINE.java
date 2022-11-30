import java.time.LocalDate;
import java.util.Scanner;

public class appINE {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        int numTarjeta = 0, dia = 0, mes = 0, año = 0;
        String nombre = null;
        try {
            System.out.println("Ingrese el nombre del titular de la tarjeta");
            nombre = s2.nextLine();
            System.out.println("Ingrese el numero de la credencial");
            numTarjeta = s1.nextInt();
            System.out.println("Ingrese el dia de vencimiento");
            dia = s1.nextInt();
            System.out.println("Ingrese el mes de vencimiento");
            mes = s1.nextInt();
            validaM(mes);
            System.out.println("Ingrese el año de vencimiento");
            año = s1.nextInt();
            validaA(año);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (validaMes e) {
            System.out.println("Error: " + e.getMessage());
            mes = 1;
        } catch (validaAño e1) {
            System.out.println("Error: " + e1.getMessage());
            año = 2000;
        } catch (Exception e2) {
            System.out.println("Error: " + e2.getMessage());
        } finally {
            INE tarjeta = new INE(numTarjeta, nombre, LocalDate.of(año, mes, dia));
            System.out.println(tarjeta);
        }
    }

    public static void validaM(int mes) throws validaMes {
        if (mes < 1 || mes > 12) {
            throw new validaMes("El mes debe estar entre 1 y 12");
        }
    }

    public static void validaA(int año) throws validaAño {
        if (año < LocalDate.now().getYear()) {
            throw new validaAño("El año debe ser mayor o igual a " + LocalDate.now().getYear());
        }
    }
}