import java.util.Scanner;

class ExceptionNoAprobado extends Exception {
    public ExceptionNoAprobado(String msg) {
        super(msg);
    }
}

public class NoAprobado {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno");
        nota1 = s1.nextInt();
        System.out.println("Introduce la nota del alumno");
        nota2 = s1.nextInt();
        System.out.println("Introduce la nota del alumno");
        nota3 = s1.nextInt();
        try {
            int prom;
            prom = promedio(nota1, nota2, nota3);
            System.out.println("El promedio es: " + prom + " y el alumno ha aprobado");
        } catch (ExceptionNoAprobado e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static public int promedio(int nota1, int nota2, int nota3) throws ExceptionNoAprobado {
        int promedio = ((nota1 + nota2 + nota3) / 3);
        if (promedio < 70) {
            throw new ExceptionNoAprobado("El alumno no ha aprobado, tiene " + promedio);
        }
        return promedio;
    }
}
