import java.util.Comparator;

public class LibroComparator {
    public static Comparator<Libro0511> porAutor = (l1, l2) -> l1.getAutor().compareToIgnoreCase(l2.getAutor());
    public static Comparator<Libro0511> porAnioDesc = (l1, l2) -> Integer.compare(l2.getAnio(), l1.getAnio());
}