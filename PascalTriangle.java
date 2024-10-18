import java.util.*;

public class PascalTriangle{
    public static void main(String[] args){
        int row = 5;
        System.out.print(generate(row));
    }
    public static List<List<Integer>> generate(int row){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<row;i++){
            ans.add(generateRow(i+1));
        }
        return ans;
    }
    public static List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> l = new ArrayList<>();
        l.add(1);
        for(int i = 1;i<row;i++){
            ans = ans*(row-i);
            ans = ans/i;
            l.add((int)(ans));
        }
        return l;

    }
}