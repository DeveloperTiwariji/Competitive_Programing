import java.util.*;

public class SetMatrixZeroes{
    public static void main(String[] args){
        int matrix [][] ={{1,1,1},{1,0,1},{1,1,1}};
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
        int col[] = new int[m];
        for(int i=0;i<n;i++){
            row[i] =0;
        }
        for(int i=0;i<m;i++){
            col[i] =0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i] =1;
                    col[j] =1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j] =0;
                }
            }
        }

        System.out.println("After Set zeroes: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}