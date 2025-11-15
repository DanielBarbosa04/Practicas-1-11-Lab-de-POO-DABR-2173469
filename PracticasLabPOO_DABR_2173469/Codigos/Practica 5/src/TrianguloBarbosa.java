public class TrianguloBarbosa extends Figura05 {
    private double base;
    private double altura;

    public TrianguloBarbosa(double base, double altura) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        //triangulo equilatero
        return base * 3;
    }

    @Override
    public double calcularDiagonal() {
        return Math.sqrt(base * base + altura * altura);
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " de base=" + base + " y altura=" + altura);
    }

    //sobrecargas
    public void girar(double grados) {
        System.out.println("Girando el triangulo " + grados + " grados.");
    }

    public void girar(int grados) {
        System.out.println("Girando el triangulo " + grados + " grados enteros.");
    }

    public void girar(String direccion) {
        System.out.println("Girando el triangulo hacia " + direccion + ".");
    }
}