import java.time.LocalDate;
import java.util.Scanner;

public class Discord extends Cuentas {
    private final LocalDate FechaCrea;
    Scanner cap = new Scanner(System.in);

    public Discord(LocalDate FechaCrea, String eMail, String Contrasenia, String nombre, LocalDate Fnac) {
        super(eMail, Contrasenia, nombre, Fnac);
        this.FechaCrea = FechaCrea;
    }

    public void crearCuenta(){
        String eMail, contrasenia, nombre;
        LocalDate Fnac;
        System.out.println("\nE-mail");
        eMail = cap.next();
        this.seteMail(eMail);
        System.out.println("\nContrasenia");
        contrasenia = cap.next();
        this.setContrasenia(contrasenia);
        System.out.println("\nNombre");
        nombre = cap.next();
        this.setNombre(nombre);
        System.out.println("\nFecha de nacimiento");
        System.out.println("Dia:");
        int dia = cap.nextInt();
        System.out.println("Mes:");
        int mes = cap.nextInt();
        System.out.println("Año:");
        int anio = cap.nextInt();
        Fnac = LocalDate.of(anio, mes, dia);
        this.setFnac(Fnac);
    }

    public void perfil() {
        System.out.println("\nPerfil de Discord");
        System.out.println("\nBienvenido " + this.getNombre());
        System.out.println("\nEstas son sus publicaciones...");
    }

    public void iniciarSesion() {
        String eMail, contrasenia;
        System.out.println("E-mail");
        eMail = cap.next();
        System.out.println("Contrasenia");
        contrasenia = cap.next();
    }

    public void cerrarSesion() {
        System.out.println("BYEEEEE");
    }

    public LocalDate getFechaCrea() {
        return FechaCrea;
    }

    @Override
    public String toString() {
        return "\nDiscord" + super.toString() + "\nFecha de creacion: " + FechaCrea.now();
    }
}
