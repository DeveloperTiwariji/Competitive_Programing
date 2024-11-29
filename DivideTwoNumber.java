import java.util.*;

public class DivideTwoNumber{
    public static void main(String[] args){
        int divident = 7;
        int divisor =-3;

        boolean sign = true;
        if(divident>=0 && divisor<0) sign = false;
        else if(divident<0 && divisor>=0) sign = false;

        long n = Math.abs((long)divident);
        long d = Math.abs((long)divisor);
        long ans =0;

        while(n>=d){
            int cnt =0;
            while(n>= (d<<(cnt+1))){
                cnt++;
            }

            ans+= (1<<cnt);
            n-= (d<<cnt);
        }

        if(ans==(1<<31)&&sign) System.out.println(Integer.MAX_VALUE);
        if(ans ==(1<<31)&&!sign) System.out.println(Integer.MIN_VALUE);

        if(sign==true){
            System.out.println(ans);
        }else{
            System.out.println(-ans);
        }
    }
}