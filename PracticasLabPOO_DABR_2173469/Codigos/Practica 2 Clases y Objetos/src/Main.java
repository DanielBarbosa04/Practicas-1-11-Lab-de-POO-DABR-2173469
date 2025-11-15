public class Main {
    public static void main(String[] args) {
        //crear universidad
        Universidad3469 uni = new Universidad3469(10);

        // creacion de estudiantes
        EstudianteDB e1 = new EstudianteDB();
        EstudianteDB e2 = new EstudianteDB("Julio Eduardo", "1234567");
        EstudianteDB e3 = new EstudianteDB("Ana Lopez", "1234568", 22, "Ingenieria", 7);
        EstudianteDB e4 = new EstudianteDB("Manuel Alejandro", "1234569", 20, "Arquitectura", 5);
        EstudianteDB e5 = new EstudianteDB("Maria Torres", "1234560", 19, "Medicina", 3);

        // agregar estudiantes a la universidad
        uni.agregarEstudiante(e1);
        uni.agregarEstudiante(e2);
        uni.agregarEstudiante(e3);
        uni.agregarEstudiante(e4);
        uni.agregarEstudiante(e5);

        // mostrar estudiantes
        uni.mostrarEstudiantes();

        // probar metodos
        e3.inscribirseMateria("Programacion");
        e4.avanzarSemestre();
    }
}