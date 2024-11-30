import java.util.*;

public class MinimumBitFlipstoConvertNumber{
    public static void main(String[] args){
        int start = 10;
        int goal = 7;

        int ans = start^goal;

        int count =0;
        
        while(ans>1){

            count+= ans&1;

            ans=ans>>1;
        }

        if(ans ==1) count++;

        System.out.println(count);
    }
}