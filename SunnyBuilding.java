import java.util.*;


public class SunnyBuilding{
    public static void main(String[] args){
        int arr[] = {30, 35, 40, 38, 35};
        int n = arr.length;
        fun(arr, n);
    }

    public static void fun(int arr[], int n){
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){

            while((!st.isEmpty())&& arr[i]>=arr[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] =i+1;
            }else{
                ans[i] = i-st.peek();
            }
            st.push(i);
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}