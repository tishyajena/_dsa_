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
    public boolean isValidBST(TreeNode root) {
        //----INORDER --> SORTED----
        List<Integer> inOrderList = new LinkedList<>();
        helper(root, inOrderList);

        int prev = inOrderList.get(0);
        for(int i = 1; i<inOrderList.size(); i++){
            if(inOrderList.get(i)<=prev) return false;
            prev = inOrderList.get(i);
        }
        return true;
    }
    private void helper(TreeNode root, List<Integer> p){
        if(root == null) return;
        helper(root.left, p);
        p.add(root.val);
        helper(root.right, p);
    }
}