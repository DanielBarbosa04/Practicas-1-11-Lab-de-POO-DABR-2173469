import java.io.Serializable;

public class PersonaDSerializable implements Serializable {
    private String nombre;
    private String matricula;
    private int edad;

    public PersonaDSerializable(String nombre, String matricula, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public String getMatricula() { return matricula; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return nombre + " | " + matricula + " | " + edad;
    }
}