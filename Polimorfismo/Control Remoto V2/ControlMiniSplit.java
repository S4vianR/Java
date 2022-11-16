public class ControlMiniSplit extends ControlRemoto implements Cambios {
    private String Temp;
    private String Velocidad;

    public ControlMiniSplit(String Temp, String Velocidad, String color, String marca, String modelo) {
        super(color, marca, modelo);
        this.Temp = Temp;
        this.Velocidad = Velocidad;
    }

    public void cambiar() {
        System.out.println("Puedes cambiar la temperatura y la velocidad");
    }

    public String getTemp() {
        return Temp;
    }

    public void setTemp(String Temp) {
        this.Temp = Temp;
    }

    public String getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(String Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nControlMiniSplit" + "\nTemperatura: " + Temp + "\nVelocidad: " + Velocidad;
    }
}
