import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolBarbosa {
    private final ExecutorService pool;

    public ThreadPoolBarbosa(int size) {
        pool = Executors.newFixedThreadPool(size);
    }

    public void submit(Runnable task) {
        pool.submit(task);
    }

    public void shutdown() {
        pool.shutdown();
    }
}