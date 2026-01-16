package Tree.SegmentTree;

class Node{
    Node left;
    Node right;
    int value;
    int startInterval;
    int endInterval;

    public Node(int startInterval, int endInterval) {
        this.startInterval = startInterval;
        this.endInterval = endInterval;
    }
}
public class SegmentTree {
    Node root;

    void createTree(int[] nums) {
        root = getNode(nums, 0, nums.length - 1);
    }

    private Node getNode(int[] nums, int start, int end) {
        Node node = new Node(start, end);

        if (start == end) {
            node.value = nums[start];
            return node;
        }

        int mid = start + (end - start) / 2;
        node.left = getNode(nums, start, mid);
        node.right = getNode(nums, mid + 1, end);
        node.value = node.left.value + node.right.value;

        return node;
    }

    void printTree() {
        System.out.println("Root: [" + root.startInterval + "," + root.endInterval + "] = " + root.value);
        helperPrint(root.left, "", true);
        helperPrint(root.right, "", false);
    }
    void helperPrint(Node node,String prefix,boolean isLeft){
        if (node == null) return;

        System.out.println(prefix + (isLeft ? "├─L: " : "└─R: ") +
                "[" + node.startInterval + "," + node.endInterval + "] = " + node.value);

        if (node.left != null || node.right != null) {
            if (node.left != null)
                helperPrint(node.left, prefix + (isLeft ? "│   " : "    "), true);
            if (node.right != null)
                helperPrint(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        SegmentTree segmentTree = new SegmentTree();
        segmentTree.createTree(nums);

        segmentTree.printTree();
    }

}
