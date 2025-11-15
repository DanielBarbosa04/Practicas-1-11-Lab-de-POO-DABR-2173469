public class Concesionaria3469 {
    private VehiculoBaseD[] vehiculos;
    private int contador;

    public Concesionaria3469(int capacidad) {
        vehiculos = new VehiculoBaseD[capacidad];
        contador = 0;
    }

    public void agregarVehiculo(VehiculoBaseD v) {
        if (contador < vehiculos.length) {
            vehiculos[contador] = v;
            contador++;
        } else {
            System.out.println("No hay mas espacio en la concesionaria.");
        }
    }

    public void mostrarTodos() {
        for (int i = 0; i < contador; i++) {
            vehiculos[i].mostrarInfo();
            System.out.println("--------------------");
        }
    }
}