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

        while (current!= null){
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

    public void insert_recursive(Bst root, Bst current){
        if (root == null){
            root =current;
        }else{
            
        }
    }
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



        tree.inorder(root);
        System.out.println();
        tree.preorder(root);
        System.out.println();
        tree.postorder(root);
    }
}
