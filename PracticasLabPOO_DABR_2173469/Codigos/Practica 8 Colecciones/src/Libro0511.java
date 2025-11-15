public class Libro0511 implements Comparable<Libro0511> {
    private String titulo;
    private String autor;
    private String categoria;
    private int anio;

    public Libro0511(String titulo, String autor, String categoria, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anio = anio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getCategoria() { return categoria; }
    public int getAnio() { return anio; }

    @Override
    public int compareTo(Libro0511 otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return "[" + titulo + ", " + autor + ", " + categoria + ", " + anio + "]";
    }
}