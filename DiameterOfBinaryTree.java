// ===============O(n^2)=========


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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root ==null){
            return 0;
        }

        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int d = ht(root.left)+ht(root.right)+2;
        return Math.max(ld ,Math.max(rd,d));
    }
    
    public static int ht(TreeNode root){
        if(root ==null){
            return -1;
        }
        int left = ht(root.left);
        int right = ht(root.right);
        return Math.max(left, right)+1;
    }
}




//====================O(n)================================

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dt;
    }

    public DiaPair diameter(TreeNode root){
        if(root==null){
            return new DiaPair();
        }

        DiaPair ld = diameter(root.left);
        DiaPair rd = diameter(root.right);
        int sd = (ld.ht+rd.ht)+2;
        DiaPair sdp = new DiaPair();
        sdp.dt = Math.max(ld.dt, Math.max(rd.dt,sd));
        sdp.ht = Math.max(ld.ht, rd.ht)+1;
        return sdp;
    }

    class DiaPair{
        int dt =0;
        int ht =-1;
    }
}