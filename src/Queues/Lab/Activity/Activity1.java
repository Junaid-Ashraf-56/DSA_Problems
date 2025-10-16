package Queues.Lab.Activity;

//Implement an Array based FIFO Queue.

class Queue{
    private final int size;
    private final int[] arr;
    private final int front;
    private int rear;

    Queue(){
        size = 5;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = value;
    }

    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
//        System.out.println(arr[front]);
        for (int i = 1; i <=rear; i++) {
            arr[i-1] = arr[i];
        }
        rear--;
    }

    void display(){
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------------------------------------");
    }
    boolean isFull(){
        return  rear == size-1;
    }

    boolean isEmpty(){
        return rear<front;
    }
}
public class Activity1 {
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
