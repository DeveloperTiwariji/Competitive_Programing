import java.util.*;


public class CombinationSumIII{
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int n =7;
        int k =3;
        int arr[] = new int[9];
        for(int i=1;i<=arr.length;i++){
            arr[i-1] = i;
        }
        combination(arr, n, k, 0, l, ans);
        System.out.println(ans);
    }
    public static void combination(int arr[], int n, int k, int idx, List<Integer> l, List<List<Integer>> ans){
         if(n ==0){
            if(l.size()==k){
                ans.add(new ArrayList<>(l));
                return;
            }
         }


        for(int i=idx;i<arr.length;i++){
            if(n>= arr[i]){
                l.add(arr[i]);
                combination(arr, n-arr[i], k, i+1, l, ans);
                l.remove(l.size()-1);
            }
        }
    }
}