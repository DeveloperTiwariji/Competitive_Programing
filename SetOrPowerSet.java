import java.util.*;


public class SetOrPowerSet{
    public static void main(String[] args){
         List<List<Integer>> ans = new ArrayList<>();
        int arr[] = {1,2,3};

        int n = arr.length;

        for(int num = 0; num<1<<n; num++){ // loop is working 2^n-1 time;
           List<Integer> l = new ArrayList<>();
           for(int i=0;i<=n-1;i++){
            if((num&(1<<i))!= 0){
                l.add(arr[i]);
            }
           }
           ans.add(l);
        }
        System.out.println(ans);
    }
}