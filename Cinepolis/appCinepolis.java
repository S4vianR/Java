package Cinepolis;

import java.time.LocalDate;
import java.util.Scanner;

public class appCinepolis {
    static int precioMembresia = 350;
    static int op = 0;

    public static void main(String[] args) {
        // Afiliacion
        Scanner nom = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        String nombre;
        int dia, mes, año;
        System.out.println("Cual es su nombre:");
        nombre = nom.nextLine();
        System.out.println("Cual es su dia de nacimiento:");
        dia = s1.nextInt();
        System.out.println("Cual es su mes de nacimiento (1-12):");
        mes = s1.nextInt();
        System.out.println("Cual es su año de nacimiento:");
        año = s1.nextInt();

        // Miembros
        MembresiaFan m1 = new MembresiaFan(precioMembresia, nombre, LocalDate.of(año, mes, dia), 874596, 0, 0);

        // Menu
        do {

            System.out.println(
                    "\nBienvenido " + m1.getNombreTitular()
                            + "\nQue quiere hacer:\n1.Ir al cine\n2.Comprobar si puede ascender\n3.Celebrar cumpleaños (si es que lo es)\n4.Obtener descuento en entradas\n5.Comprobar beneficios\n6.Salir");
            op = s1.nextInt();
            switch (op) {
                case 1: {
                    m1.irAlCine();
                    break;
                }
                case 2: {
                    m1.comprobarAscenso();
                    if (m1.comprobarAscenso() == "Fanatico") {
                        System.out.println("Se ha ganado el ascenso a fanatico");
                        System.out.println("Se ha ganado el acceso al menu secreto, escriba 7 para acceder a él");
                    } else if (m1.comprobarAscenso() == "Super fanatico") {
                        System.out.println("Se ha ganado el ascenso a super fanatico");
                        System.out.println(
                                "Se ha ganado el acceso al menu secreto, escriba 7 para el menu fanatico o 8 para el superfanatico");
                    }
                    break;
                }
                case 3: {
                    m1.celebrarCumpleaños();
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    m1.conocerBeneficios();
                    break;
                }
                case 6: {
                    System.out.println("\nVuelva pronto");
                    break;
                }
                case 7: {
                    if (m1.comprobarAscenso() == "Fanatico") {
                        int opcion = 0;
                        Scanner mF = new Scanner(System.in);
                        int descuentoComboLunes = 189;
                        int precioEspecialEntrada = 30;
                        MembresiaFanatico Fanatico = new MembresiaFanatico(precioMembresia, nombre,
                                LocalDate.of(año, mes, dia),
                                m1.getNumTarjeta(), m1.getVisitasAlCine(), m1.getPuntos(), precioEspecialEntrada,
                                descuentoComboLunes);
                        do {
                            System.out.println("\n1.Refill fanatico\n2.Descuento combo lunes\n3.Volver");
                            opcion = mF.nextInt();
                            switch (opcion) {
                                case 1: {
                                    Fanatico.refillFanatico();
                                    break;
                                }
                                case 2: {
                                    Fanatico.descuentoComboLunes();
                                    break;
                                }
                                case 3: {
                                    System.out.println("Vuelva pronto");
                                    break;
                                }
                                default:
                                    System.out.println("Introduzca una opcion valida");
                            }
                        } while (opcion != 3);
                    } else
                        System.out.println("Usted no es fanatico");
                    break;
                }
                case 8: {
                    if (m1.comprobarAscenso() == "Super fanatico") {
                        int opcion = 0;
                        Scanner mF = new Scanner(System.in);
                        int descuentoComboLunes = 189;
                        int precioEspecialEntrada = 30;
                        MemberesiaSFanatico SFanatico = new MemberesiaSFanatico(precioMembresia, nombre,
                                LocalDate.of(año, mes, dia), m1.getNumTarjeta(), m1.getVisitasAlCine(), m1.getPuntos(),
                                precioEspecialEntrada, descuentoComboLunes, 10);
                        do {
                            System.out.println("\n1.Paga menos con puntos\n2.Descuento Cinepolis Klic\n3.Volver");
                            opcion = mF.nextInt();
                            switch (opcion) {
                                case 1: {
                                    SFanatico.descuentoPuntos();
                                    break;
                                }
                                case 2: {
                                    SFanatico.usarCuponCineKlic();
                                    break;
                                }
                                case 3: {
                                    System.out.println("Vuelva pronto");
                                    break;
                                }
                                default:
                                    System.out.println("Introduzca una opcion valida");
                            }
                        } while (opcion != 3);
                    } else
                        System.out.println("Usted no es superfanatico");
                    break;
                }
                default:
                    System.out.println("\nIntroduzca una opcion valida");
            }
        } while (op != 6);
    }
}