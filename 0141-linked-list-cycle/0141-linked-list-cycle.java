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
        HashSet<ListNode> set = new HashSet<>();

        while(node != null){
            set.add(node);
            node = node.next;
            if(set.contains(node)){
                return true;
            }
        }
        return false;
    }
}