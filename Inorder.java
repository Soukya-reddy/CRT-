import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int v)
    {
        data = v;
        left = right = null;
    }
}

class Inorder {
    public static void printInorder(Node node)
    {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        printInorder(root);
    }
}