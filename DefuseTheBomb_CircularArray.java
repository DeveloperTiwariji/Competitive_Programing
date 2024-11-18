import java.util.*;


public class DefuseTheBomb_CircularArray{
    public static void main(String[] args){
        int code[] = {5,7,1,4};
        int k = 3; // it can be ve- or 0 also===
        int n =code.length;
        int arr[] = new int[n];

        if(k ==0){
            // return arr;
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
        }

        if(k>0){
            for(int i=0;i<n;i++){
                int sum =0;
                for(int j=1;j<=k;j++){
                    sum+= code[(i+j)%n];
                }
                arr[i] = sum;
            }
        }
        // ===== If k <0 ====
        else{
           k =-k;
           for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=1;j<=k;j++){
                sum+= code[(i-j+n)%n];
            }
            arr[i] = sum;
           } 
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}