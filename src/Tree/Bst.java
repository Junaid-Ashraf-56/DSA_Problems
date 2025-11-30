package Tree;
public class Bst {
    int data;
    Bst left;
    Bst right;
    Bst root;

    Bst(){

    }
    Bst(int data ){
        this.data = data;
    }

    public Bst insert_Node(int value){
        Bst newValue = new Bst(value);

        if (root==null){
            root = newValue;
            return root;
        }

        Bst parent = null;
        Bst current = root;

        while (current != null){
            parent = current;

            if (current.data<value){
                current = current.right;
            }else {
                current = current.left;
            }
        }

        if (parent.data<value){
            parent.right = newValue;
        }else {
            parent.left = newValue;
        }
        return newValue;
    }

    public Bst insert_recursive(Bst root, int value){
        if (root == null) {
            return new Bst(value);
        }
        if (value < root.data) {
            root.left = insert_recursive(root.left, value);
        } else {
            root.right = insert_recursive(root.right, value);
        }
        return root;
    }



    public boolean search(Bst root, int value) {
        if (root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        if (value < root.data) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    public void min_and_max(Bst root){
        if (root!=null){
            min_helper(root.right);
            max_helper(root.left);
        }
    }
    public void max_helper(Bst root){
        if (root!=null){
            if (root.left == null){
                System.out.println("Max value is" + root.data);
            }
            min_helper(root.left);
        }
    }

    public void min_helper(Bst root){
        if (root!=null){
            if (root.right == null){
                System.out.println("Min value is" + root.data);
            }
            min_helper(root.right);
        }
    }
//    public void sum(Bst root,int ans,int numOfNodes){
//        if (root!=null){
//            inorder(root.left);
//            ans+= root.data;
//            numOfNodes++;
//            inorder(root.right);
//            ans+= root.data;
//            numOfNodes++;
//            if (root.left == null){
//                System.out.println( ans+ " " +numOfNodes);
//            }
//        }
//    }

    public void inorder(Bst root){
        if (root!=null){
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
    }

    public void preorder(Bst root){
        if (root!=null){
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(Bst root){
        if (root!=null){
            preorder(root.left);
            preorder(root.right);
            System.out.print(root.data);
        }
    }


    public static void main(String[] args) {
        Bst tree = new Bst();
        Bst root;
        root = tree.insert_Node(5);
        tree.insert_Node(3);
        tree.insert_Node(7);
        tree.insert_Node(4);
        tree.insert_Node(2);
        tree.insert_Node(6);
        tree.insert_Node(8);

//        tree.sum(root,0,0);
        tree.insert_recursive(root,9);
        System.out.println();
        tree.min_and_max(root);
        System.out.println();
        System.out.println(tree.search(root,5));
        tree.inorder(root);
        System.out.println();
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
    }
}
