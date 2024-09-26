import java.util.*;

public class ReverseInteger{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n =sc.nextInt();
        System.out.println(ReverseNumber(n));
    }

    public static int ReverseNumber(int x){
          int reverse = 0;
        while(x!=0){
            int res =x%10;
             if(reverse < Integer.MIN_VALUE/10 || reverse > Integer.MAX_VALUE/10){
            return 0;
        }
            reverse = reverse*10+res;
            x  = x/10;
        }

        return reverse;
    }
}