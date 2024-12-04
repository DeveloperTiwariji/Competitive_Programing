import java.util.*;

public class MergeTwoSorgedList{
    public static void main(String[] args){

        //Here make List Yourself it is easy part======
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode();
        merge.next = null;
        merge.val =0;
        ListNode ans = merge;
        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                merge.next =list2;
                merge = merge.next;
                list2 = list2.next;
            }else{
                merge.next = list1;
                merge = merge.next;
                list1 = list1.next;
            }
        }
        if(list1==null){
            merge.next =list2;
        }else{
            merge.next = list1;
        }
        return ans.next;
    }
}