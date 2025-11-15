public class MotocicletaBarbosa extends VehiculoBaseD {
    private boolean tieneCasco;

    public MotocicletaBarbosa(String marca, String modelo, int año, boolean tieneCasco) {
        super(marca, modelo, año);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta ruge al encender");
    }

    @Override
    public void apagar() {
        System.out.println("La motocicleta se apaga con el boton de paro");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Motocicleta, ¿Tiene casco?: " + tieneCasco);
    }
}