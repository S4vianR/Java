public class TransporteAereo {
    private String licencia;

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}

class AvionPrivado extends TransporteAereo implements Volador {
    private String propietario;

    @Override
    public void aterrizar() {
        // Aca va el codigo del modo que tiene que aterrizar un avion privado
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

}
