import java.util.*;


public class ReversePairs{
    public static void main(String[] args){
        int arr[] = {1,3,2,3,1};
        System.out.print(reversePairs(arr));
    }
    public static int count =0;
     public static int reversePairs(int[] nums) {
        if (nums.length == 0) return 0;
        int n = nums.length;
        count =0;
       mergeSort(nums,0,n-1);
        return count;
    }
     public static void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        countPairs(arr,low,mid,high);
        merge(arr,low,mid,high); 
    }
    public static void countPairs(int arr[],int low,int mid,int high){
        int right = mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i]>2L*arr[right]) right++;
            count+= (right-(mid+1));
        }
    }
    public static void merge(int arr[],int low,int mid, int high){
        int left = low;
        int right = mid+1;
        List<Integer> l = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<arr[right]){
                l.add(arr[left]);
                left++;
            }else{
                l.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            l.add(arr[left]);
            left++;
        }
        while(right<=high){
            l.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            arr[i] = l.get(i-low);
        }
    }
}