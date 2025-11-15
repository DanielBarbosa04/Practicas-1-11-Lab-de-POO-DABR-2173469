public class PruebasUnitarias {
    public static void main(String[] args) {
        AutoBarbosa a = new AutoBarbosa("Ford", "Fiesta", 2019, 4);
        MotocicletaBarbosa m = new MotocicletaBarbosa("Honda", "CB300R", 2021, true);
        CamionBarbosa c = new CamionBarbosa("Mercedes", "Axor", 2017, 20.0);

        System.out.println("Prueba Auto:");
        a.mostrarInfo();
        a.encender();
        a.apagar();

        System.out.println("\nPrueba Motocicleta:");
        m.mostrarInfo();
        m.encender();
        m.apagar();

        System.out.println("\nPrueba Camion:");
        c.mostrarInfo();
        c.encender();
        c.apagar();
    }
}