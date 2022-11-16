public class ControlTele extends ControlRemoto implements Cambios {
    private int Canal;
    private int volumen;

    public ControlTele(int Canal, int volumen, String color, String marca, String modelo) {
        super(color, marca, modelo);
        this.Canal = Canal;
        this.volumen = volumen;
    }

    public void cambiar() {
        System.out.println("Puedes cambiar el canal y el volmen");
    }

    public int getCanal() {
        return Canal;
    }

    public void setCanal(int Canal) {
        this.Canal = Canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return super.toString() + "\nControl Tv" + "\nCanal: " + Canal + "\nVolumen: " + volumen;
    }
}
