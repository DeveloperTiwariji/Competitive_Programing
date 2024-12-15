
// =====================================O(n^2)=====================================

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
    public boolean isBalanced(TreeNode root) {
        return Balanced(root);

    }

    public static boolean Balanced(TreeNode root){
        if(root ==null){
            return true;
        }

        boolean left = Balanced(root.left);
        boolean right = Balanced(root.right);
        boolean sb = Math.abs(ht(root.left) - ht(root.right)) <=1;
        return left && right && sb;
    }

    public static int ht(TreeNode root){
        if(root ==null){
            return -1;
        }

        int left = ht(root.left);
        int right = ht(root.right);
        return Math.max(left, right) +1;
    }
}


////==============================O(n)======================================

class Solution {
    public boolean isBalanced(TreeNode root) {
        return Balanced(root).isBalance;
    }

    public BalancedPair Balanced(TreeNode root){
        if(root ==null){
            return new BalancedPair();
        }

        BalancedPair lbp = Balanced(root.left);
        BalancedPair rbp = Balanced(root.right);
        BalancedPair sbp = new BalancedPair();
        sbp.ht = Math.max(lbp.ht,rbp.ht)+1;
        boolean sb = Math.abs(lbp.ht - rbp.ht) <=1;
        sbp.isBalance = sb && lbp.isBalance && rbp.isBalance;
        return sbp;
    }

    class BalancedPair{
        boolean isBalance =true;
        int ht = -1;
    }
}