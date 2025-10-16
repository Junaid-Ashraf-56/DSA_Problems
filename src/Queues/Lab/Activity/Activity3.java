package Queues.Lab.Activity;

//Implement an Array based circular Queue that is generic in nature (use template classes), apply
//proper checks of Queue Full and Queue Empty before Enqueue and DeQue operations.
class Circular_Queue {
    private final int size;
    private final int[] arr;
    private int front;
    private int rear;

    Circular_Queue(){
        size = 5;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int value){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()){
            front=rear=0;
            arr[front]=value;
            return;
        }
        rear = (rear+1)%size;
        arr[rear] = value;
    }

    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    void display(){
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
        System.out.println("------------------------------------------");
    }
    boolean isFull(){
        return  (rear+1)%size == front;
    }

    boolean isEmpty(){
        return front==-1;
    }
}
public class Activity3 {
    public static void main(String[] args) {
        Circular_Queue circularQueue = new Circular_Queue();
        circularQueue.enqueue(5);
        circularQueue.enqueue(4);
        circularQueue.enqueue(3);
        circularQueue.enqueue(2);
        circularQueue.enqueue(1);

        circularQueue.display();

        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();

        circularQueue.display();
    }
}
