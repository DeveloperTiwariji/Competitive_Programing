import java.util.*;


public class CombinationSum{
    public static void main(String[] args){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int candidates[] = {2,3,6,7};    //Candidates;
        int target = 7;
        combinationSum(candidates, target, 0, l, ans);
        System.out.println(ans);
    }

    public static void combinationSum(int []candidates, int target, int idx, List<Integer> l, List<List<Integer>> ans){
         
         if(target == 0){
            ans.add(new ArrayList<>(l));
            return;
         }

        for(int i=idx;i<candidates.length;i++){
            if(target>= candidates[i]){
                l.add(candidates[i]);
                combinationSum(candidates, target-candidates[i], i, l, ans);
                l.remove(l.size()-1);
            }
        }
    }
}