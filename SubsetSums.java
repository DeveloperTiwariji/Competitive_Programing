import java.util.*;

public class SubsetSums{
    public static void main(String[] args){
        int arr[] = {2,3};
        int n = arr.length;
        //===================Batter Salution==========
        List<Integer> ans = new ArrayList<>();
        int pow = (int)(Math.pow(2,n));

        for(int num =0;num<pow;num++){
            
            int sum =0;

            for(int i=0;i<n;i++){

                if((num&(1<<i))!=0){
                    sum = sum+arr[i];
                }
            }
            ans.add(sum);
        }

        System.out.println(ans);

        // ==============Optimal Salution=======================
        List<Integer> optans = new ArrayList<>();
        fun(0, 0, arr, n, optans);
        Collections.sort(optans);
        System.out.println(optans);
    }
    public static void fun(int idx, int sum, int arr[], int n, List<Integer> optans){

        if(n == idx){
            optans.add(sum);
            return;
        }

        // Selected =======
        fun(idx+1, sum+arr[idx], arr, n, optans);

        // Not Selected ======

        fun(idx+1, sum, arr, n, optans);
    }
}
