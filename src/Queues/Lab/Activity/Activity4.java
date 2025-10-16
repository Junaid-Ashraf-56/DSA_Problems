package Queues.Lab.Activity;

//Double ended queue or simply called “Deque” is a generalized version of Queue. The
//difference between Queue and Deque is that it does not follow the FIFO (First In, First Out)
//approach. The second feature of Deque is that we can insert and remove elements from either
//front or rear ends.Some basic operations of dequeue are:
//insert_at_beg(): inserts an item at the front of Dequeue.
//insert_at_end(): inserts an item at the rear of Dequeue.
//delete_fr_beg(): Deletes an item from front of Dequeue.
//delete_fr_rear(): Deletes an item from rear of Dequeue.

class Dequeue {
    private final int size;
    private final int[] arr;
    private final int front;
    private int rear;

    Dequeue(){
        size = 5;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void insert_at_end(int value){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = value;
    }

    void insert_at_beg(int value){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()){
            rear=0;
            arr[rear] = value;
            return;
        }
        for (int i = rear+1; i >front ; i--) {
            arr[i] = arr[i-1];
        }
        arr[front] = value;
        rear++;
    }

    void delete_fr_beg(){
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

    void delete_fr_rear(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
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
public class Activity4 {
    public static void main(String[] args) {
        Dequeue dequeue = new Dequeue();

        dequeue.insert_at_beg(2);
        dequeue.insert_at_beg(1);
        dequeue.insert_at_end(3);
        dequeue.insert_at_end(4);
        dequeue.insert_at_end(5);

        dequeue.display();

        dequeue.delete_fr_rear();
        dequeue.delete_fr_rear();

        dequeue.display();

        dequeue.delete_fr_beg();
        dequeue.delete_fr_beg();

        dequeue.display();
    }
}
