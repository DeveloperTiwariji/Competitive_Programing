import java.util.*;

// Find Missing and Repeated Values
public class Matrix{
    public static void main(String[] args){
        int [][] grid = {{1,3},{2,2}};
        int a[] = new int[2];
        a = findMissingAndRepeatedValues(grid);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int max = Integer.MIN_VALUE;
        int n = grid.length;
        int m = grid[0].length;
        int sum1 =0;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                max = Math.max(max,grid[i][j]);
                sum1 = sum1+grid[i][j];
            }
        }
        int arr[] = new int[2];
        int [] count = new int[max+1];
        int re = 0;
        for(int i=0;i<n;i++){
            for(int j =0;j<m;j++){
                count[grid[i][j]]++;
                if(count[grid[i][j]]>1){
                    re = grid[i][j];
                }
            }
        }
        int sum2 =0;
        for(int i=0;i<=max;i++){
            sum2 = sum2+i;
        }
        sum2 = sum2 +re;
        arr[0] = re;
        int d = sum2 - sum1;
        if(d==0){
            arr[1] = max+1;
        }else{
            arr[1] = d;
        }
        return arr;
    }

}