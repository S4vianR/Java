public class Plan extends Usuario implements MetodoPago {
    private String nombrePlan;
    private String beneficios;
    private Double costo;
    private Double cargoExtra;

    public Plan(String nombreUsuario, String numeroTelefono, String nombrePlan, String beneficios, Double costo,
            Double cargoExtra) {
        super(nombreUsuario, numeroTelefono);
        this.nombrePlan = nombrePlan;
        this.beneficios = beneficios;
        this.costo = costo;
        this.cargoExtra = cargoExtra;
    }

    @Override
    public Double pago() {
        return costo + cargoExtra;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public Double getCosto() {
        return costo;
    }

    public Double getCargoExtra() {
        return cargoExtra;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setCargoExtra(Double cargoExtra) {
        this.cargoExtra = cargoExtra;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlan: " + nombrePlan + "\nBeneficios: " + beneficios + "\nCosto: " + costo
                + "nCargoExtra: " + cargoExtra;
    }
}
