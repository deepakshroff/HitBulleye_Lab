package Bullseye_12;

public class PreOrder {
    static class Node {
        int data;
        Node left, right;
    
        public Node(int value) {
            this.data = value;
            this.left = this.right = null;
        }
    }
    
    static class BinaryTree {
        Node root;
    
        // Preorder Traversal (Root -> Left -> Right)
        void preorderTraversal(Node node) {
            if (node != null) {
                System.out.print(node.data + " ");  // Print root
                preorderTraversal(node.left);       // Traverse left subtree
                preorderTraversal(node.right);      // Traverse right subtree
            }
        }
    
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
    
            // Creating a sample tree
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
    
            // Output the preorder traversal
            System.out.println("Preorder Traversal:");
            tree.preorderTraversal(tree.root);  // Output: 1 2 4 5 3
        }
    }
    
}
