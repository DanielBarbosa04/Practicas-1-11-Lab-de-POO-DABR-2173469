public class Main {
    public static void main(String[] args) {
        CuentaBancaria1111 cuenta = new CuentaBancaria1111("1234567", "Alejandro Ramirez", 1000);
        ClienteBarbosa cliente = new ClienteBarbosa("Daniel", "Barbosa", cuenta);

        cliente.mostrarDatos();
        cliente.depositar(500);
        cliente.mostrarDatos();
    }
}