import java.util.*;

public class Palindrom_Num{
    public static void main(String[] args){
        int number  = 121;
        System.out.println(isPalindrome(121));
    }
     public static boolean isPalindrome(int x) {
        int n =x;
        int revNum =0;
        while(x>0){
            int mod = x%10;
            // if(revNum> Integer.MAX_VALUE/10 ||  revNum< Integer.MIN_VALUE/10){
            //     return false;
            // }
            revNum = revNum*10+mod;
            x =x/10;
        }
        if(n == revNum){
            return true;
        }
        return false;
    }
}