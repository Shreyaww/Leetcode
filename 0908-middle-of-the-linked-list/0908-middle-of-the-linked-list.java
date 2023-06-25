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
        int count = 0;
        ListNode countnode = head;
        ListNode current = head;

        while(countnode != null){
            countnode = countnode.next;
            count++;
        }

        for(int i = 0; i < count/2; i++){
            current = current.next;
        }
        
        return current;
    }
}