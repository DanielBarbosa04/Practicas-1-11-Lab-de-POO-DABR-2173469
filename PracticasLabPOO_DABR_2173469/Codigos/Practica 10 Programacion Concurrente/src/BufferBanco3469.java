import java.util.LinkedList;
import java.util.Queue;

public class BufferBanco3469 {
    private final Queue<Integer> buffer;
    private final int capacidad;

    public BufferBanco3469(int capacidad) {
        this.capacidad = capacidad;
        this.buffer = new LinkedList<>();
    }

    public synchronized void producir(int item) {
        while (buffer.size() == capacidad) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        buffer.add(item);
        System.out.println("Producido: " + item);
        notifyAll();
    }

    public synchronized int consumir() {
        while (buffer.isEmpty()) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        int item = buffer.poll();
        System.out.println("Consumido: " + item);
        notifyAll();
        return item;
    }
}