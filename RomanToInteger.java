import java.util.*;


public class RomanToInteger{
    public static void main(String[] args){
        String s ="MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int arr[] = new int[256];
        String a = "IVXLCDM";
        int x =1;
        for(int i =0;i<a.length();i++){
            if(i%2==0){
                arr[a.charAt(i)] = x;
                x = x*5;
            }else{
                arr[a.charAt(i)] = x;
                x = x*2;
            }
        }
        int result =0;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = arr[s.charAt(i)];
            if (i < s.length() - 1 && currentValue < arr[s.charAt(i + 1)]) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}