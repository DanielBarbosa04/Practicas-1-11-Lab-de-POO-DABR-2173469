import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BancoConcurrenteDB banco = new BancoConcurrenteDB();

        // Hilos Cajero
        CajeroThread05 cajero1 = new CajeroThread05(banco, "1234567");
        CajeroThread05 cajero2 = new CajeroThread05(banco, "2173469");

        // Hilos Cliente
        ClienteRunnable11 cliente1 = new ClienteRunnable11(banco, "1234567");
        ClienteRunnable11 cliente2 = new ClienteRunnable11(banco, "7654321");

        // Iniciar hilos
        cajero1.start();
        cajero2.start();

        Thread t1 = new Thread(cliente1);
        Thread t2 = new Thread(cliente2);
        t1.start();
        t2.start();

        // Productor-Consumidor
        BufferBanco3469 buffer = new BufferBanco3469(3469 % 10); // tamaño basado en últimos dígitos
        Thread productor = new Thread(() -> {
            for (int i = 0; i < 20; i++) buffer.producir(i);
        });
        Thread consumidor = new Thread(() -> {
            for (int i = 0; i < 20; i++) buffer.consumir();
        });
        productor.start();
        consumidor.start();

        // Thread pool
        ThreadPoolBarbosa pool = new ThreadPoolBarbosa(2);
        pool.submit(() -> banco.depositar("1234567", 500));
        pool.submit(() -> banco.retirar("2173469", 200));
        pool.shutdown();
    }
}