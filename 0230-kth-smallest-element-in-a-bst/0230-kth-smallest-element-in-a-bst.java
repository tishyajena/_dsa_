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
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        // Queue<TreeNode> q = new ArrayDeque<>();
        // q.offer(root);

        // List<Integer> list = new ArrayList<>();

        // while(!q.isEmpty()){

        //     TreeNode temp = q.poll();
        //     list.add(temp.val);

        //     if(temp.left != null){
        //         q.offer(temp.left);
        //     }
        //     if(temp.right != null) {
        //         q.offer(temp.right);
        //     }

        // }
        // Collections.sort(list);
        // return list.get(k-1);

        //----DFS----
        
        
        inorder(root,k);
        return ans;

    }
    private void inorder(TreeNode node, int k){

        if(node == null) return;
        inorder(node.left, k);
        count++;
        if(count == k){
            ans = node.val;
            return;
        }
        inorder(node.right, k);
    }
}