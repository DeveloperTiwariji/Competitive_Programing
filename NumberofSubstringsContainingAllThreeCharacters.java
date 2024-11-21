import java.util.*;

public class NumberofSubstringsContainingAllThreeCharacters{
    public static void main(String[] args){
        String s = "abcabc";
        int n = s.length();
        int count =0;
        int hash[] = {-1,-1,-1};
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']=i;
            if(hash[0]!= -1 && hash[1]!= -1 && hash[2]!= -1){
                count = count+(1+ min(hash[0], hash[1], hash[2]));
            }
        }
        System.out.println(count);
    }
    public static int min(int a, int b, int c){
        int x = Math.min(a,b);
        int ans = Math.min(x,c);
        return ans;
    }
}