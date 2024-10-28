import java.util.*;


public class MaximumProductSubarray{
    public static void main(String[] args){
      int arr[] = {2,3,-2,4};
      System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int prefix =1;
        int sufix = 1;
        for(int i=0;i<n;i++){
            if(prefix ==0) prefix =1;
            if(sufix == 0) sufix =1;
             prefix = prefix*nums[i];
             sufix = sufix*nums[n-i-1];
             ans = Math.max(ans,Math.max(prefix,sufix));
        }
            
        return ans;
        
    }
}