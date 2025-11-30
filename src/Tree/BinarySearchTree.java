package Tree;

public class BinarySearchTree {
    private static class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    Node root;


    void insert_helper(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if (node.value<value){
            node.right = insert(value,node.right);
        }
        if (node.value >value){
            node.left = insert(value,node.left);
        }
        node.height = Math.max(getHeight(node.left),getHeight(node.right))+1;
        return node;
    }


    void inorder(Node root){
        if (root==null)return;
        inorder(root.left);
        System.out.print(root.value);
        inorder(root.right);
    }

    int getHeight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    boolean isEmpty(){
        return root == null;
    }

    public boolean checkBalance(){
        return balanced(root);
    }
    public boolean balanced(Node root){
        if(root==null){
            return true;
        }
        return Math.abs(getHeight(root.left)- getHeight(root.right))<=1
                && balanced(root.left) && balanced(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert_helper(5);
        tree.insert_helper(3);
        tree.insert_helper(7);

        tree.insert_helper(4);
        tree.insert_helper(2);

        tree.insert_helper(1);
        tree.insert_helper(8);
        tree.insert_helper(6);

        tree.inorder(tree.root);
        System.out.println();
        System.out.println(tree.checkBalance());

    }
}


// Logic for my self
//    void insert_Node(int value){
//        Node newNode = new Node(value);
//        if (root==null){
//            root = newNode;
//            return;
//        }
//
//        Node parent = null;
//        Node current = root;
//
//        while (current != null){
//            parent = current;
//            if (current.value > value){
//                current = current.left;
//            }else {
//                current = current.right;
//            }
//        }
//
//        if (parent.value<value){
//            parent.right = newNode;
//        }else {
//            parent.left = newNode;
//        }
//
//        updateHeight(root);
//    }
//
//    private int updateHeight(Node node) {
//        if (node == null) return -1;
//        node.height = Math.max(updateHeight(node.left), updateHeight(node.right)) + 1;
//        return node.height;
//    }



//    Logic for myself
//    void insert(int value){
//        if (root == null){
//            root = new Node(value);
//            return;
//        }
//        Node newNode = new Node(value);
//        Node current = root;
//        while (true){
//            if (current.value>newNode.value){
//                if (current.left==null) {
//                    current.left = newNode;
//                    return;
//                }
//                current = current.left;
//            }else {
//                if (current.right == null) {
//                    current.right = newNode;
//                    return;
//                }
//                current = current.right;
//            }
//        }
//    }