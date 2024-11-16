import java.util.*;


// ====================force approach=========

public class MaxConsecutiveOnes{
    public static void main(String[] args){
        int arr[] ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k =3;

        int maxLen =0;
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]== 0){
                    count++;
                }
                if(count<=k){
                    maxLen = Math.max(maxLen, j-i+1);
                }else{
                    break;
                }
            }
        }
        System.out.println(maxLen);
        System.out.println(Better(arr,k));
        System.out.println(Optimal(arr,k));

    }


    //===========================Better Approch===============
    public static int Better(int arr[], int k){
        int n = arr.length;
        int left =0;
        int right =0;
        int count =0;
        int maxLen =0;

        while(right<n){
            if(arr[right] ==0) count++;

            while(count>k){
                if(arr[left] ==0) count--;
                left++;
            }

            if(count<=k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
        }
        return maxLen;
    }


    //==================Optimal Approch=====================
    public static int Optimal(int arr[], int k){
        int left =0;
        int right =0;
        int maxLen =0;
        int count =0;
        int n = arr.length;
        while(right<n){
            if(arr[right] ==0) count++;

            if(count>k){
                if(arr[left] ==0) count--;
                 left++;
            }

            if(count<=k){
                maxLen = Math.max(maxLen, right-left+1);
               
            }
            right++;
        }
        return maxLen;
    }
}