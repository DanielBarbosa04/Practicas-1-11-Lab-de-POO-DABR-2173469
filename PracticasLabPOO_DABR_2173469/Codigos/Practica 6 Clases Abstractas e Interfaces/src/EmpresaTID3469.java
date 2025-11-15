public class EmpresaTID3469 {

    private EmpleadoDB[] empleados;
    private int contador;

    public EmpresaTID3469(int capacidad) {
        empleados = new EmpleadoDB[capacidad];
        contador = 0;
    }

    public void agregarEmpleado(EmpleadoDB emp) {
        if (contador < empleados.length) {
            empleados[contador] = emp;
            contador++;
            System.out.println("Empleado agregado: " + emp.nombre);
        } else {
            System.out.println("No hay espacio para mas empleados ");
        }
    }

    public void mostrarEmpleados() {
        System.out.println("\n--- Lista de Empleados ---");
        for (int i = 0; i < contador; i++) {
            empleados[i].mostrarDatos();
            empleados[i].realizarActividad();
            System.out.println("-------------------------");
        }
    }
}