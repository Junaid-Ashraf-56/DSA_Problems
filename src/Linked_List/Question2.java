package Linked_List;
//Question 2:Double Linked List
public class Question2 {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.insertLast(8);
        dll.insert(9,8);
        dll.display();
        dll.displayRev();
    }
}
class DLL{
    Node head ;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        if (head!=null){
            head.pre = node;
        }
        node.pre = null;
        head = node;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        Node last = head;

        node.next = null;
        if (head == null){
            node.pre = null;
            head = node;
            return;
        }

        while (last.next!=null){
            last = last.next;
        }

        last.next = node;
        node.pre = last;
    }

    public void insert(int value,int after){
        Node p = findValue(after);

        if (p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.pre = p;
        if (node.next!=null){
            node.next.pre = node;
        }
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

    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.value +" -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void displayRev(){
        Node node = head;
        Node last = null;
        while (node!=null){
            last = node;
            node = node.next;
        }
        System.out.println("Print in reverse");
        while (last!=null){
            System.out.print(last.value + " -> ");
            last = last.pre;
        }
        System.out.println("End");
    }

    private static class Node{
        int value;
        Node next;
        Node pre;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node pre) {
            this.value = value;
            this.next = next;
            this.pre = pre;
        }
    }
}
