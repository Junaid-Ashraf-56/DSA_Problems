package Tree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the root node ");
        int value = scanner.nextInt();
        this.root = new Node(value);

        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node root){
        System.out.println("If you want to put on left side of "+root.value);
        boolean left = scanner.nextBoolean();
        if (left){
            int val = scanner.nextInt();
            root.left = new Node(val);
            populate(scanner,root.left);
        }

        System.out.println("If you want to put on right side of "+root.value);
        boolean right = scanner.nextBoolean();
        if (right){
            int val = scanner.nextInt();
            root.right = new Node(val);
            populate(scanner,root.right);
        }
    }

    public void display(){
        display(root,"");
    }
    private void display(Node root,String indent){
        if (root==null){
            return;
        }

        System.out.println(indent + root.value);
        display(root.left,indent+"\t");
        display(root.right,indent+"\t");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
}
