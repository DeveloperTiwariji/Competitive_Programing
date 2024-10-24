import java.util.*;

public class FourSum{
    public static void main(String[] args){
        int arr[] = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> l = new ArrayList<>();
        fourSum(arr,target,l);
        System.out.println(l);
    }
    public static void fourSum(int a[], int target,List<List<Integer>> t){
        Arrays.sort(a);
        int n = a.length;
        for(int i =0;i<n;i++){
            if(i>0 && a[i] == a[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j!= i+1 && a[j] == a[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum =a[i];
                    sum+= a[j];
                    sum+=a[k];
                    sum+=a[l];
                    if(sum>0){
                        l--;
                    }else if(sum<0){
                        k++;
                    }else{
                        List<Integer> b = new ArrayList<>();
                        b.add(a[i]);
                        b.add(a[j]);
                        b.add(a[k]);
                        b.add(a[l]);
                        t.add(b);
                        k++;
                        l--;
                        while(k<l && a[k] == a[k-1]) k++;
                        while(k<l && a[l] == a[l+1]) l--;
                    }
                }
            }
        }
    }
}