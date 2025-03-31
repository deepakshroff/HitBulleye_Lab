import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements
        queue.add(10);
        queue.add(45);
        queue.add(67);
        queue.add(89);
        queue.add(70);

     
        queue.poll(); 
        queue.poll();

        // Print Front and Rear
        System.out.println("Front: " + (queue.peek() != null ? queue.peek() : "Queue is empty"));
        System.out.println("Rear: " + (queue.isEmpty() ? "Queue is empty" : getRear(queue)));
    }

    private static int getRear(Queue<Integer> queue) {
        int rear = -1;
        for (int element : queue) {
            rear = element;
        }
        return rear;
    }
}
