public class Estudiante {
    private String nombre;
    private String matricula;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() { return nombre; }
    public String getMatricula() { return matricula; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
}