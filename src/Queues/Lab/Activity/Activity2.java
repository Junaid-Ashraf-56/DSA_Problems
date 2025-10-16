package Queues.Lab.Activity;

public class Activity2 {
    public static void main(String[] args) {
        Circular_Queue queue = new Circular_Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);

        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}
