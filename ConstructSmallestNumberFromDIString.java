import java.util.*;

public class ConstructSmallestNumberFromDIString{
    public static void main(String[] args){
        String s= "IIIDIDDD";

        System.out.print(smallestNumber(s));
    }
    public static String smallestNumber(String s){
        int arr[] = new int[s.length()+1];
        Stack<Integer> st = new Stack<>();
        String ans = "";
        int count =1;
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i) == 'I'){
                arr[i] = count;
                count++;
                while(!st.isEmpty()){
                    arr[st.pop()] = count;
                    count++;
                }
            }else{
                st.push(i);
            }
        }

        for(int i=0;i<arr.length;i++){
           ans = ans+arr[i];
        }
       return ans;
    }
}