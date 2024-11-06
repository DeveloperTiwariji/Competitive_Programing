import java.util.*;

public class LongestPalindromeSubString{
    public static void main(String[] args){
        String s ="babad";
        // if (s == null || s.length() < 2) return s;
        String p ="";
        int maxLen =0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String x = s.substring(i,j);
                if(isPalindrome(x)== true){
                    int len =x.length();
                    if(len>maxLen){
                        maxLen = len;
                        p =x;
                    }
                }
            }
        }
        System.out.println(p);
    }
    public static boolean isPalindrome(String ss){
        int i=0;
        int j= ss.length()-1;

        while(i<j){
            if(ss.charAt(i)!= ss.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}