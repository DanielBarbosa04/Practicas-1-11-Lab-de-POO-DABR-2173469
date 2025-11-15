import java.util.HashMap;
import java.util.Map;

public class BancoConcurrenteDB {
    private final Map<String, Integer> cuentas = new HashMap<>();

    public BancoConcurrenteDB() {
        //crear cuentas
        cuentas.put("1234567", 1200);
        cuentas.put("2173469", 2500);
        cuentas.put("7654321", 350);
    }

    public synchronized void depositar(String cuenta, int cantidad) {
        int saldo = cuentas.getOrDefault(cuenta, 0);
        cuentas.put(cuenta, saldo + cantidad);
        System.out.println(Thread.currentThread().getName() + " deposito " + cantidad + " en " + cuenta + ". Nuevo saldo: " + cuentas.get(cuenta));
        notifyAll(); //notificar a los hilos en espera
    }

    public synchronized void retirar(String cuenta, int cantidad) {
        while (cuentas.getOrDefault(cuenta, 0) < cantidad) {
            try {
                System.out.println(Thread.currentThread().getName() + " espera fondos en " + cuenta);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int saldo = cuentas.get(cuenta);
        cuentas.put(cuenta, saldo - cantidad);
        System.out.println(Thread.currentThread().getName() + " retiro " + cantidad + " de " + cuenta + ". Nuevo saldo: " + cuentas.get(cuenta));
    }

    public synchronized int consultar(String cuenta) {
        return cuentas.getOrDefault(cuenta, 0);
    }
}