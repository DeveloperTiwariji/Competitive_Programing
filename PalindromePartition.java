import java.util.*;


public class PalindromePartition{
    public static void main(String[] args){
        String s ="aab";
        List<List<String>> ans = new ArrayList<>();
        List<String> l = new ArrayList<>();
        partition(s,l,ans);
        System.out.println(ans);
    }

    public static void partition(String que, List<String> l, List<List<String>> ans){
        
        if(que.length() ==0){
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int i =1;i<= que.length(); i++){
            String s = que.substring(0,i);

            if(isPalindrome(s)== true){
                l.add(s);
                partition(que.substring(i), l, ans);
                l.remove(l.size()-1);
            } 
        }
    }

    public static boolean isPalindrome(String s){
        int i =0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!= s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}