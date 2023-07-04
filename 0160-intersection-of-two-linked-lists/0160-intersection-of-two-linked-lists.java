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
        //Optimal2 -
        if(headA == null || headB == null){
            return null;
        } 
        
        ListNode dummy1 = headA;
        ListNode dummy2 = headB;

        while(dummy1 != null || dummy2 != null){
            if(dummy1 == dummy2){
                return dummy1;
            }
            
            if(dummy1 == null){
                dummy1 = headB;
            }
            else{
                dummy1 = dummy1.next;
            }
            
            if(dummy2 == null){
                dummy2 = headA;
            }
            else{
                dummy2 = dummy2.next;
            }

        }
        return null;
        //Optimal1 - 
        // ListNode dummy1 = headA;
        // ListNode dummy2 = headB;
        // int countA = 0, countB = 0;

        // while(dummy1 != null){
        //     countA++;
        //     dummy1 = dummy1.next;
        // }
        // while(dummy2 != null){
        //     countB++;
        //     dummy2 = dummy2.next;
        // }

        // int diff = Math.abs(countA - countB);
        // dummy1 = headA;
        // dummy2 = headB;

        // if(countA > countB){
        //     while(diff != 0){
        //         dummy1 = dummy1.next;
        //         diff--;
        //     }
        // }
        // else{
        //     while(diff != 0){
        //         dummy2 = dummy2.next;
        //         diff--;
        //     }
        // }
        
        // while(dummy1 != null){
        //     if(dummy1 == dummy2){
        //         return dummy1;
        //     }
        //     dummy1 = dummy1.next;
        //     dummy2 = dummy2.next;
        // }
        
        // return null;

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