import java.util.*;
import java.util.stream.Collectors;

public class BibliotecaD3469 {

    private ArrayList<Libro0511> librosDisponibles;
    private LinkedList<Libro0511> colaReservas;
    private HashMap<String, String> usuarios; // clave: matricula valor: nombre
    private HashSet<String> categorias;

    public BibliotecaD3469() {
        librosDisponibles = new ArrayList<>();
        colaReservas = new LinkedList<>();
        usuarios = new HashMap<>();
        categorias = new HashSet<>();
    }

    // CRUD libros
    public void agregarLibro(Libro0511 libro) {
        librosDisponibles.add(libro);
        categorias.add(libro.getCategoria());
    }

    public void eliminarLibro(Libro0511 libro) {
        librosDisponibles.remove(libro);
    }

    public List<Libro0511> listarLibros() {
        return new ArrayList<>(librosDisponibles);
    }

    // CRUD usuarios
    public void registrarUsuario(String matricula, String nombre) {
        usuarios.put(matricula, nombre);
    }

    public void eliminarUsuario(String matricula) {
        usuarios.remove(matricula);
    }

    //reservas
    public void reservarLibro(Libro0511 libro) {
        colaReservas.add(libro);
    }

    public Libro0511 siguienteReserva() {
        return colaReservas.poll();
    }

    // buscar por categoria usando streams
    public List<Libro0511> filtrarPorCategoria(String categoria) {
        return librosDisponibles.stream()
                .filter(libro -> libro.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }

    //ordenar libros
    public void ordenarPorTitulo() {
        Collections.sort(librosDisponibles);
    }

    public void ordenarPorAutor() {
        librosDisponibles.sort(LibroComparator.porAutor);
    }

    public void ordenarPorAnioDesc() {
        librosDisponibles.sort(LibroComparator.porAnioDesc);
    }

    //mostrar categorias
    public void mostrarCategorias() {
        System.out.println("Categorias disponibles: " + categorias);
    }
}