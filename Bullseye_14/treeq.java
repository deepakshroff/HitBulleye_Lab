package Bullseye_14;

import java.util.LinkedList;
import java.util.Queue;

public class treeq {

static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            depth++;
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        // Example test case: root = [2,null,3,null,4,null,5,null,6]
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);

        treeq outer = new treeq();
        Solution sol = outer.new Solution();
        int result = sol.maxDepth(root); // Corrected method name here
        System.out.println("Maximum Depth: " + result);
    }
}

}
