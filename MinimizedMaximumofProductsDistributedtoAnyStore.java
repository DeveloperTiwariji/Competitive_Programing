import java.util.*;

public class MinimizedMaximumofProductsDistributedtoAnyStore{
    public static void main(String[] args){
        int n = 6;
        int quantities[] = {11,6};

         int left = 1, right = maxValue(quantities);
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canDistribute(quantities, n, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        System.out.println(left);
    }
    public static int maxValue(int a[]){
        int maxV = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>maxV){
                maxV = a[i];
            }
        }
        return maxV;
    }
     public static boolean canDistribute(int[] quantities, int n, int maxProducts) {
        int stores = 0;
        for (int q : quantities) {
            stores += (q + maxProducts - 1) / maxProducts;
            if (stores > n) {
                return false;
            }
        }
        return true;
    }
}