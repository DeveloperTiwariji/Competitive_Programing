import java.util.*;

public class LongestRepeatingCharacterReplacement{
    public static void main(String[] args){
        String s = "ABAB";
        int k =2;
        int ei =0;
        int si =0;
        int maxFrec =0;
        int ans =0;
        int frec[] = new int[26];
        int n = s.length();
        while(si<n){
            frec[s.charAt(si)-'A']++;
            maxFrec = Math.max(maxFrec, frec[s.charAt(si)-'A']);

            while((si-ei+1)-maxFrec>k){
                frec[s.charAt(ei)-'A']--;
                ei++;
            }

            ans = Math.max(ans, si-ei+1);
            si++;
        }
        System.out.println(ans);
    }
}