/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        //================================first approch========
        // ListNode temp = head;
        // int count =0;
        // while(temp.next!=null){
        //     count++;
        //     temp = temp.next;
        // }

        // int mid = count/2;
        // ListNode t = head;
        // for(int i=0;i<mid;i++){
        //    t = t.next;
        // }

        // if(count%2!=0) return t.next;

        // return t;

        //==================================second approch=======
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}