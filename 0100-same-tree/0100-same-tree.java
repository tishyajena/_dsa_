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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        //--------BFS------------
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);
        while(!queue.isEmpty()){
            TreeNode p1 = queue.poll();
            TreeNode q1 = queue.poll();

            if(p1 == null && q1 == null) continue;
            if(p1 == null || q1 == null) return false;
            if(p1.val != q1.val) return false;

            queue.offer(p1.left); queue.offer(q1.left);
            queue.offer(p1.right); queue.offer(q1.right);
        }
        
        return true;

        //-----------DFS--------------
        // if(p == null && q == null) return true;
        // if(p == null || q == null) return false;

        // return (p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right));

    }
}