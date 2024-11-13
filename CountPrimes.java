import java.util.*;

public class CountPrimes{
    public static void main(String[] args){
        int n =10;
        
        if(n ==0 || n ==1){
            System.out.println(0);
        }
       int count =0;
       boolean prime[] = new boolean[n+1];
       for(int i = 2;i<prime.length;i++){
        prime[i] = true;
       }

       numberOfPrime(prime);
       for(int i=2;i<prime.length;i++){
        if(prime[i] ==true && i<n){
            count++;
        }
       }
       System.out.println(count);
    }
    public static void numberOfPrime(boolean prime[]){

        for(int i=0;i*i<prime.length;i++){
            if(prime[i] ==true){
                for(int j=2;j*i<prime.length;j++){
                    prime[i*j] = false;
                }
            }
        }
    }
}