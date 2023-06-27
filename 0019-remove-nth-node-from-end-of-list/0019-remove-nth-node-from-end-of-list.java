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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;
        int count = 0;

        while(prev != null){
            count++;
            prev = prev.next;
        }
    
        int pos = count - n;
        
        if(pos == 0){
            head = head.next;
        }
        else{
            ListNode prev1 = head;

            while(pos-1 != 0){
                prev1 = prev1.next;
                pos--;
            }
            prev1.next = prev1.next.next;
        }
        
        return head;
    }
}