public class ControlRemoto {
    private String color;
    private String marca;
    private String modelo;

    public ControlRemoto(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void cambiar() {
        System.out.println("Podras cambiar..................");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nControlRemoto" + "\nColor: " + color + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
}