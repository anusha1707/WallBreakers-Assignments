/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newnode = null;
        ListNode present = head;
        while(present!= null)
        {
            ListNode nextnode = present.next;
            present.next = newnode;
            newnode = present;
            present = nextnode;
        }
        return newnode;
    }
}