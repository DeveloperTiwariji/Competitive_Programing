import java.util.*;

public class NextPermutation{
    public static void main(String[] args){
    int arr [] = {1,2,3}; //you give value of array anything==
    int n =arr.length;
    //1=== find the break point====
    int indx = -1;
    for(int i= n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            indx = i;
            break;
        }
    }
    if(indx == -1){
        int i=0;
        int j= n-1;
        reverce(arr,i,j);
    }else{
        //===2  find>index , but smallenst====;
        for(int i=n-1;i>indx;i--){
            if(arr[i]>indx){
                int temp = arr[i];
                arr[i] = arr[indx];
                arr[indx] = temp;
                break;
            }
        }
        reverce(arr,indx+1,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    }


    public static void reverce(int a[],int i,int j){
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    
}
}