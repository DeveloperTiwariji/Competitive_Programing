import java.util.*;

public class Remove_K_Digits{
    public static void main(String[] args){
        String num ="1432219";
        int k =3;
        System.out.print(removekDigits(num, k));
    }

    public static String removekDigits(String num, int k){
        if(num.length() ==0) return "0";

        Stack<Character> st = new Stack<>();

        for(char digit : num.toCharArray()){
            while((!st.isEmpty())&& k>0 && st.peek()>digit){
                st.pop();
                k--;
            }

            st.push(digit);
        }

        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();

        for(char digit: st){
            result.append(digit);
        }

        while(result.length()>0 && result.charAt(0) =='0'){
            result.deleteCharAt(0);
        }

        return result.length() ==0? "0" :result.toString();
    }
}