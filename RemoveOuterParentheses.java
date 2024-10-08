import java.util.*;

public class RemoveOuterParentheses{
    public static void main(String[] args){
        System.out.println(remove("(()())(())"));
    }

    public static String remove(String s){
        int count=0;
        String ans ="";
        int l = s.length();
        for(int i=0;i<l;i++){
            if(s.charAt(i) == '('){
                count++;
            }else if(s.charAt(i) == ')'){
                count--;
            }
            if(count ==0){
                ans = ans.substring(0,ans.length()-1);
                continue;
            }else{
                ans = ans +s.charAt(i+1);
            }
        }
        return ans;
    }
}