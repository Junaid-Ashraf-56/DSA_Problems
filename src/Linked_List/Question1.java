package Linked_List;
//Question 1: Single Linked List Internal implementation
public class Question1 {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertLast(4);
        l.insert(5,4 );
        System.out.println(l.deleteLast());
        System.out.println(l.deleteFirst());
        System.out.println(l.deleteIndex(1));
        System.out.println((l.findValue(2)));
        l.display();
    }
}
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
        public Node(int value, Node next) {
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

    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print(" END ");
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

    public void insert(int value,int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = new Node(value,temp.next);

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

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
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

    public int deleteIndex(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node pre = get(index-1);
        int value = pre.next.value;
        pre.next = pre.next.next;
        return value;
    }

    public Node findValue(int value){
        Node node = head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node = node.next;
        }

        return null;
    }
}
