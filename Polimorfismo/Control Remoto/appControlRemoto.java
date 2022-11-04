public class appControlRemoto {
    public static void main(String[] args) {
        // Limpiar consola
        System.out.print("\033[H\033[2J");
        // int Canal, int volumen, String color, String marca, String modelo
        ControlRemoto Control1 = new ControlTele(2, 9, "blanco", "Sony", "a123");
        System.out.println(Control1);
        Control1.cambiar();
        System.out.println("--------------------");
        ControlRemoto Control2 = new ControlDVD("Harry Potter", "ingles", "blanco", "Sony", "a123");
        System.out.println(Control2);
        Control2.cambiar();
        System.out.println("--------------------");
    }
}