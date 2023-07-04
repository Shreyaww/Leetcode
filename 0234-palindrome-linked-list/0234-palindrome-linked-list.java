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
    public boolean isPalindrome(ListNode head) {
        List<Integer> ls = new ArrayList<>();

        while(head != null){
            ls.add(head.val);
            head = head.next;
        }

        System.out.println(ls);
        int i = 0, j = ls.size()-1;

        while(i < j){
            if(ls.get(i) == ls.get(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}