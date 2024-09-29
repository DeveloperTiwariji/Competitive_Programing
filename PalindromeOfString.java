import java.util.*;

public class PalindromeOfString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
      
        String cleanedStr = cleaned.toString();
        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
    }
}