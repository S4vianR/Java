public abstract class Auto {
    /*
     * En una agencia de autos, se tiene catalogado 3 diferentes tipos de autos,
     * trocas, Familiar y Deportivo
     * 
     * por lo que de deberá crear la clase base auto con los atributos>
     * 
     * Marca
     * modelo
     * numserie
     * color
     * costo
     * y cada una de las clases derivadas tiene atributos específicos
     * 
     * las trocas tienen tamaño de la caja
     * los Deportivo tienen velocidad máxima
     * los Familiar números de asientos
     * 
     * y un método costo en ele que además de el precio se agrega un impuesto
     * diferente
     * 
     * trocas 10% impuesto
     * Deportivo 20% impuesto
     * y Familiar 5% impuesto
     * 
     * Realizar clase base y sus tres clases derivadas con sus atributos y el método
     * polimórfico costo
     * 
     * crear objetos en main y demostrar polimorfismo
     */
    protected String marca;
    protected String modelo;
    protected String numserie;
    protected String color;
    protected double costo;

    public Auto(String marca, String modelo, String numserie, String color, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numserie = numserie;
        this.color = color;
        this.costo = costo;
    }

    public abstract double costo();

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

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "\nMarca: " + marca + "\nModelo: " + modelo + "\nNumero de serie: " + numserie + "\nColor: " + color
                + "\nCosto: "  + costo;
    }
}
