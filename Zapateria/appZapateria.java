import java.util.Scanner;

public class appZapateria {
    // Todo lo estatico es para que se conozca globalmente en el programa
    // Atributos estaticos
    static int op;
    // Empleados Normales
    static Empleado e1 = new Empleado("Juan Martinez", 21187489, 0);

    // Sistemas
    static Sistemas sis1 = new Sistemas("Pedro Pezuñas", 201899874, 0, "Diseñador de bases de datos");
    static Sistemas sis2 = new Sistemas("Antonio Balderas", 21185874, 0, "Programador");

    // Repartidores
    static Repartidor r1 = new Repartidor("Pepe Balderas", 19184507, 0, "Zona Centro");
    static Repartidor r2 = new Repartidor("Pepe Florencia", 19185874, 0, "Colonia Central");

    // Encargados
    static Actualiza a1 = new Actualiza("Benedicto Gomez", 20180012, 0, "Calzado de hombre");
    static Actualiza a2 = new Actualiza("Gloria Perez", 20180013, 0, "Calzado de mujer");
    static Actualiza a3 = new Actualiza("Rodrigo Lopez", 20180014, 0, "Calzado de niños");

    // Objetos con constructores vacios para registro de empleados
    static Empleado registroE = new Empleado();
    static Sistemas registroS = new Sistemas();
    static Repartidor registtroR = new Repartidor();
    static Actualiza registroA = new Actualiza();

    public static void main(String[] args) {
        // Scanner
        Scanner s1 = new Scanner(System.in);

        // Limpiar consola
        System.out.print("\033[H\033[2J");

        // Menu
        do {
            System.out.println(
                    "\nBienvenido al sistema\n1.Registro de empleados\n2.Efectuar pago\n3.Informacion de todos los empleados\n4.Salir\n");
            op = s1.nextInt();
            switch (op) {
                case 1: {
                    registroEmpleados();
                    break;
                }

                case 2: {
                    pagoEmpleados();
                    break;
                }
                case 3: {
                    System.out.println(e1.toString());
                    System.out.println(sis1.toString());
                    System.out.println(sis2.toString());
                    System.out.println(r1.toString());
                    System.out.println(r2.toString());
                    System.out.println(a1.toString());
                    System.out.println(a2.toString());
                    System.out.println(a3.toString());
                    // Solo imprime un objeto registrado
                    System.out.println(registroE.toString());
                    break;
                }
                case 4: {
                    System.out.println("Gracias, vuelva pronto");
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }
            }

        } while (op != 4);
    }

    static public void pagoEmpleados() {
        Scanner s2 = new Scanner(System.in);
        int num = 0;
        System.out.println("\nLista de empleados\nEmpleado 1: " + e1.getNombre() + "\nEmpleado 2:" + sis1.getNombre()
                + "\nEmpleado 3: " + sis2.getNombre() + "\nEmpleado 4: " + r1.getNombre() + "\nEmpleado 5: "
                + r2.getNombre() + "\nEmpleado 6: " + a1.getNombre() + "\nEmpleado 7: " + a2.getNombre()
                + "\nEmpleado 8: " + a3.getNombre());
        System.out.println("\nA quien desea efectuarle el pago, escoja numero de empleado (1-8):\n");
        num = s2.nextInt();
        if (num == 1)
            e1.pago();
        else if (num == 2)
            sis1.pago();
        else if (num == 3)
            sis2.pago();
        else if (num == 4)
            r1.pago();
        else if (num == 5)
            r2.pago();
        else if (num == 6)
            a1.pago();
        else if (num == 7)
            a2.pago();
        else if (num == 8)
            a3.pago();
        else
            System.out.println("Error");
    }

    static public void registroEmpleados() {
        Scanner nom = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        String nombre;
        long numEmpleado;
        double sueldo;
        do {
            System.out.println(
                    "\nA que departamento desea registrar el empleado\n1.Sistemas (No sirve)\n2.Repartidor (No sirve)\n3.Encargado (No sirve)\n4.Otro departamento (Si sirve)\n5.Volver (Si sirve)");
            op = s3.nextInt();
            switch (op) {
                case 1:
                case 2:
                case 3:
                case 4: {
                    System.out.println("Nombre del empleado:");
                    nombre = nom.nextLine();
                    registroE.setNombre(nombre);
                    System.out.println(
                            "Numero del empleado: (Los numeros de empelados empiezan con 2218 seguido con 4 numeros que seran los numeros de empleado");
                    numEmpleado = s3.nextLong();
                    registroE.setNumEmpleado(numEmpleado);
                    do {
                        System.out.println("Cual sera el sueldo del empleado: (No puede ser menor de 1000 pesos)");
                        sueldo = s3.nextDouble();
                        if (sueldo > 1000) {
                            System.out.println("El suelo de " + sueldo + " pesos es valido");
                            registroE.setSueldo(sueldo);
                            break;
                        } else
                            System.out.println("Es invalido, escriba de nuevo el sueldo");
                    } while (sueldo < 1000);
                    System.out.println("Los datos del nuevo empleado registrado son: " + registroE.toString());
                    break;
                }
                case 5: {
                    System.out.println("Va a volver al menu anterior");
                    break;
                }
                default: {
                    System.out.println("Error");
                    break;
                }
            }
        } while (op != 5);
    }
}