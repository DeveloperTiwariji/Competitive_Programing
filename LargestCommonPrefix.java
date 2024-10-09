import java.util.*;


public class LargestCommonPrefix{
    public static void main(String[] args){
        String arr[] ={"flower","flow","flight"};
        System.out.println(lorgestPrefix(arr));
    }
    public static String lorgestPrefix(String [] strs){
        if(strs == null || strs.length==0){
            return "";
        }

        if(strs.length==1){
            return strs[0];
        }

        int length = Integer.MAX_VALUE;
        for(String s:strs){
            length = Math.min(length,s.length());
        }

        StringBuilder prefix = new StringBuilder();
        for(int i=0;i<length;i++){
            char current = strs[0].charAt(i);

            for(String s:strs){
                if(s.charAt(i)!=current){
                    return prefix.toString();
                }
            }
            prefix.append(current);
        }
        return prefix.toString();
    }
}