import java.util.*;

public class ValidAnagram{
    public static void main(String[] args){
        String s ="anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            return true;
        }else{
            return false;
        }
    
       
    }
}