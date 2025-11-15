public class CamionBarbosa extends VehiculoBaseD {
    private double capacidadCarga;

    public CamionBarbosa(String marca, String modelo, int año, double capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("El camion requiere calentamiento antes de arrancar");
    }

    @Override
    public void apagar() {
        System.out.println("El camion se apaga lentamente para proteger el motor");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Camion, Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}