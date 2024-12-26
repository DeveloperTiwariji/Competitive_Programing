
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToright = true;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> l =new ArrayList<>();
            for(int i=0;i<size;i++){
                 TreeNode rv = q.poll();
                 if (leftToright) {
                    l.add(rv.val);
                } else {
                    l.addFirst(rv.val);
                }

                 if(rv.left!=null){
                    q.add(rv.left);
                 }

                 if(rv.right!=null){
                    q.add(rv.right);
                 }
            }
            ans.add(l);
            leftToright = !leftToright;

        }
        return ans;
    }
}