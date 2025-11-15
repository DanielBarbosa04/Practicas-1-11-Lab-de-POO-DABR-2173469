public abstract class EmpleadoDB {

    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public EmpleadoDB(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    // Método abstracto
    public abstract void realizarActividad();

    // Métodos concretos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Base: $" + salarioBase);
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }
}