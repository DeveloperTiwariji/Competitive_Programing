import java.util.*;

public class CombinationSumII{
    public static void main(String[] args){
        int candidates[] = {10,1,2,7,6,1,5};
        int target = 8;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        generateCombinationSum2(candidates,target, l, ans, 0);
        System.out.println(ans);
    }
     public static void generateCombinationSum2(int arr[], int target, List<Integer> l, List<List<Integer>> ans, int idx){
        
        if(target ==0){
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) break;

            l.add(arr[i]);
            generateCombinationSum2(arr, target-arr[i], l, ans, i+1);
            l.remove(l.size()-1);
        }
    }
}