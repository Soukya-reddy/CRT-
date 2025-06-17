class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public int getCountOfNodes() {
        return getCountOfNodesRec(root);
    }

    private int getCountOfNodesRec(TreeNode root) {
        int count = 0;
        TreeNode current = root;

        while (current != null) {
            if (current.left == null) {
                count++;
                current = current.right;
            } else {
                TreeNode prev = current.left;
                while (prev.right != null && prev.right != current) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = current;
                    current = current.left;
                } else {
                    prev.right = null;
                    count++;
                    current = current.right;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(15);
        tree.insert(10);
        tree.insert(20);
        tree.insert(8);
        tree.insert(12);
        tree.insert(82);
        tree.insert(122);
        tree.insert(2);

        int count = tree.getCountOfNodes();
        System.out.println("Count of nodes in O(1) space: " + count);
    }
}