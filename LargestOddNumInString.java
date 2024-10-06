import java.util.*;


public class LargestOddNumInString{
    public static void main(String[] args){
        System.out.println(largestOddNumber("35427"));
    }
     public static String largestOddNumber(String num) {
      int l = num.length();
      for(int i=l-1;i>=0;i--){
        char c =num.charAt(i);
        int a =c-'0';
        if(a%2!=0){
            return num.substring(0,i+1);
        }
      }
     
      return "";
    }
}