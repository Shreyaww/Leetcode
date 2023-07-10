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
        HashSet<ListNode> ls = new HashSet<>();
        ListNode node = head;

        while(node != null){
            ls.add(node);
            node = node.next;

            if(ls.contains(node)){
                return node;
            }
        }
        return null;
    }
}