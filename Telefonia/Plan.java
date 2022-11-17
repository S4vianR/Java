import java.time.LocalDate;

public class Plan extends Usuario implements MetodoPago{
    private String nombrePlan;
    private String beneficios;
    private Double costo;
    private Double cargoExtra;
    private LocalDate fechaExpiracion;
}
