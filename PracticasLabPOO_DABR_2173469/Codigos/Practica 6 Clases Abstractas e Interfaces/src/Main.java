public class Main {
    public static void main(String[] args) {

        EmpresaTID3469 empresa = new EmpresaTID3469(10);

        EmpleadoDB g1 = new GerenteBarbosa("Daniel", 25, 15000);
        EmpleadoDB d1 = new DesarrolladorBarbosa("Alejandro", 38, 25000);
        EmpleadoDB v1 = new VendedorBarbosa("Ramirez", 22, 9000);

        empresa.agregarEmpleado(g1);
        empresa.agregarEmpleado(d1);
        empresa.agregarEmpleado(v1);

        empresa.mostrarEmpleados();

        System.out.println("\n--- Bonificaciones ---");
        System.out.println("Gerente: " + ((Bonificable05) g1).calcularBonificacion());
        System.out.println("Desarrollador: " + ((Bonificable05) d1).calcularBonificacion());
        System.out.println("Vendedor: " + ((Bonificable05) v1).calcularBonificacion());

        System.out.println("\n--- Evaluaciones ---");
        ((Evaluable11) g1).evaluarDesempeno();
        ((Evaluable11) d1).evaluarDesempeno();
        ((Evaluable11) v1).evaluarDesempeno();
    }
}