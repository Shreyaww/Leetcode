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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode ls = dummy;

        while(ls.next != null){
            if(ls.next.val == val){
                ls.next = ls.next.next;
            }
            else{
                ls = ls.next;
            }
        }

        return dummy.next;
    }
}