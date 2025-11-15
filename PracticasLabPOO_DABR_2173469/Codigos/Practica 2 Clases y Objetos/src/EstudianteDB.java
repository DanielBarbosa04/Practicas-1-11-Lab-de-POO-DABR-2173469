public class EstudianteDB {

    public String nombre;
    public String matricula;
    public int edad;
    public String carrera;
    public int semestreActual;

    //constructor 1
    public EstudianteDB() {}

    // constructor 2
    public EstudianteDB(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    // constructor 3
    public EstudianteDB(String nombre, String matricula, int edad, String carrera, int semestreActual) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }

    //operaciones estudiantiles
    public void inscribirseMateria(String materia) {
        System.out.println(nombre + " se ha inscrito en la materia: " + materia);
    }

    public void avanzarSemestre() {
        semestreActual++;
        System.out.println(nombre + " ahora esta en el semestre " + semestreActual);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre actual: " + semestreActual);
    }

    /*public void actualizarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    public String obtenerCarrera() {
        return carrera;
    }*/
}