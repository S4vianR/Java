import java.time.LocalDate;
import java.util.ArrayList;

public class appRedSocial {
    static int op;
    static ArrayList<Cuentas> cuentas = new ArrayList<Cuentas>();

    public static void main(String[] args) {
        Cuentas C1 = new Facebook(LocalDate.of(2012, 06, 07), "reuben4.com@gmail.com", "NanoVIM", "Reuben Perez",
                LocalDate.of(2002, 06, 05));
        System.out.println(C1);
        C1.perfil();

        Cuentas C2 = new Discord(LocalDate.of(2019, 06, 07), "Andy5@hotmail.com", "Andy123", "Andrea Archundia",
                LocalDate.of(2002, 06, 07));
        System.out.println(C2);
        C2.perfil();
    }
}
