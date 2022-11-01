import java.util.ArrayList;
import java.util.Scanner;

public class Zapateria_9_hermanos {
    static ArrayList<Empleado> empleados = new ArrayList<>();
    static Scanner s1 = new Scanner(System.in);
    static Scanner pNombres = new Scanner(System.in);
    static Scanner pString = new Scanner(System.in);
    static int op = 0;
    static char opC;;
    static double sueldo = 0.00;
    static long numEmpleado = 0;
    static String nombreEmpleado, puesto, ruta, encargado;

    public static void main(String[] args) {

        // Limpiar consola
        System.out.print("\033[H\033[2J");
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

    static public void registroS() {
        // Limpiar consola
        System.out.print("\033[H\033[2J");
        Sistemas sis = new Sistemas();
        do {
            System.out.println("Cual es el nombre del empleado:");
            nombreEmpleado = pNombres.nextLine();
            sis.setNombre(nombreEmpleado);
            System.out.println("Puesto (Diseñador de bases de datos o Programador):");
            puesto = pString.nextLine();
            sis.setPuesto(puesto);
            do {
                System.out.println("Cual es el sueldo del empleado");
                sueldo = s1.nextDouble();
                sis.setSueldo(sueldo);
            } while (sis.getSueldo() < 1000);
            do {
                System.out.println("Numero de empleado:");
                numEmpleado = s1.nextLong();
                sis.setNumEmpleado(numEmpleado);
            } while (sis.getNumEmpleado() < 0);
            System.out.println("\nDesea agregar a otro empleado (s/n):");
            opC = s1.next().charAt(0);
            Sistemas regSistemas = new Sistemas(sis);
            empleados.add(regSistemas);
        } while (opC == 's' || opC == 'S');
    }

    static public void registroR() {
        // Limpiar consola
        System.out.print("\033[H\033[2J");
        Repartidor rep = new Repartidor();
        do {
            System.out.println("Cual es el nombre del empleado:");
            nombreEmpleado = pNombres.nextLine();
            rep.setNombre(nombreEmpleado);
            System.out.println("Ruta (Zona Centro, Colonia del Real, Colonia El Pontificio, etc):");
            ruta = pString.nextLine();
            rep.setRuta(ruta);
            do {
                System.out.println("Cual es el sueldo del empleado");
                sueldo = s1.nextDouble();
                rep.setSueldo(sueldo);
            } while (rep.getSueldo() < 1000);
            do {
                System.out.println("Numero de empleado:");
                numEmpleado = s1.nextLong();
                rep.setNumEmpleado(numEmpleado);
            } while (rep.getNumEmpleado() < 0);
            System.out.println("\nDesea agregar a otro empleado (s/n):");
            opC = s1.next().charAt(0);
            Repartidor regRepartidor = new Repartidor(rep);
            empleados.add(regRepartidor);
        } while (opC == 's' || opC == 'S');
    }

    static public void registroE() {
        // Limpiar consola
        System.out.print("\033[H\033[2J");
        Actualiza act = new Actualiza();
        do {
            System.out.println("Cual es el nombre del empleado:");
            nombreEmpleado = pNombres.nextLine();
            act.setNombre(nombreEmpleado);
            System.out.println("De que es encargado (Calzado de hombre, mujer o niños)");
            encargado = pString.nextLine();
            act.setEncargado(encargado);
            do {
                System.out.println("Cual es el sueldo del empleado");
                sueldo = s1.nextDouble();
                act.setSueldo(sueldo);
            } while (act.getSueldo() < 1000);
            do {
                System.out.println("Numero de empleado:");
                numEmpleado = s1.nextLong();
                act.setNumEmpleado(numEmpleado);
            } while (act.getNumEmpleado() < 0);
            System.out.println("\nDesea agregar a otro empleado (s/n):");
            opC = s1.next().charAt(0);
            Actualiza regActualiza = new Actualiza(act);
            empleados.add(regActualiza);
        } while (opC == 's' || opC == 'S');
    }

    static public void pago() {
        // Limpiar consola
        System.out.print("\033[H\033[2J");

        System.out.println("Pago de quincena a todos:");
        // Pago a todos
        for (Empleado p : empleados) {
            System.out.println("A " + p.getNombre() + " se le ha pagado " + p.pago() + " pesos");
        }

    }

    static public void listar() {
        // Limpiar consola
        System.out.print("\033[H\033[2J");

        for (Empleado b : empleados) {
            System.out.println(b);
        }

    }
}