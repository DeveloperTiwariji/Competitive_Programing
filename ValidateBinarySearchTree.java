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
    public boolean isValidBST(TreeNode root) {
      return validbst(root).isBst;  
    }

    public BstPair validbst(TreeNode root){
        if(root ==null){
            return new BstPair();
        }

        BstPair lbst = validbst(root.left);
        BstPair rbst = validbst(root.right);
        BstPair sbst = new BstPair();
        sbst.min = Math.min(root.val, Math.min(lbst.min, rbst.min));
        sbst.max = Math.max(root.val, Math.max(lbst.max, rbst.max));
        sbst.isBst = lbst.isBst && rbst.isBst && root.val > lbst.max && root.val < rbst.min;
        return sbst;
    }

    class BstPair{
        boolean isBst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
    }
}