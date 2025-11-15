public class Main {
    public static void main(String[] args) {

        SistemaBancoDB banco = new SistemaBancoDB();

        try {
            // try-with-resources ejemplo con AutoCloseable
            try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
                banco.registrarCuenta("1234567", 1200);
                banco.registrarCuenta("7654321", 2000);

                banco.retirar("1234567", 1000);
                System.out.println("Saldo actual: " + banco.consultarSaldo("1234567"));

                banco.retirar("7654321", 3000); //esto lanzara SaldoInsuficiente
            }
        } catch (Matricula05InvalidaException | Saldo11InsuficienteException | Usuario3469NoEncontradoException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}