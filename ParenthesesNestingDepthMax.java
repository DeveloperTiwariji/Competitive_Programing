import java.util.*;

public class ParenthesesNestingDepthMax{
    public static void main(String[] args){
        String s ="(1+(2*3)+((8)/4))+1";
        int ans =0;
        int count =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '('){
                count++;
                ans = Math.max(ans,count);
            }else if(s.charAt(i)== ')'){
                count--;
            }
        }
        System.out.println(ans);
    }
}