import java.util.*;

public class CountTheNumberOfFairPairs{
    public static void main(String[] args){
        int nums[] = {0, 1, 7, 4, 4, 5};
        int lower =3;
        int upper = 6;
        
        Arrays.sort(nums);
        int n = nums.length;
        long count = 0;
        for(int i=0;i<n-1;i++){

            int lefIndex = findLeft(nums, i+1, n-1, lower- nums[i]);
            int rigthIndex = findRight(nums, i+1, n-1, upper-nums[i]);

            if(lefIndex<=rigthIndex){
                count+= rigthIndex-lefIndex+1;
            }
        }
        System.out.println(count);
    }
    public static int findLeft(int nums[], int start, int end, int target){
        int left =start;
        int right = end;
        int ans = end+1;

        while(left<=right){
            int mid = left +(right-left)/2;

            if(nums[mid]>=target){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public static int findRight(int nums[], int start, int end, int target){
        int left =start;
        int right = end;
        int ans = start-1;

        while(left<=right){
            int mid  = left+(right-left)/2;

            if(nums[mid]<=target){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }
}