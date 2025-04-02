package Bullseye_13;

import java.util.HashMap;

public class treein {
   
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = 0;
            this.left = this.right = null;
        }
    }

    private int preorderIndex = 0;
    private HashMap<Integer, Integer> inorderIndexMap;

    
    public Node buildTree(int[] preorder, int[] inorder) {
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }

    private Node buildTreeHelper(int[] preorder, int inorderStart, int inorderEnd) {
        if (inorderStart > inorderEnd) {
            return null;
        }

        int rootValue = preorder[preorderIndex++];
        Node root = new Node(rootValue);

        int inorderIndex = inorderIndexMap.get(rootValue);

        root.left = buildTreeHelper(preorder, inorderStart, inorderIndex - 1);
        root.right = buildTreeHelper(preorder, inorderIndex + 1, inorderEnd);

        return root;
    }

   
    public void printInorder(Node root) {
        if (root == null) {
            return;
        }
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    // Method to print the tree in preorder traversal
    public void printPreorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        treein tree = new treein();
        int[] inorder = {15, 25, 20, 30, 35, 40};
        int[] preorder = {30, 25, 15, 20, 40, 35};

        Node root = tree.buildTree(preorder, inorder);

        System.out.println("Inorder traversal of the constructed tree:");
        tree.printInorder(root);

        System.out.println("\nPreorder traversal of the constructed tree:");
        tree.printPreorder(root);
    }
}
