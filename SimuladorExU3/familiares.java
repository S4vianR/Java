public class familiares extends auto {
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
    private int numAsientos;

    public familiares(String marca, String modelo, long numSerie, String color, double costo, int numAsientos) {
        super(marca, modelo, numSerie, color, costo);
        this.numAsientos = numAsientos;
    }

    @Override
    public void precioT() {
        // Impuesto del 10%
        float impuesto = (float) 0.05;
        double resultado = this.getCosto() + (this.getCosto() * impuesto);
        System.out.println(
                "El precio total es de: " + Math.round(resultado) + " y tiene un impuesto del: " + impuesto * 100 + "%");
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero de asientos: " + numAsientos;
    }

}
