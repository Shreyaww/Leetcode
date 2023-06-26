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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ls = new ListNode(0);
        ListNode ls3 = ls;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                ls3.next = list2;
                list2 = list2.next;
            }
            else{
                ls3.next = list1;
                list1 = list1.next;
            }
            ls3 = ls3.next;
        }

        if(list1 == null){
            ls3.next = list2;
        }
        else{
            ls3.next = list1;
        }

        return ls.next;
    }
}