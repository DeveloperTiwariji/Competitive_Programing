import java.util.*;

public class KthLargestElementinanArray{
    public static void main(String[] args){
        int arr[] ={3,2,1,5,6,4};
        int k =2;
        System.out.println(KtheLargest(arr,k));
    }

    public static int KtheLargest(int nums[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.remove();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }

}