import java.util.*;

public class NextGreaterElementII{
    public static void main(String[] args){
        int nums[] = {1,2,1};
        nextGreaterElement(nums);
    }

    public static void nextGreaterElement(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            while((!st.isEmpty())&& st.peek()<=arr[i%n]){
                st.pop();
            }

            if(i<n){
                ans[i] = st.isEmpty()? -1 : st.peek();
            }
            st.push(arr[i%n]);
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}