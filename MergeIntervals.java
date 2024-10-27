import java.util.*;

public class MergeIntervals{
    public static void main(String[] args){
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};
        arr = intervals(arr);
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println(Integer.MAX_VALUE);
    }
    public static int[][] intervals(int a[][]){
        Arrays.sort(a,(x,y) ->Integer.compare(x[0],y[0]));
        List<int[]>l = new ArrayList<>();
        for(int [] interval: a){
            if(l.isEmpty() || interval[0]> l.get(l.size()-1)[1]){
                l.add(interval);
            }else{
                l.get(l.size()-1)[1] = Math.max(l.get(l.size()-1)[1],interval[1]);
            }
        }

        return l.toArray(new int[l.size()][]);
    }
}