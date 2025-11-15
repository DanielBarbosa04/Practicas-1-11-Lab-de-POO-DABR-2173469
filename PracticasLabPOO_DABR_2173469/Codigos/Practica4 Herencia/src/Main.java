public class Main {
    public static void main(String[] args) {
        AutoBarbosa auto = new AutoBarbosa("Toyota", "Corolla", 2025, 4);
        MotocicletaBarbosa moto = new MotocicletaBarbosa("Yamaha", "MT-03", 2022, true);
        CamionBarbosa camion = new CamionBarbosa("Volvo", "FH", 2018, 18.5);

        Concesionaria3469 concesionaria = new Concesionaria3469(5);
        concesionaria.agregarVehiculo(auto);
        concesionaria.agregarVehiculo(moto);
        concesionaria.agregarVehiculo(camion);

        concesionaria.mostrarTodos();

        System.out.println("Demostracion polimorfismo con herencia");
        VehiculoBaseD v1 = auto;
        VehiculoBaseD v2 = moto;
        VehiculoBaseD v3 = camion;

        v1.encender();
        v2.encender();
        v3.encender();
    }
}