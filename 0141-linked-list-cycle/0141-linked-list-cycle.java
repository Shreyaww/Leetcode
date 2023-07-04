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
    public boolean hasCycle(ListNode node) {
        //Optimal -
        if(node == null || node.next == null){
            return false;
        }
        
        ListNode slow = node;
        ListNode fast = node;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return true;
            }
        }

        return false;
        //Brute Force 1 - 
        // HashSet<ListNode> set = new HashSet<>();

        // while(node != null){
        //     set.add(node);
        //     node = node.next;
        //     if(set.contains(node)){
        //         return true;
        //     }
        // }
        // return false;
    }
}