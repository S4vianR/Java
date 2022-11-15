public class Navegador {
    public void redSocial (Interacciones R1){
        if (R1 instanceof Facebook){
            Facebook F = (Facebook) R1;
            System.out.println("---------------------------------");
            System.out.println("\nBienvenido a Facebook");
            R1.iniciarSesion();
            System.out.println("Bienvenido " + F.getNombre());
        }
        if (R1 instanceof Discord){
            Discord D = (Discord) R1;
            System.out.println("---------------------------------");
            System.out.println("\nBienvenido a Discord");
            R1.iniciarSesion();
            System.out.println("Bienvenido " + D.getNombre());
        }
    }
}
