import java.util.ArrayList;

public class Conferencia {
    static ArrayList <Persona> Conferencias = new ArrayList<>();
    public static void main(String[] args) {
        Conferencista c1 = new Conferencista("Juan", "1234567890", "Java");
        Conferencista c2 = new Conferencista("Pedro", "0987654321", "Python");
        General g1 = new General("Maria", "1234567890", "Google");
        General g2 = new General("Luis", "0987654321", "Microsoft");
        Alumnos a1 = new Alumnos("Ana", "1234567890", 1234567890);
        Alumnos a2 = new Alumnos("Jose", "0987654321", 1785632456);
        Conferencias.add(c1);
        Conferencias.add(c2);
        Conferencias.add(g1);
        Conferencias.add(g2);
        Conferencias.add(a1);
        Conferencias.add(a2);
        for (Object Conferencia : Conferencias) {
            System.out.println(Conferencia);
            if (Conferencia instanceof Conferencista) {
                System.out.println("Pago: " + ((Conferencista) Conferencia).pago());
            } else if (Conferencia instanceof Asistentes) {
                System.out.println("Cobro: " + ((Asistentes) Conferencia).cobro());
                System.out.println(((Asistentes) Conferencia).registro());
            }
        }
    }
}
