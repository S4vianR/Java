public class appControlR {
    public static void main(String[] args) {
        ControlRemoto Control1 = new ControlTele(2, 9, "blanco", "Sony", "a123");
        System.out.println(Control1);
        Control1.cambiar();
        ControlRemoto Control2 = new ControlDVD("Harry Potter", "ingles", "blanco", "Sony", "a123");
        System.out.println(Control2);
        Control2.cambiar();
        ControlRemoto Control3 = new ControlMiniSplit("25", "alta", "blanco", "Sony", "a123");
        System.out.println(Control3);
    }
}