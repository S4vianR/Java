class Superman extends TransporteAereo implements Volador {
    private final String nombre = "Carl Kent";

    @Override
    public void aterrizar() {
        // Aca va el codigo del modo que tiene que aterrizar de Superman
    }

    public String getNombre() {
        return nombre;
    }
}
