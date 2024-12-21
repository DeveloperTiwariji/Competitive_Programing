
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

    int maxsum = 0; 
    public int maxSumBST(TreeNode root) {
        maxsum = 0; 
        maxSum(root);
        return maxsum;
    }


    public BstPair maxSum(TreeNode root){
        if(root ==null){
            return new BstPair();
        }

        BstPair lbst = maxSum(root.left);
        BstPair rbst = maxSum(root.right);
        BstPair sbst = new BstPair();
        sbst.min = Math.min(root.val, Math.min(lbst.min, rbst.min));
        sbst.max = Math.max(root.val, Math.max(lbst.max, rbst.max));
        sbst.isbst = lbst.isbst && rbst.isbst && root.val > lbst.max && root.val < rbst.min;

        if(sbst.isbst){
            sbst.sum = lbst.sum + rbst.sum +root.val;
            maxsum = Math.max(maxsum, sbst.sum);
        }else{
            sbst.sum = Math.max(lbst.sum, rbst.sum);
            maxsum = Math.max(maxsum, sbst.sum);
        }
       return sbst; 

    }


    class BstPair{
        boolean isbst = true;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum =0;
    }
}