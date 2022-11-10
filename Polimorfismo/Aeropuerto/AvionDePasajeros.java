class AvionDePasajeros extends TransporteAereo implements Volador {
    private String aerolinea;

    @Override
    public void aterrizar() {
        // Aca va el codigo del modo que tiene que aterrizar un avion de pasajeros
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String licencia) {
        this.aerolinea = licencia;
    }
}