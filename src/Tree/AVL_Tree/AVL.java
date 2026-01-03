package Tree.AVL_Tree;

public class AVL {
    private static class  Node{
        int value,height;
        Node left,right;

        public Node(int value) {
            this.value = value;
        }
        public int getHeight() {
            return height;
        }
    }

    Node root;


    void insert(int value){
        root = insert_helper(value,root);
    }
    Node insert_helper(int value,Node node){
        Node newNode = new Node(value);
        if (node == null){
            node = newNode;
            return node;
        }

        if (value<node.value){
            node.left = insert_helper(value,node.left);
        }
        if (value> node.value){
            node.right = insert_helper(value,node.right);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }

    Node rotate(Node node){
        if (height(node.left)-height(node.right)>1){
            if (height(node.left.left) < height(node.left.right)) {
                node.left = rotateLeft(node.left);
            }
            return rotateRight(node);
        }
        if (height(node.left)-height(node.right)< -1){
            if (height(node.right.right) < height(node.right.left)) {
                node.right = rotateRight(node.right);
            }
            return rotateLeft(node);
        }
        return node;
    }

    Node rotateRight(Node parent){
        Node child = parent.left;
        Node tree = child.right;

        child.right = parent;
        parent.left = tree;

        parent.height = Math.max(height(parent.left),height(parent.right))+1;
        child.height = Math.max(height(child.left),height(child.right))+1;

        return child;
    }

    Node rotateLeft(Node child){
        Node parent = child.right;
        Node tree = parent.left;

        parent.left = child;
        child.right = tree;


        child.height = Math.max(height(child.left),height(child.right))+1;
        parent.height = Math.max(height(parent.left),height(parent.right))+1;

        return parent;
    }
    int height(Node node){
        if (node == null)return -1;
        return node.getHeight();
    }
    public void display(){
        displayHelper(root);
    }
    void displayHelper(Node root){
        if (root==null){
            return;
        }
        System.out.print("Height = ("+root.height+")");
        System.out.print(" Node value = "+root.value);
        System.out.println();
        displayHelper(root.left);
        displayHelper(root.right);
    }
    public static void main(String[] args) {
        AVL avl = new AVL();
        avl.insert(7);
        avl.insert(9);
        avl.insert(11);

        avl.display();
    }
}
