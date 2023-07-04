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
        // if(headA == null || headB == null){
        //     return null;
        // }

        ListNode node = new ListNode(0);

        while(headA != null){
            ListNode node1 = headB;
            while(node1 != null){
                if(headA == node1){
                    node = headA;
                    return node;
                }
                node1 = node1.next;
            }
            // if(headB.next != null){
            //     headB = headB.next;
            // }
            headA = headA.next;
        }
        return node.next;
    }
}