import java.util.*;

public class CountGoodNumbers{
    static long MOD = 1000000007;
    public static void main(String[] args){
        long n =50;
        System.out.println(goodNumber(n));
    }
    // Static long MOD = 1000000007;
    public static long goodNumber(long n){

        long even = (n+1)/2;
        long odd = n/2;
        return (int)(multiply(power(5,even), power(4,odd)));
    }
    public static long power(long x, long n){

        if(n==0){
            return 1;
        }

        long half = power(x, n/2)%MOD;

        long ans = multiply(half, half);

        if(n%2!=0){
            ans = multiply(ans, x);
        } 

        return ans%MOD;
    }

    public static long multiply(long a, long b){
        return ((a%MOD)*(b%MOD))%MOD;
    }
}