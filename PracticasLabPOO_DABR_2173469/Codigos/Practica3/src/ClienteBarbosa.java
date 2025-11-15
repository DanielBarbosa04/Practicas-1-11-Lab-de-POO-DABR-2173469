public class ClienteBarbosa {
    // modificador protected
    protected String nombre;
    protected String apellido;

    // relacion de composicion con CuentaBancaria
    private CuentaBancaria1111 cuenta;

    public ClienteBarbosa(String nombre, String apellido, CuentaBancaria1111 cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
    }

    public void mostrarDatos() {
        System.out.println("Cliente: " + nombre + " " + apellido);
        System.out.println("Cuenta asociada: " + cuenta);
    }

    // Metodo para depositar dinero usando la cuenta
    public void depositar(double monto) {
        double nuevoSaldo = cuenta.getSaldo() + monto;
        cuenta.setSaldo(nuevoSaldo);
    }
}
