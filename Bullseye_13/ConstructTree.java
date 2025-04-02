package Bullseye_13;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class ConstructTree {
    static int postIndex;
    static HashMap<Integer, Integer> inorderMap;

   
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1; 
        inorderMap = new HashMap<>();

      
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return construct(0, inorder.length - 1, postorder);
    }

    private static TreeNode construct(int inStart, int inEnd, int[] postorder) {
        if (inStart > inEnd) return null; 

        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        
        int rootIndex = inorderMap.get(rootVal);

       
        root.right = construct(rootIndex + 1, inEnd, postorder);
        root.left = construct(inStart, rootIndex - 1, postorder);

        return root;
    }


    public static void inorderPrint(TreeNode root) {
        if (root == null) return;
        inorderPrint(root.left);
        System.out.print(root.val + " ");
        inorderPrint(root.right);
    }

    public static void main(String[] args) {
        int[] inorder = {40, 20, 50, 10, 60, 30};
        int[] postorder = {40, 50, 20, 60, 30, 10};

        TreeNode root = buildTree(inorder, postorder);

        System.out.print("Inorder of Constructed Tree: ");
        inorderPrint(root);
    }
}
