
import java.util.*;

public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
       ListNode slow = head;
       ListNode fast = head;
       while(fast.next!=null && fast.next.next!=null){
        slow = slow.next;
        fast = fast.next.next;
       }

       ListNode newNode = reverceLinkedList(slow.next);
       ListNode first = head;
       ListNode second = newNode;
       while(second!=null){
        if(first.val!=second.val){
            reverceLinkedList(newNode);
            return false;
        }
        first = first.next;
        second = second.next;
       }
       reverceLinkedList(newNode);
       return true;

    }
    public ListNode reverceLinkedList(ListNode node){
        if(node==null || node.next==null) return node;
        ListNode newNode = reverceLinkedList(node.next);
        ListNode n = node.next;
        n.next = node;
        node.next = null;
        return newNode;

    }
}