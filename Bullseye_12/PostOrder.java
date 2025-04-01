package Bullseye_12;

public class PostOrder {
    static class Node {
        int data;
        Node left, right;
    
        public Node(int value) {
            this.data = value;
            this.left = this.right = null;
        }
    }
    
    class BinaryTree {
        Node root;
    
        // Postorder Traversal (Left -> Right -> Root)
        void postorderTraversal(Node node) {
            if (node != null) {
                postorderTraversal(node.left);   // Traverse left subtree
                postorderTraversal(node.right);  // Traverse right subtree
                System.out.print(node.data + " ");  // Print root
            }
        }
    
        public static void main(String[] args) {
            PostOrder postOrder = new PostOrder();
            BinaryTree tree = postOrder.new BinaryTree();
    
            // Creating a sample tree
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);
    
            // Output the postorder traversal
            System.out.println("Postorder Traversal:");
            tree.postorderTraversal(tree.root);  // Output: 4 5 2 3 1
        }
    }
    
}
