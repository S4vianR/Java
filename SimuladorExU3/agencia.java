public class agencia {
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
    public static void main(String[] args) {
        String espaciador = "--------------------------------------";

        // Objetos
        auto Mazda = new auto("Mazda", "Speed 3", 2018785, "Rojo", 325000.00);
        troca Ram = new troca("Dodge", "Ram 1500", 2017548, "Negro", 500000.00, 2);
        familiares Town = new familiares("Chrysler", "Town & Country", 2020457, "Gris", 405000.00, 8);
        deportivos Challenger = new deportivos("Dodge", "Challenger SRT Hellcat", 2021631, "Naranja", 650000.00, 275);

        System.out.println("La informacion de los autos dispobibles es:");

        // Auto
        System.out.println(espaciador);
        System.out.println(Mazda.toString());
        Mazda.precioT();

        // Troca
        System.out.println(espaciador);
        System.out.println(Ram.toString());
        Ram.precioT();

        // Familiares
        System.out.println(espaciador);
        System.out.println(Town.toString());
        Town.precioT();
        System.out.println(espaciador);

        // Deportivos
        System.out.println(Challenger.toString());
        Challenger.precioT();
        System.out.println(espaciador);
    }
}
