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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode p = head ;
        ListNode t = head ;
        int count = 1 ;

        if (head == null || head.next == null || k ==0 ) return head ;

    
        while(p.next != null){
            p = p.next ;
            count++ ;
        }
        
        k %= count ;

        if(k == 0) return head ;

        p = head ;

        for(int i = 0 ; i < k ; i++) p=p.next ;

        while(p.next != null){
            p = p.next ;
            t = t.next ;
        }

        ListNode temp = t.next ;
        t.next = null ;
        p.next = head ;
        head = temp ;

        return head ;


    }
}