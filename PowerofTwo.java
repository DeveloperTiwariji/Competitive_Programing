import java.util.*;

public class PowerofTwo{
    public static void main(String[] args){
        int n =16;
        if(n ==1){
            System.out.println("true");
        }
        int a = n/2;
        int ans =1;
        for(int i=0;i<a;i++){
            ans = ans*2;
            if(ans==n){
                System.out.println("true");
                break;
            }
        }
        System.out.println("false");
    }
}