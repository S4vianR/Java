import java.time.LocalDate;
import java.util.ArrayList;

public class appRedSocial {
    static int op;
    static ArrayList<Cuentas> cuentas = new ArrayList<Cuentas>();

    public static void main(String[] args) {
        // Facebook nFacebook = new Facebook(LocalDate.of(2013, 5, 7),
        // "reuben4.com@gmail.com", "lorito93", "Reuben", LocalDate.of(2002, 6, 5));
        Facebook nFacebook = new Facebook(null, null, null, null, null);
        // Discord nDiscord = new Discord(LocalDate.of(2016, 8, 29),
        // "andrea91@hotmail.com", "lola990019274", "Andrea", LocalDate.of(2002, 6, 7));
        Discord nDiscord = new Discord(null, null, null, null, null);

        do {
            System.out.println("1. Crear cuenta");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Cerrar sesion");
            System.out.println("4. Salir");
            System.out.println("5. Ver cuentas");
            op = nDiscord.cap.nextInt();
            switch (op) {
                case 1:
                    System.out.println("1. Facebook");
                    System.out.println("2. Discord");
                    op = nDiscord.cap.nextInt();
                    switch (op) {
                        case 1:
                            nFacebook.crearCuenta();
                            cuentas.add(nFacebook);
                            break;
                        case 2:
                            nDiscord.crearCuenta();
                            cuentas.add(nDiscord);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1. Facebook");
                    System.out.println("2. Discord");
                    op = nDiscord.cap.nextInt();
                    switch (op) {
                        case 1:
                            nFacebook.iniciarSesion();
                            nFacebook.perfil();
                            break;
                        case 2:
                            nDiscord.iniciarSesion();
                            nDiscord.perfil();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Facebook");
                    System.out.println("2. Discord");
                    op = nDiscord.cap.nextInt();
                    switch (op) {
                        case 1:
                            nFacebook.cerrarSesion();
                            break;
                        case 2:
                            nDiscord.cerrarSesion();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Vuelva pronto");
                    break;
                case 5:
                    for (Cuentas cuenta : cuentas) {
                        System.out.println(cuenta);
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 4);
    }
}
