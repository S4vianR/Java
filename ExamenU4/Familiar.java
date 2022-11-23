public class Familiar extends Auto implements Cobro {
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
    private int numAsientos;

    public Familiar(String marca, String modelo, String numserie, String color, double costo, int numAsientos) {
        super(marca, modelo, numserie, color, costo);
        this.numAsientos = numAsientos;
    }

    @Override
    public double costo() {
        return costo + (costo * 0.05);
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "\nFamiliar" + super.toString() + "\nNumero de asientos: " + numAsientos;
    }
}
