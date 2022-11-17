import java.time.LocalDate;

public class appTelefonia {
    public static void main(String[] args) {
        Usuario U001 = new Plan("Juan Perez", "809-555-5555", "TELCEL MAX SIN LIMITE CONSUMO CONTROLADO 2000",
                "Llamadas ilimitadas y mensajes ilimitados", 500.0, 0.0);
        Usuario U002 = new PrePago("Maria Lopez", "809-555-5556", "TELCEL PAQUETE AMIGO 200",
                "Llamadas ilimitadas y mensajes ilimitados", 500.0, 100.0, LocalDate.of(2022, 11, 17));
        limpiarConsola();
        System.out.println(U001);
        System.out.println(U001.pago());
        System.out.println(U002);
        System.out.println(U002.pago());
    }

    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
    }
}
