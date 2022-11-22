public class Troca extends Auto {
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
     * los deportivos tienen velocidad máxima
     * los familiares números de asientos
     * 
     * y un método costo en ele que además de el precio se agrega un impuesto
     * diferente
     * 
     * trocas 10% impuesto
     * deportivos 20% impuesto
     * y familiares 5% impuesto
     * 
     * Realizar clase base y sus tres clases derivadas con sus atributos y el método
     * polimórfico costo
     * 
     * crear objetos en main y demostrar polimorfismo
     */

    private double tamañoCaja;

    public Troca(String marca, String modelo, String numserie, String color, double costo, double tamañoCaja) {
        super(marca, modelo, numserie, color, costo);
        this.tamañoCaja = tamañoCaja;
    }

    @Override
    public double costo() {
        return costo + (costo * 0.10);
    }

    public double getTamañoCaja() {
        return tamañoCaja;
    }

    public void setTamañoCaja(double tamañoCaja) {
        this.tamañoCaja = tamañoCaja;
    }

    @Override
    public String toString() {
        return "\nTroca" + super.toString() + "\nTamaño de la caja: " + tamañoCaja;
    }
}
