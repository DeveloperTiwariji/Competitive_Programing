import java.util.*;


public class SubStringCharNotRep{
    public static void main(String[] args){
        String s= "abcabcbb";
        int n = s.length();
        int maxL = 0;
        //======================Normal salution===
        // for(int i=0;i<n;i++){
        //     int hash[] = new int[255];
        //     for(int j=i;j<n;j++){
        //         if(hash[s.charAt(j)]==1) break;
        //         int len = j-i+1;
        //         maxL = Math.max(len, maxL);
        //         hash[s.charAt(j)] =1;
        //     }
        // }
        // System.out.println(maxL);





        // ====== Optimise Salution===================

        int l =0;
        int r=0;
        int hash[] = new int[256];
        for(int i=0;i<256;i++){
            hash[i] = -1;
        }

        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>= l){
                    l = hash[s.charAt(r)]+1;
                }
            }

            int len = r-l+1;
            maxL =Math.max(len, maxL);
            hash[s.charAt(r)] = r;
            r++;
        }
        System.out.println(maxL);
    }
}