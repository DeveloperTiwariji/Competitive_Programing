import java.util.*;


public class SubsetSumBithoutDuplicate{
    public  static void main(String[] args){
        int nums[] = {1,2,2};

        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        fun(0, nums, l, ans);
        System.out.println(ans);
    }

    public static void fun(int idx, int arr[], List<Integer> l , List<List<Integer>> ans){

       ans.add(new ArrayList<>(l));

       for(int i=idx;i<arr.length;i++){
        if(i!=idx && arr[i] == arr[i-1])continue;

        l.add(arr[i]);
        fun(i+1, arr, l, ans);
        l.remove(l.size()-1);
       } 
    }
}