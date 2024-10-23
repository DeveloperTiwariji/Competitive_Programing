import java.util.*;

public class ThreeSum{
    public static void main(String[] args){
        List<List<Integer>> l = new ArrayList<>();
        int arr[] = {-1,0,1,2,-1,-4};
        threeSum(arr,l);
        System.out.println(l);
    }
    public static void threeSum(int a[],List<List<Integer>> l){
        int n = a.length;
        Arrays.sort(a);
        for(int i =0;i<n;i++){
            if(i>0 && a[i] == a[i-1]) continue;
            int j =i+1;
            int k = n-1;
            while(j<k){
                int sum = a[i]+a[j]+a[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> b = new ArrayList<>();
                    b.add(a[i]);
                    b.add(a[j]);
                    b.add(a[k]);
                    l.add(b);
                    j++;
                    k--;
                    while(j<k && a[j] == a[j-1]) j++;
                    while(j<k && a[k] == a[k+1]) k++;
                }
            }
        }
    }
}