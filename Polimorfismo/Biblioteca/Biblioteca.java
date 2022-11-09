import java.util.ArrayList;
import java.time.LocalDate;

public class Biblioteca {
    static ArrayList<Ejemplar> Biblioteca = new ArrayList<>();

    public static void main(String[] args) {
        // ArrayList<Ejemplar> Biblioteca = new ArrayList<>();
        Biblioteca.add(new Libro("Narnia", "C.S. Lewis", "123456789", "Andrés Bello", (byte) 1));
        Biblioteca.add(new Revista("People", "People", "Time Inc"));
        Biblioteca.add(new Periodico("El Mercurio", "El Mercurio", "El Mercurio", LocalDate.of(2019, 10, 10)));
        Biblioteca.add(new Periodico("El Diario", "El Diario", "El Diario", LocalDate.of(2022, 9, 28)));

        // Crear un objeto de la clase Biblioteca
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", "978-84-376-0494-7", "Alfaguara",
                (byte) 1);
        Libro libro2 = new Libro("El señor de los anillos", "J. R. R. Tolkien", "978-84-376-0494-7", "Minotauro",
                (byte) 1);
        Revista revista1 = new Revista("National Geographic", "National Geographic Society", "National Geographic");

        Revista revista2 = new Revista("Forbes", "Forbes Media", "Forbes Media");

        System.out.println("*** Biblioteca ***");
        System.out.println(libro1.toString());
        libro1.prestamo();
        System.out.println(libro2);
        libro2.prestamo();
        System.out.println(revista1);
        revista1.prestamo();
        System.out.println(revista2);
        revista2.prestamo();

        for (Ejemplar ejemplar : Biblioteca) {
            System.out.println(ejemplar);
            ejemplar.prestamo();
        }
    }
}
