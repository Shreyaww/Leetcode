/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null){
            ListNode node1 = headB;
            while(node1 != null){
                if(headA == node1){
                    return headA;
                }
                node1 = node1.next;
            }
            headA = headA.next;
        }
        return null;
    }
}