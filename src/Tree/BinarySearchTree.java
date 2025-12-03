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

    public int leafNode(){
        return leafNodeCount(root);
    }
    public int leafNodeCount(Node node){
        if (node == null){
            return 0;
        }
        if (node.left == null && node.right == null){
            return 1;
        }
        return leafNodeCount(node.left) + leafNodeCount(node.right);
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

    public void delete(int value){
        Node element = search(value);
        if (element == null) {
            return;
        }

        if (element.left == null && element.right == null) {
            deleteLeaf(value, root);
        } else if (element.left == null || element.right == null) {
            deleteOneNode(value, root);
        } else {
            deleteTwoNode(value, root);
        }
    }
    private void deleteLeaf(int value,Node node){
        if (node == null){
            return;
        }
        Node parent = null;
        Node current = node;

        while (current!=null){
            if (current.value<value){
                parent = current;
                current = current.right;
            }else if (current.value>value){
                parent = current;
                current = current.left;
            }else {
                if (current.left == null && current.right == null){
                    if (parent == null) {
                        root = null;
                    } else if (value < parent.value) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
                break;
            }
        }
    }
    private void deleteOneNode(int value,Node node){
        if (node == null){
            return;
        }
        Node parent = null;
        Node current = node;

        while (current!=null){
            if (current.value>value){
                parent = current;
                current = current.left;
            } else if (current.value < value) {
                parent = current;
                current = current.right;
            }else {
                if (parent == null){
                    if (current.left != null && current.right == null) {
                        root = current.left;
                    } else if (current.right != null && current.left == null) {
                        root = current.right;
                    }
                } else if (current.left != null && current.right==null){
                    if (parent.value > value){
                        parent.left = current.left;
                    }else {
                        parent.right = current.left;
                    }
                }
                else {
                    if (parent.value>value){
                        parent.left = current.right;
                    }else {
                        parent.right = current.right;
                    }
                }
                break;
            }
        }
    }
    private void deleteTwoNode(int value,Node node){
        if(node == null){
            return;
        }

        Node current = node;

        while (current != null){
            if(value<current.value){
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            }else {
               int num = helperLeft(current);
               if (num == -1) {
                   num = helperRight(current);
               }
                Node element = search(num);
                assert element != null;
                delete(element.value);
                current.value = num;
               break;
            }
        }

    }
    private int helperRight(Node node){
        if (node == null || node.right == null){
            return -1;
        }
        Node current = node.right;
        while (current.left!=null){
            current = current.left;
        }
        return current.value;
    }
    private int helperLeft(Node node) {
        if (node == null || node.left == null) {
            return -1;
        }

        Node current = node.left;
        while (current.right != null) {
            current = current.right;
        }

        return current.value;
    }
    private Node search(int value){
        if (root == null){
            return null;
        }
        Node current = root;

        while (current!=null){
            if (value<current.value){
                current = current.left;
            }else if (value>current.value){
                current = current.right;
            }else {
                return current;
            }
        }
        return null;
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
        System.out.println();
        tree.delete(5);
        tree.inorder(tree.root);
        System.out.println(tree.leafNode());
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