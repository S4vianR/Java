import java.time.LocalDate;

public class Biblioteca {
    /*
     * Realizar jerarquía de clases para controlar el préstamo de libros en la
     * biblioteca de la ciudad
     * 
     * 1.-Se realizará una jerarquía de clases, con una clase base llamada
     * “Ejemplar” que tiene los atributos el autor y el título del ejemplar .
     * 
     * 2.-Se tienen 2 clases derivadas una para “Libros” y otra para “Revistas” ya
     * que la clase libros tienen además los atributos código, ISBN, editorial y
     * número de páginas. y las revistas tienen código, especialidad y fecha de
     * edición.
     * 
     * 3.-Las dos clases derivadas tienen un método llamado préstamo en el que se se
     * imprimirá la indicación el libro se puede prestar por una semana y las
     * revistas por 3 días.
     * 
     * 4.-Crear en main un objeto de una de las clases derivadas e imprimirlos con
     * el toString así como el método préstamo de cada uno de los objetos
     */
    public static void main(String[] args) {
        Libros Narnia = new Libros("Clive Staples Lewis", 19994578, LocalDate.of(1898, 11, 29),
                "Las cronicas de narnia", 18745268, "Andrés Bello", 400);
        Revistas MuyInteresante = new Revistas("Juan Caño", 20112048, LocalDate.of(1961, 9, 24), "Muy interesante",
                2001, "Ciencia", LocalDate.of(2022, 6, 1));

        System.out.println("---Biblioteca Municipal---");
        System.out.println(Narnia.toString());
        System.out.println(Narnia.prestamo());
        System.out.println("--------------------------");
        System.out.println(MuyInteresante.toString());
        System.out.println(MuyInteresante.prestamo());
        System.out.println("--------------------------");
    }
}
