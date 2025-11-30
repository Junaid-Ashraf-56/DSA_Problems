package Linked_List.Double;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int value){
        this.data = value;
    }
}
public class DoubleLinkedList {
    Node head = null;

    boolean insertFirst(int value){
        Node newNode = new Node(value);
        if (head == null){
            newNode.next.prev = null;
            head = newNode;
            return true;
        }
        newNode.next = head;
        newNode.next.prev = newNode;
        return true;
    }

    void display(){
        if (head == null){
            System.out.println("Linked List is empty");
            return;
        }

    }
    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList();

    }
}
