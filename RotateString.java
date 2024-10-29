import java.util.*;

public class RotateString{
    public static void main(String[] args){
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s,goal));

    }
     public static boolean rotateString(String s, String goal) {
        if(s.length()!= goal.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
              if(s.equals(goal)){
                return true;
            }
            char ch = s.charAt(0);
            String a = s.substring(1,s.length());
            s = a+ch;
        }
        return false;
    }
}