public class DesarrolladorBarbosa extends EmpleadoDB
        implements Bonificable05, Evaluable11, Promovible3469 {

    public DesarrolladorBarbosa(String nombre, int edad, double salarioBase) {
        super(nombre, edad, salarioBase);
    }

    @Override
    public void realizarActividad() {
        System.out.println(nombre + " esta desarrollando software");
    }

    @Override
    public double calcularBonificacion() {
        return salarioBase * 0.15; // 15%
    }

    @Override
    public void evaluarDesempeno() {
        System.out.println("El desarrollador " + nombre + " tuvo un desempeño MUY BUENO");
    }

    @Override
    public boolean esPromovible() {
        return edad > 25;
    }
}