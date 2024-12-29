
 public class TreeNode {
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
    public int maxPathSum(TreeNode root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxpathSum(root, maxValue);
        return maxValue[0];
    }

    public int maxpathSum(TreeNode root, int maxValue[]){
        if(root==null){
            return 0;
        }

        int left = Math.max(0 ,maxpathSum(root.left, maxValue));
        int right = Math.max(0, maxpathSum(root.right,maxValue));
        maxValue[0] = Math.max(maxValue[0] , (root.val + left+ right));
        return (root.val) + Math.max(left, right);
    }
}