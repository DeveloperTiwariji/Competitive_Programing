import java.util.*;

public class UnionOfTwoSortedArray{
    public static void main(String[] args){
        int arr1[] = {1, 2, 3, 4, 5};
        int n =arr1.length;
        int arr2[] = {1, 2, 3, 6, 7};
        int m = arr2.length;
        ArrayList<Integer> l = new ArrayList<>();
        l = unionOf(arr1,arr2,n,m);
        for(Integer i:l){
            System.out.print(i+" ");
        }
    }

    // One Way =============================================
   


    // Second Way ==============================================
    public static ArrayList<Integer> unionOf(int arr1[], int arr2[], int n, int m) {
    ArrayList<Integer> l = new ArrayList<>();
    int i = 0;
    int j = 0;
    while (i < n && j < m) {
        if (arr1[i] <= arr2[j]) {
            if (l.isEmpty() || l.get(l.size() - 1) != arr1[i]) {
                l.add(arr1[i]);
            }
            i++;
        } else {
            if (l.isEmpty() || l.get(l.size() - 1) != arr2[j]) {
                l.add(arr2[j]);
            }
            j++;
        }
    }

    while (i < n) {
        if (l.isEmpty() || l.get(l.size() - 1) != arr1[i]) {
            l.add(arr1[i]);
        }
        i++;
    }

    while (j < m) {
        if (l.isEmpty() || l.get(l.size() - 1) != arr2[j]) {
            l.add(arr2[j]);
        }
        j++;
    }

    return l;
    }
}