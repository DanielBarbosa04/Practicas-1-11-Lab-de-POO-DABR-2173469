import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BibliotecaD3469 bib = new BibliotecaD3469();
        Scanner sc = new Scanner(System.in);

        // Datos de prueba
        bib.agregarLibro(new Libro0511("Programacion II", "Daniel Barbosa", "Programacion", 2024));
        bib.agregarLibro(new Libro0511("Matematicas I", "Alejandro Ramirez", "Matematicas", 1924));
        bib.agregarLibro(new Libro0511("Fisica III", "Pedro Martinez", "Fisica", 2018));
        bib.registrarUsuario("1234567", "Julio Garcia");
        bib.registrarUsuario("1234568", "Ana Lopez");

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- Biblioteca D3469 ---");
            System.out.println("1. Listar libros");
            System.out.println("2. Filtrar por categoria");
            System.out.println("3. Ordenar libros por titulo");
            System.out.println("4. Ordenar libros por autor");
            System.out.println("5. Ordenar libros por año descendente");
            System.out.println("6. Reservar libro");
            System.out.println("7. Mostrar categorias");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // para limpiar buffer

            switch (opcion) {
                case 1 -> bib.listarLibros().forEach(System.out::println);
                case 2 -> {
                    System.out.print("Ingrese categoria: ");
                    String cat = sc.nextLine();
                    bib.filtrarPorCategoria(cat).forEach(System.out::println);
                }
                case 3 -> { bib.ordenarPorTitulo(); System.out.println("Ordenado por titulo"); }
                case 4 -> { bib.ordenarPorAutor(); System.out.println("Ordenado por autor"); }
                case 5 -> { bib.ordenarPorAnioDesc(); System.out.println("Ordenado por año descendente"); }
                case 6 -> {
                    System.out.print("Ingrese indice del libro a reservar: ");
                    int idx = sc.nextInt(); sc.nextLine();
                    if (idx >= 0 && idx < bib.listarLibros().size()) {
                        bib.reservarLibro(bib.listarLibros().get(idx));
                        System.out.println("Libro reservado.");
                    } else System.out.println("Indice invalido.");
                }
                case 7 -> bib.mostrarCategorias();
                case 0 -> salir = true;
                default -> System.out.println("Opcion invalida.");
            }
        }
        sc.close();
    }
}