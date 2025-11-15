public abstract class Figura05 implements CalculableD {
    protected String nombre;

    public Figura05(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarInfo();

    //sobrecarga de metodo (1)
    public void escalar(double factor) {
        System.out.println("Escalando la figura por un factor de " + factor);
    }

    // sobrecarga de metodo (2)
    public void escalar(int porcentaje) {
        System.out.println("Escalando la figura en " + porcentaje + "%.");
    }

    // sobrecarga de metodo (3)
    public void escalar(double x, double y) {
        System.out.println("Escalando la figura con factores distintos: X=" + x + ", Y=" + y);
    }
}