public class Aeropuerto {
    public void darPermisoDeAterrizaje(Volador v) {
        v.aterrizar();
        if (v instanceof AvionPrivado) {
            AvionPrivado ap = (AvionPrivado) v;
            System.out.println("Aterrizo Licencia: " + ap.getLicencia());
        }
        if (v instanceof AvionDePasajeros) {
            AvionDePasajeros adp = (AvionDePasajeros) v;
            System.out.println("Aterrizo Licencia: " + adp.getAerolinea());
        }
        if (v instanceof Superman) {
            Superman sp = (Superman) v;
            System.out.println("Aterrizo: " + sp.getNombre());
        }
    }
}