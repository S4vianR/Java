import java.util.Scanner;
import java.time.LocalDate;

public class Facebook extends Cuentas implements Interacciones {

    private final LocalDate FechaCrea;
    Scanner cap = new Scanner(System.in);

    public Facebook(LocalDate FechaCrea, String eMail, String Contrasenia, String nombre, LocalDate Fnac) {
        super(eMail, Contrasenia, nombre, Fnac);
        this.FechaCrea = FechaCrea;
    }

    public void perfil() {
        System.out.println("\nPerfil de Facebook");
        System.out.println("Bienvenido " + this.getNombre());
        System.out.println("Estas son sus publicaciones...");
    }

    public void iniciarSesion() {
        String eMail, contrasenia, nombre;
        System.out.println("Nombre de usuario");
        nombre = cap.next();
        this.setNombre(nombre);
        System.out.println("\nE-mail");
        eMail = cap.next();
        this.seteMail(eMail);
        System.out.println("\nContrasenia");
        contrasenia = cap.next();
        this.setContrasenia(contrasenia);
    }

    public void cerrarSesion() {
        System.out.println("BYEEEEE");
    }

    public LocalDate getFechaCrea() {
        return FechaCrea;
    }

    @Override
    public String toString() {
        return "\nFacebook" + super.toString() + "\nFecha de creacion: " + FechaCrea.now();
    }
}