public class VehiculoBaseD {
    protected String marca;
    protected String modelo;
    protected int año;

    public VehiculoBaseD(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void encender() {
        System.out.println("El vehiculo se ha encendido");
    }

    public void apagar() {
        System.out.println("El vehoculo se ha apagado");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}