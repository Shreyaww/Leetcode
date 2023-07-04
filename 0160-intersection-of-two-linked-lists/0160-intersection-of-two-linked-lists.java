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
        //Optimal - 
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;
        int countA = 0, countB = 0;

        while(dummy1 != null){
            countA++;
            dummy1 = dummy1.next;
        }
        // System.out.println(countA);

        while(dummy2 != null){
            countB++;
            dummy2 = dummy2.next;
        }
        // System.out.println(countB);
        int diff = Math.abs(countA - countB);
        // System.out.println(diff);
        dummy1 = headA;
        dummy2 = headB;

        if(countA > countB){
            while(diff != 0){
                dummy1 = dummy1.next;
                diff--;
            }
        }
        else if(countB > countA){
            while(diff != 0){
                dummy2 = dummy2.next;
                diff--;
            }
        }
        
        while(dummy1 != null || dummy2 != null){
            if(dummy1 == dummy2){
                return dummy1;
            }
            dummy1 = dummy1.next;
            dummy2 = dummy2.next;
        }
        
        return null;

        //Better - 
        // HashSet<ListNode> ls = new HashSet<>();

        // while(headA != null){
        //     ls.add(headA);
        //     headA = headA.next;
        // }
        // while(headB != null){
        //     if(ls.contains(headB)){
        //         return headB;
        //     }
        //     headB = headB.next;
        // }
        // return null;

        //Brute Force - 
        // while(headA != null){
        //     ListNode node1 = headB;
        //     while(node1 != null){
        //         if(headA == node1){
        //             return headA;
        //         }
        //         node1 = node1.next;
        //     }
        //     headA = headA.next;
        // }
        // return null;
    }
}