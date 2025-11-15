public class AutoBarbosa extends VehiculoBaseD {
    private int puertas;

    public AutoBarbosa(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    @Override
    public void encender() {
        super.encender();
        System.out.println("El auto hace un sonido suave al encender");
    }

    @Override
    public void apagar() {
        System.out.println("El auto se apaga automaticamente");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Auto, Puertas: " + puertas);
    }
}