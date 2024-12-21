
class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    public int largestBst(Node root)
    {
      return largestbst(root).size;  
    }
    
    
    public BstPair largestbst(Node root){
        if(root ==null){
            return new BstPair();
        }
        
        BstPair lbst = largestbst(root.left);
        BstPair rbst = largestbst(root.right);
        BstPair sbst = new BstPair();
        sbst.min = Math.min(root.data, Math.min(lbst.min, rbst.min));
        sbst.max = Math.max(root.data, Math.max(rbst.max, lbst.max));
        sbst.isbst = lbst.isbst && rbst.isbst && root.data > lbst.max && root.data < rbst.min;
        if(sbst.isbst){
            sbst.size = lbst.size + rbst.size +1;
        }else{
            sbst.size = Math.max(lbst.size , rbst.size);
        }
        
        return sbst;
    }
    
    
    class BstPair{
        boolean isbst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int size =0;
    }
    
}