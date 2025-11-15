public class VendedorBarbosa extends EmpleadoDB
        implements Bonificable05, Evaluable11, Promovible3469 {

    public VendedorBarbosa(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }

    @Override
    public void realizarActividad() {
        System.out.println(nombre + " esta realizando ventas.");
    }

    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.10; // 10%
    }

    @Override
    public void evaluarDesempeno() {
        System.out.println("El vendedor " + nombre + " obtuvo ventas satisfactorias");
    }

    @Override
    public boolean esPromovible() {
        return salarioBase > 8000;
    }
}