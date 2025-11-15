import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class SistemaBancoDB {

    private HashMap<String, Double> cuentas;
    private static Logger logger = Logger.getLogger("BancoLog");

    public SistemaBancoDB() {
        cuentas = new HashMap<>();
        try {
            FileHandler fh = new FileHandler("banco.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void registrarCuenta(String matricula, double saldo) throws Matricula05InvalidaException {
        if (!matricula.matches("\\d{7}")) { // por ejemplo
            throw new Matricula05InvalidaException("Matircula invalida: " + matricula);
        }
        cuentas.put(matricula, saldo);
        logger.info("Cuenta registrada: " + matricula + " con saldo: " + saldo);
    }

    public void retirar(String matricula, double monto)
            throws Saldo11InsuficienteException, Usuario3469NoEncontradoException {

        if (!cuentas.containsKey(matricula)) {
            throw new Usuario3469NoEncontradoException("Usuario no encontrado: " + matricula);
        }
        double saldoActual = cuentas.get(matricula);
        if (monto > saldoActual) {
            throw new Saldo11InsuficienteException("Saldo insuficiente para: " + matricula);
        }
        cuentas.put(matricula, saldoActual - monto);
        logger.info("Retiro: " + monto + " de la cuenta " + matricula);
    }

    public double consultarSaldo(String matricula) throws Usuario3469NoEncontradoException {
        if (!cuentas.containsKey(matricula)) {
            throw new Usuario3469NoEncontradoException("Usuario no encontrado: " + matricula);
        }
        return cuentas.get(matricula);
    }
}