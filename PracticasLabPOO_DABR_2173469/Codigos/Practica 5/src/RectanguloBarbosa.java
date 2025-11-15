public class RectanguloBarbosa extends Figura05 {
    private double base;
    private double altura;

    public RectanguloBarbosa(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double calcularDiagonal() {
        return Math.sqrt(base * base + altura * altura);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " de base=" + base + " y altura=" + altura);
    }

    // sobrecargas
    public void redimensionar(double nuevaBase, double nuevaAltura) {
        base = nuevaBase;
        altura = nuevaAltura;
    }

    public void redimensionar(double nuevoLado) {
        base = nuevoLado;
        altura = nuevoLado;
    }

    public void redimensionar(String textoBase, String textoAltura) {
        try {
            base = Double.parseDouble(textoBase);
            altura = Double.parseDouble(textoAltura);
        } catch (Exception e) {
            System.out.println("Error al convertir texto a numero");
        }
    }
}