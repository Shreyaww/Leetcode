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
        ListNode colliding = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                while(slow != colliding){
                    slow = slow.next;
                    colliding = colliding.next;
                }
                return slow;
            }
        }
        return null;
        
        // HashSet<ListNode> ls = new HashSet<>();
        // ListNode node = head;

        // while(node != null){
        //     ls.add(node);
        //     node = node.next;

        //     if(ls.contains(node)){
        //         return node;
        //     }
        // }
        // return null;
    }
}