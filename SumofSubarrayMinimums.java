import java.util.*;

public class SumofSubarrayMinimums{
    public static void main(String[] args){

        int arr[] = {11,81,94,43,3};
        int n = arr.length;

        int pse[] = new int[n];
        int nse[] = new int[n];
        pse = findePSE(arr);
        nse =findNSE(arr);
        int mod = (int)(10e9 +7);
        int total = 0;

        for(int i=0;i<n;i++){

            int left = i-pse[i];
            int right = nse[i] -i;

            total = (total+ (left*right*arr[i])%mod)%mod;
        }

        System.out.println(total);
    }

    public static int [] findePSE(int arr[]){
        int n = arr.length;
        int pse[] = new int[n];
        Stack<Integer> st  = new Stack<>();

        for(int i =0;i<n;i++){
            while((!st.isEmpty())&& arr[st.peek()]> arr[i]){
                st.pop();
            }

            pse[i] = st.isEmpty() ?-1: st.peek();
            st.push(i);
        }

        return pse;
    }

    public static int [] findNSE(int arr[]){
        int n = arr.length;
        int nse[] = new int[n];
        Stack<Integer> st =new Stack<>();

        for(int i= n-1;i>=0;i--){
            while((!st.isEmpty()) && arr[st.peek()]>=arr[i]){
                st.pop();
            }

            nse[i] = st.isEmpty() ? n:st.peek();
            st.push(i);
        }

        return nse;
    }
}