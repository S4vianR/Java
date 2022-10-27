import java.util.ArrayList;
import java.util.Scanner;

public class Zapateria_9_hermanos {
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static Scanner s1 = new Scanner(System.in);
    static Scanner pNombres = new Scanner(System.in);
    static Scanner pPuesto = new Scanner(System.in);
    static int op = 0;
    static char opC;;
    static double sueldo = 0.00;
    static long numEmpleado = 0;
    static String nombreEmpleado = null, puesto = null, ruta = null, encargado = null;

    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033[H\033[2J");
        do {
            System.out.println(
                    "\nBienvenido\n1.Registro de empleado de sistemas\n2.Registro de empleado repartidor\n3.Registro de encargados de la zapateria\n4.Listar empleados registrados\n5.Pagar\n6.Salir");
            op = s1.nextInt();
            switch (op) {
                case 1: {
                    registroS();
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    listar();
                    break;
                }
                case 5: {
                    break;
                }
                case 6: {
                    System.out.println("Gracias, vuelva pronto");
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }
            }
        } while (op!=6);
    }

    static public void registroS() {
        // Limpiar consola
        System.out.print("\033[H\033[2J");
        Sistemas sis = new Sistemas();
        do {
            System.out.println("Cual es el nombre del empleado:");
            nombreEmpleado = pNombres.nextLine();
            sis.setNombre(nombreEmpleado);
            do{
            System.out.println("Cual es el sueldo del empleado");
            sueldo = s1.nextDouble();
            sis.setSueldo(sueldo);
            } while (sis.getSueldo()<1000);
            do{
            System.out.println("Numero de empleado:");
            numEmpleado = s1.nextLong();
            sis.setNumEmpleado(numEmpleado);
            } while (sis.getNumEmpleado()<0);
            System.out.println("Puesto (Diseñador de bases de datos o Programador:");
            puesto = pPuesto.nextLine();
            sis.setPuesto(puesto);
            System.out.println("\nDesea agregar a otro empleado normal (s/n):");
            opC = s1.next().charAt(0);
            Sistemas regS = new Sistemas(sis);
            empleados.add(regS);
        } while (opC == 's' || opC == 'S');
    }

    static public void listar() {
        // Limpiar consola
        System.out.print("\033[H\033[2J");
        for (Empleado b : empleados) {
            System.out.println(b);
        }
    }
}
