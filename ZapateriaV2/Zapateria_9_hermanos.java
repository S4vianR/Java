import java.util.ArrayList;
import java.util.Scanner;

public class Zapateria_9_hermanos {
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static Scanner s1 = new Scanner(System.in);
    static Scanner pNombres = new Scanner(System.in);
    static Scanner pString = new Scanner(System.in);
    static int op = 0;
    static char opC;
    static double sueldo = 0.00;
    static long numEmpleado = 0;
    static String nombreEmpleado, puesto, ruta, encargado;

    public static void main(String[] args) {
        limpiarConsola();
        do {
            System.out.println(
                    "\nBienvenido\n1.Registro de empleado de sistemas\n2.Registro de empleado repartidor\n3.Registro de encargados de la zapateria\n4.Listar empleados registrados\n5.Pagar quincena a todos\n6.Salir");
            op = s1.nextInt();
            switch (op) {
                case 1: {
                    registroS();
                    break;
                }
                case 2: {
                    registroR();
                    break;
                }
                case 3: {
                    registroE();
                    break;
                }
                case 4: {
                    listar();
                    break;
                }
                case 5: {
                    pago();
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
        } while (op != 6);
    }

    public static void registroS() {
        limpiarConsola();
        do {
            System.out.println("Cual es el nombre del empleado:");
            nombreEmpleado = pNombres.nextLine();
            System.out.println("Puesto (Diseñador de bases de datos o Programador):");
            puesto = pString.nextLine();
            do {
                System.out.println("Cual es el sueldo del empleado");
                sueldo = s1.nextDouble();
            } while (sueldo < 1000);
            do {
                System.out.println("Numero de empleado:");
                numEmpleado = s1.nextLong();
            } while (numEmpleado < 0);
            Sistemas regSistemas = new Sistemas(nombreEmpleado, numEmpleado, sueldo, puesto);
            empleados.add(regSistemas);
            System.out.println("\nDesea agregar a otro empleado (s/n):");
            opC = s1.next().charAt(0);
        } while (opC == 's' || opC == 'S');
    }

    public static void registroR() {
        limpiarConsola();
        do {
            System.out.println("Cual es el nombre del empleado:");
            nombreEmpleado = pNombres.nextLine();
            System.out.println("Ruta (Zona Centro, Colonia del Real, Colonia El Pontificio, etc):");
            ruta = pString.nextLine();
            do {
                System.out.println("Cual es el sueldo del empleado");
                sueldo = s1.nextDouble();
            } while (sueldo < 1000);
            do {
                System.out.println("Numero de empleado:");
                numEmpleado = s1.nextLong();
            } while (numEmpleado < 0);
            Repartidor regRepartidor = new Repartidor(nombreEmpleado, numEmpleado, sueldo, ruta);
            empleados.add(regRepartidor);
            System.out.println("\nDesea agregar a otro empleado (s/n):");
            opC = s1.next().charAt(0);
        } while (opC == 's' || opC == 'S');
    }

    public static void registroE() {
        limpiarConsola();
        do {
            System.out.println("Cual es el nombre del empleado:");
            nombreEmpleado = pNombres.nextLine();
            System.out.println("De que es encargado (Calzado de hombre, mujer o niños)");
            encargado = pString.nextLine();
            do {
                System.out.println("Cual es el sueldo del empleado");
                sueldo = s1.nextDouble();
            } while (sueldo < 1000);
            do {
                System.out.println("Numero de empleado:");
                numEmpleado = s1.nextLong();
            } while (numEmpleado < 0);
            Actualiza actualiza = new Actualiza(nombreEmpleado, numEmpleado, sueldo, encargado);
            empleados.add(actualiza);
            System.out.println("\nDesea agregar a otro empleado (s/n):");
            opC = s1.next().charAt(0);
        } while (opC == 's' || opC == 'S');
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