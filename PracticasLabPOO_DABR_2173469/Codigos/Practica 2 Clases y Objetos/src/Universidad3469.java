public class Universidad3469 {
    public EstudianteDB[] estudiantes;
    public int contador;

    public Universidad3469(int capacidad) {
        estudiantes = new EstudianteDB[capacidad];
        contador = 0;
    }

    public void agregarEstudiante(EstudianteDB e) {
        if (contador < estudiantes.length) {
            estudiantes[contador] = e;
            contador++;
            System.out.println("Estudiante agregado: " + e);
        } else {
            System.out.println("No hay espacio para mas estudiantes");
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("\nLista de estudiantes:");
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i] != null) {
                estudiantes[i].mostrarDatos();
                System.out.println("---------------------");
            }
        }
    }


    /*public EstudianteDB buscarPorMatricula(String matricula) {
        for (EstudianteDB e : estudiantes) {
            if (e != null && e.matricula.equals(matricula)) {
                return e;
            }
        }
        return null;
    }*/
}