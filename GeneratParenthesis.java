import java.util.*;

public class GeneratParenthesis{
    public static void main(String[] args){
        int n =3;
        List<String> l = new ArrayList<>();
        parenthesis(n,0,0,"",l);
        System.out.print(l);
    }
    public static void parenthesis(int n,int open,int close,String current, List<String> l){
         
         if(open ==n && close ==n){
            l.add(current);
            return;
         }



        if(open<n){
            parenthesis(n,open+1,close,current+"(",l);
        }
        if(close<open){
            parenthesis(n,open,close+1,current+")",l);
        }
    }
}