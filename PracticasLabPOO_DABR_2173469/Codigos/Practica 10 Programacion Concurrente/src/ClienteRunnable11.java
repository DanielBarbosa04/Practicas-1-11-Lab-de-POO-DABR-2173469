public class ClienteRunnable11 implements Runnable {
    private final BancoConcurrenteDB banco;
    private final String cuenta;

    public ClienteRunnable11(BancoConcurrenteDB banco, String cuenta) {
        this.banco = banco;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            banco.retirar(cuenta, 30);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            banco.depositar(cuenta, 70);
        }
    }
}