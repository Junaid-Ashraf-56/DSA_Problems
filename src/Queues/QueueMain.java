package Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue customQueue = new CustomQueue();
        System.out.println("Simple Queue");
        customQueue.insert(1);
        customQueue.insert(2);
        customQueue.insert(3);
        customQueue.insert(4);
        customQueue.insert(5);

        customQueue.display();
        customQueue.front();

        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();
        customQueue.remove();

        customQueue.display();

        CircularQueue circularQueue = new CircularQueue();

        System.out.println("Circular Queue");
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);

        circularQueue.display();

        circularQueue.remove();
        circularQueue.display();

        circularQueue.remove();
        circularQueue.remove();
        circularQueue.display();

        DynamicQueue dynamicQueue = new DynamicQueue();

        System.out.println("Dynamic Queue");
        dynamicQueue.insert(1);
        dynamicQueue.insert(2);
        dynamicQueue.insert(3);
        dynamicQueue.insert(4);
        dynamicQueue.insert(5);

        dynamicQueue.display();
        System.out.println(dynamicQueue.remove());
        dynamicQueue.display();
    }
}
