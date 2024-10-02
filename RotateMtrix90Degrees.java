import java.util.*;

public class RotateMtrix90Degrees{
    public static void main(String[] args){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n =matrix.length;
        int m = matrix[0].length;
        int newMatrix[][] = new int[n][m];
        int x =m-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newMatrix[j][x] = matrix[i][j];
            }
            x--; 
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = newMatrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}