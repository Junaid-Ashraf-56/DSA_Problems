package Avl_Tree;

public class Question1 {
    int data;
    int height;
    Question1 left;
    Question1 right;

    Question1(){
    }
    Question1(int data ){
        this.data = data;
    }

    int height(Question1 node){
        int lh,rh;

        if (node == null)return 0;
        if (node.left == null){
            lh = 0;
        }else {
            lh = 1 + node.left.height;
        }
        if (node.right == null){
            rh = 0;
        }else {
            rh = 1 + node.right.height;
        }

        return Math.max(lh,rh);
    }
    int bf(Question1 node){
        int lh,rh;

        if (node == null)return 0;
        if (node.left == null){
            lh = 0;
        }else {
            lh = 1 + node.left.height;
        }
        if (node.right == null){
            rh = 0;
        }else {
            rh = 1 + node.right.height;
        }

        return (lh-rh);
    }

    Question1 rotateRight(Question1 node){
        Question1 nodeTemp = node.left;
        Question1 T2 = nodeTemp.right;

        nodeTemp.right = node;
        node.left = T2;

        node.height = height(node);
        nodeTemp.height = height(nodeTemp);

        return nodeTemp;
    }
    Question1 rotateLeft(Question1 node){
        Question1 nodeTemp = node.right;
        Question1 T2 = nodeTemp.left;

        nodeTemp.left = node;
        node.right = T2;
        node.height= height(node);
        nodeTemp.height = height(nodeTemp);

        return nodeTemp;
    }
    Question1 leftRight(Question1 node){
        node.left = rotateLeft(node.left);
        node = rotateRight(node);

        return node;
    }
    Question1  rightLeft(Question1 node){
        node.right = rotateRight(node.right);
        node = rotateLeft(node);

        return node;
    }

    Question1 insert(Question1 T, int x)
    {
        if (T == null) {
            T = new Question1(x);
            return T;
        }
        if (x < T.data) {
            T.left = insert(T.left, x);
            if (bf(T) == 2) {
                if (x < T.left.data) {
                    T = rotateRight(T);
                } else {
                    T = leftRight(T);
                }
            }
        }
        else if (x > T.data) {
            T.right = insert(T.right, x);
            if (bf(T) == -2) {
                if (x > T.right.data) {
                    T = rotateLeft(T);
                } else {
                    T = rightLeft(T);
                }
            }
        }
        T.height = height(T);

        return T;
    }


    public void preorder(Question1 root){
        if (root!=null){
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String[] args) {
        Question1 avl = new Question1();

        Question1 root = null;
        root = avl.insert(root,1);
        root = avl.insert(root,2);
        root = avl.insert(root,3);

        avl.preorder(root);
    }
}