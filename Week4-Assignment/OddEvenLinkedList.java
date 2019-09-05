/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) 
            return null;
        ListNode first = head, second = head.next, temp = head.next;
        while(second!=null && second.next!=null  )
        {
            first.next = second.next;
            first = first.next;
            second.next = first.next;
            second = second.next;
        }
        first.next = temp;
        return head;
    }
}