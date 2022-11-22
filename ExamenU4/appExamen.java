public class appExamen {
    public static void main(String[] args) {
        Auto D1 = new Deportivos("Ford", "Mustang", "123456", "Rojo", 100000, 300);
        Auto T1 = new Troca("Ford", "F150", "123456", "Rojo", 100000, 5.5);
        Auto F1 = new Familiares("Ford", "Fusion", "123456", "Rojo", 100000, 5);
        System.out.println(D1.toString());
        System.out.println("\nEl costo total del vehiculo " + D1.getMarca() + " " + D1.getModelo() + " es de: " + D1.costo());
        System.out.println(T1.toString());
        System.out.println("\nEl costo total del vehiculo " + T1.getMarca() + " " + T1.getModelo() + " es de: " + T1.costo());
        System.out.println(F1.toString());
        System.out.println("\nEl costo total del vehiculo " + F1.getMarca() + " " + F1.getModelo() + " es de: " + F1.costo());
    }
}
