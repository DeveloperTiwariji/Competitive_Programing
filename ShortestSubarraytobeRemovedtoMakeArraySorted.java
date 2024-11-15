import java.util.*;

public class ShortestSubarraytobeRemovedtoMakeArraySorted{
    public static void main(String[] args){
        int arr[] = {1,2,3,10,4,2,3,5};
        int n = arr.length;
        int left =0;
        while(left+1<n && arr[left]<=arr[left+1]){
            left++;
        }

        if(left ==n-1){
            System.out.println(0);
        }

        int right = n-1;

        while(right>0 && arr[right-1]<=arr[right]){
            right--;
        }

        int result = Math.min(n-left-1, right);

        int i =0;
        int j = right;

        while(i<= left && j<n){
            if(arr[i]<=arr[j]){
                result = Math.min(j-i-1, result);
                i++;
            }else{
                j++;
            }
        }

        System.out.println(result);
    }
}