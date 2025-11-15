public class GerenteBarbosa extends EmpleadoDB
        implements Bonificable05, Evaluable11, Promovible3469 {

    public GerenteBarbosa(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }

    @Override
    public void realizarActividad() {
        System.out.println(nombre + " está organizando estrategias de negocio");
    }

    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.20; // 20%
    }

    @Override
    public void evaluarDesempeno() {
        System.out.println("El gerente " + nombre + " tuvo un desempeño EXCELENTE ");
    }

    @Override
    public boolean esPromovible() {
        return true; // siempre promovible
    }
}