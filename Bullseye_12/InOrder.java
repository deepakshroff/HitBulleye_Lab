package Bullseye_12;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        this.data = value;
        this.left = this.right = null;
    }
}

class BinaryTree {
    Node root;

    // Inorder Traversal (Left -> Root -> Right)
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Manually creating a simple binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Output the inorder traversal
        System.out.println("Inorder Traversal:");
        tree.inorderTraversal(tree.root);  // Output: 4 2 5 1 3
    }
}
