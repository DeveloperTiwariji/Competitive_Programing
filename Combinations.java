import java.util.*;

public class Combinations{

    public static void main(String[] args){
        int n =4;
        int k =2;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        boolean box[] = new boolean[n];
        combination(box,k,0,0,l, ans);
        System.out.println(ans);
    }

    public static void combination(boolean []box, int k, int nop, int idx, List<Integer> l, List<List<Integer>> ans){
         
         if(k == nop){
           ans.add(new ArrayList<>(l));
            return;
         }

        for(int i=idx;i<box.length;i++){
            if(box[i] == false){
                box[i] = true;
                l.add(i+1);
                combination(box,k,nop+1, i+1, l, ans);
                box[i] = false;
                l.remove(l.size()-1);
            }
        }
    }
}