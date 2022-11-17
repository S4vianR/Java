import java.time.LocalDate;

public class PrePago extends Usuario implements MetodoPago {
    private String nombrePlan;
    private String beneficios;
    private Double costo;
    private Double cargoExtra;
    private LocalDate fechaExpiracion;

    public PrePago(String nombreUsuario, String numeroTelefono, String nombrePlan, String beneficios, Double costo,
            Double cargoExtra, LocalDate fechaExpiracion) {
        super(nombreUsuario, numeroTelefono);
        this.nombrePlan = nombrePlan;
        this.beneficios = beneficios;
        this.costo = costo;
        this.cargoExtra = cargoExtra;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public Double pago() {
        LocalDate.now();
        if (fechaExpiracion.isEqual(LocalDate.now())) {
            System.out.println("Hoy es el dia de vencimiento");
        }
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

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
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

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlan: " + nombrePlan + "\nBeneficios: " + beneficios + "\nCosto: " + costo
                + "\nCargo Extra: " + cargoExtra + "\nFecha Expiracion: " + fechaExpiracion;
    }
}
