import java.util.*;


public class MajorityElement{
    public static void main(String[] args){
        int arr[] = {3,2,3};
        System.out.println(mejorityElement1(arr)); // Method 1===============;
        System.out.println(mejorityElement2(arr)); // Method 2===============;
    }
    public static List<Integer> mejorityElement1(int a[]){
        List<Integer> l = new ArrayList<>();
        int n = a.length;
        int nOfAppear = n/3;
        for(int i =0;i<n;i++){
            if(l.size() ==0 || l.get(l.size()-1)!= a[i]){
                int count = 0;
                for(int j = 0;j<n;j++){
                    if(a[i] == a[j]){
                        count++;
                    }
                }
                if(nOfAppear<count){
                    l.add(a[i]);
                }
            }
            if(l.size()==2){
                break;
            }
        }
        return l;
    }
    public static List<Integer> mejorityElement2(int a[]){
        List<Integer> l = new ArrayList<>();
        int n = a.length;
        int count1 =0;
        int count2 = 0;
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(count1 == 0 && a[i]!= element2){
                count1 = 1;
                element1 = a[i];
            }else if(count2 == 0 && a[i]!= element1){
                count2 = 1;
                element2 = a[i];
            }else if(element1 == a[i]){
                count1++;
            }else if(element2 == a[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        count1 =0;
        count2 =0;
        for(int i=0;i<n;i++){
            if(element1 == a[i]){
                count1++;
            }
            if(element2 == a[i]){
                count2++;
            }
        }

        int min = (int)(n/2)+1;
        if(count1>=min){
            l.add(element1);
        }
        if(count2>=min){
            l.add(element2);
        }
        return l;
    }
}