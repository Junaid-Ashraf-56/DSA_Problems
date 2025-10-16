package Queues.Lab.Task;

class Dynamic_Queue{
    private int size;
    private int[] arr;
    private final int front;
    private int rear;

    Dynamic_Queue(){
        size = 5;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void resize(){
        int newSize = size*2;
        int[] temp = new int[newSize];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr = temp;
        size = newSize;
    }

    void enqueue(int value){
        if (isFull()){
            resize();
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
public class Task1 {
    public static void main(String[] args) {
        Dynamic_Queue queue = new Dynamic_Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
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
        queue.dequeue();

        queue.display();
    }
}
