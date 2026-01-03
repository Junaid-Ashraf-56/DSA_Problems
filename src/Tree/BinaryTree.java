package Tree;

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

    public void insert(int value){
        Node node = new Node(value);
        if (root==null){
            root = node;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current!=null){
            parent = current;
            current = (current.value > node.value)?current.left:current.right;
        }

        if (parent.value > node.value){
            parent.left = node;
        }else {
            parent.right = node;
        }
    }

    public void preOrder(){
        helper(root);
    }
    private void helper(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.value + " ");
        helper(root.left);
        helper(root.right);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(45);
        tree.insert(30);
        tree.insert(50);

        tree.preOrder();
    }
}
