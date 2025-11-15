public class CirculoBarbosa extends Figura05 {
    private double radio;

    public CirculoBarbosa(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularDiagonal() {
        return 2 * radio; // diámetro
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " con radio = " + radio);
    }

    //sobrecargas especificas
    public void cambiarRadio(double nuevoRadio) {
        this.radio = nuevoRadio;
    }

    public void cambiarRadio(int nuevoRadio) {
        this.radio = nuevoRadio;
    }

    public void cambiarRadio(String texto) {
        try {
            this.radio = Double.parseDouble(texto);
        } catch (Exception e) {
            System.out.println("Error al convertir el texto a numero");
        }
    }
}