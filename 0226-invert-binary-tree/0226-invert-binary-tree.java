/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode preOrder(TreeNode root){
        if(root == null) return root;
        TreeNode p = root;
        p = root.left;
        root.left = root.right;
        root.right = p;

        preOrder(root.left);
        preOrder(root.right);

        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        return preOrder(root);

    }
}