/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        if(head == null || head.next == null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                isCycle = true;
                break;
            }
        }
        if(isCycle == false){
            return null;
        }else{
            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}