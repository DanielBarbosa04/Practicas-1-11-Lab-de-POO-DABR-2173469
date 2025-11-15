public class CajeroThread05 extends Thread {
    private final BancoConcurrenteDB banco;
    private final String cuenta;

    public CajeroThread05(BancoConcurrenteDB banco, String cuenta) {
        this.banco = banco;
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            banco.depositar(cuenta, 100);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            banco.retirar(cuenta, 50);
        }
    }
}