import java.util.Scanner;

public class appZapateria {
    // Atributos estaticos
    static int op;
    // Empleados Normales
    static Empleado e1 = new Empleado("Juan Martinez", 22187489, 0);

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

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        do {
            System.out.println("1.Efectuar pago\n2.Salir");
            op = s1.nextInt();
            switch (op) {
                case 1: {
                    pagoEmpleados();
                    break;
                }
                case 2: {
                    System.out.println("Gracias, vuelva pronto");
                    break;
                }
            }

        } while (op != 2);
    }

    static public void pagoEmpleados() {
        Scanner s2 = new Scanner(System.in);
        int num = 0;
        System.out.println("Lista de empleados\nEmpleado 1: " + e1.getNombre() + "\nEmpleado 2:" + sis1.getNombre()
                + "\nEmpleado 3: " + sis2.getNombre() + "\nEmpleado 4: " + r1.getNombre() + "\nEmpleado 5: "
                + r2.getNombre() + "\nEmpleado 6: " + a1.getNombre() + "\nEmpleado 7: " + a2.getNombre()
                + "\nEmpleado 8: " + a3.getNombre());
        System.out.println("A quien desea efectuarle el pago, escoja numero de empleado (1-8):");
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
}