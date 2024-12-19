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
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }

    public static TreeNode delete(TreeNode root, int key){
        if(root ==null){
            return null;
        }

        if(root.val>key){
            root.left = delete(root.left, key);
        }else if(root.val<key){
            root.right = delete(root.right, key);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
            int min = Min(root.right);
            root.right = delete(root.right, min);
            root.val = min;
            }
        }
        return root;
    }

    public static int Min(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }

        int left = Min(root.left);
        return Math.min(root.val,left);

    }
}