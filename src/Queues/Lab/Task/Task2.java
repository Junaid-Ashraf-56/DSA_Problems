package Queues.Lab.Task;

class LL{
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private static class Node{
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int value){
        if (tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if (head==null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print(" END ");
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}

class Dequeue {
    private final LL list;

    public Dequeue() {
        list = new LL();
    }

    public void insertFront(int value) {
        list.insertFirst(value);
    }

    public void insertRear(int value) {
        list.insertLast(value);
    }

    public int deleteFront() {
        return list.deleteFirst();
    }

    public int deleteRear() {
        return list.deleteLast();
    }

    public void display() {
        list.display();
    }
}

public class Task2 {
    public static void main(String[] args) {
        Dequeue dq = new Dequeue();

        dq.insertFront(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertRear(25);

        dq.display();

        System.out.println("\nDeleted from front: " + dq.deleteFront());
        System.out.println("Deleted from rear: " + dq.deleteRear());

        dq.display();
    }
}
