package Linked_List;
//Question 3:Implementation of circular linked list
public class Question3 {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insertValue(1);
        cll.insertValue(2);
        cll.insertValue(3);
        cll.insertValue(4);
        cll.delete(4);
        cll.display();
    }
}
class CLL{
    private Node head;
    private Node tail;

    public void insertValue(int value){
        Node node = new Node(value);
        if (head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }while (node!=head);
            System.out.print("Head");
        }
    }

    public void delete(int value){
        Node node = head;
        if (node==null){
            return;
        }
        if (node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
