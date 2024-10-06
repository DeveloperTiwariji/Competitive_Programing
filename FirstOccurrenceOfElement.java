import java.util.*;

public class FirstOccurrenceOfElement{
    public static void main(String[] args){
        int arr[] = {8,3,5,4,3,5,6,7,2,24,5,4,2};
        int k = 10;
        System.out.println(firstIndex(arr,0,k));
    }
    public static int firstIndex(int a[],int i, int k){
        if(i==a.length){
            return -1;
        }
        if(a[i] ==k){
            return i;
        }

        return firstIndex(a,i+1,k);
    }
}