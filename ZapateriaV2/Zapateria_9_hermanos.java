import java.util.ArrayList;
import java.util.Scanner;

public class Zapateria_9_hermanos {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static Scanner scannerDouble = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);
    private static int op = 0;
    private static char opC;
    private static double sueldo = 0.00;
    private static long numEmpleado = 0;
    private static String nombreEmpleado, puesto, ruta, encargado;

    public static void main(String[] args) {
        limpiarConsola();
        do {
            System.out.println(
                    "\nBienvenido\n"
                        + "1.Registro de empleados\n"
                        + "2.Listar empleados registrados\n"
                        + "3.Pagar quincena a todos\n"
                        + "4.Salir");
            op = scannerDouble.nextInt();
            limpiarConsola();
            switch(op) {
                case 1: agregarEmpleado(op); break;
                case 2: listar(); break;
                case 3: pago(); break;
                case 4: System.out.println("Gracias, vuelva pronto"); break;
                default: System.out.println("Opcion no valida");
            }
        } while (op != 4);
    }

    private static void agregarEmpleado(int op) {
        do {
            pedirDatosEmpleado();
            switch(op) {
                case 1: registroS(); break;
                case 2: registroR(); break;
                case 3: registroE(); break;
                default: System.out.println("Error");
            }
            System.out.println("\nDesea agregar a otro empleado (s/n):");
            opC = scannerDouble.next().charAt(0);
        } while (opC == 's' || opC == 'S');
    }

    public static String pedirNombre() {
        System.out.println("Cual es el nombre del empleado:");
        return scannerString.nextLine();
    }

    public static long pedirNumEmpleado() {
        long numEmpleado;
        do {
            System.out.println("Numero de empleado:");
            numEmpleado = scannerDouble.nextLong();
        } while (numEmpleado < 0);
        return numEmpleado;
    }
    
    public static double pedirSueldo() {
        double sueldo;
        do {
            System.out.println("Cual es el sueldo del empleado");
            sueldo = scannerDouble.nextDouble();
        } while (sueldo < 1000);
        return sueldo;
    }
    
    public static void pedirDatosEmpleado() {
        nombreEmpleado = pedirNombre();
        System.out.println("");
        sueldo = pedirSueldo();
        System.out.println("");
        numEmpleado = pedirNumEmpleado();
    }
    
    public static String predirPuesto() {
        System.out.println("Puesto (Dise??ador de bases de datos o Programador):");
        return scannerString.nextLine();
    }

    public static void registroS() {
        System.out.println("");
        puesto = predirPuesto();
        empleados.add(
            new Sistemas(nombreEmpleado, numEmpleado, sueldo, puesto)
        );
    }

    public static String pedirRuta() {
        System.out.println("Ruta:");
        return scannerString.nextLine();
    }

    public static void registroR() {
        System.out.println("");
        ruta = pedirRuta();
        
        empleados.add(
            new Repartidor(nombreEmpleado, numEmpleado, sueldo, ruta)
        );
    }

    public static String pedirEncargado() {
        System.out.println("Encargado: ");
        return scannerString.nextLine();
    }

    public static void registroE() {
        System.out.println("");
        encargado = pedirEncargado();

        empleados.add(
            new Actualiza(nombreEmpleado, numEmpleado, sueldo, encargado)
        );
    }

    public static void pago() {
        limpiarConsola();

        System.out.println("Pago de quincena a todos:");
        // Pago a todos
        for (Empleado p : empleados) {
            System.out.println("A " + p.getNombre() + " se le ha pagado " + p.pago() + " pesos");
        }
    }

    public static void listar() {
        limpiarConsola();

        for (Empleado b : empleados) {
            System.out.println(b);
        }
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
    }
}
