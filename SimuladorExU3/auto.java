public class auto {
    /*
     * En una agencia de autos, se tiene catalogado 3 diferentes tipos de autos,
     * trocas, familiares y deportivos
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
     * 
     * los deportivos tienen velocidad máxima
     * 
     * y los familiares números de asientos
     * 
     * y un método costo en ele que además de el precio se agrega un impuesto
     * diferente
     * 
     * trocas 10% impuesto
     * 
     * deportivos 20%
     * 
     * y familiares 5%
     * 
     * Realizar clase base y sus tres clases derivadas con sus atributos y el método
     * costo
     * 
     * crear objetos en main uno de cada tipo de datos derivado e invocar el método
     * costo
     * 
     * darle valores a los objetos dándole los datos directamente en el constructor
     * (No capturar por teclado)
     */

    protected String marca;
    protected String modelo;
    protected long numSerie;
    protected String color;
    protected double costo;

    public auto(String marca, String modelo, long numSerie, String color, double costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.color = color;
        this.costo = costo;
    }

    public void precioT() {
        System.out.println("El precio total es de: " + this.getCosto());
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

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
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
        return "\nMarca: " + marca + "\nModelo: " + modelo + "\nNumSerie: " + numSerie + "\nColor: " + color
                + "\nCosto: " + costo;
    }

}