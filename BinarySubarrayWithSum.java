import java.util.*;

 
public class  BinarySubarrayWithSum{
    public static void main(String[] args){
        int nums[] = {1,0,1,0,1};
        int goal =2;
        if(goal<0){
            System.out.println(0);
        }

        int lessThanQual = Goal(nums, goal);
        int lessThan = Goal(nums, goal-1);
        System.out.println(lessThanQual-lessThan);
    }
    public static int Goal(int nums[], int goal){
        int  n = nums.length;
        int l =0;
        int r=0;
        int sum =0;
        int count =0;
        while(r<n){
            sum+= nums[r];
            
            while(sum>goal && l<=r){
                sum-= nums[l];
                l++;
            }

            if(sum<=goal){
                count+= (r-l+1);
            }
            r++;
        }
        return count;
    }
}