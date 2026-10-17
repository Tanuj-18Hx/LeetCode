/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val ;
        node.next = node.next.next ;
    }
}
//har baar deletion ka mtlb delete krna nhi hota hai hum bss
//aagey vaale ka data aur uske aagey vaale ke address ko join krenge 