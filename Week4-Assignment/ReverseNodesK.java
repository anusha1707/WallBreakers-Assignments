/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int count = 0;
        //traverse through the list till k+1 th element 
        while(cur != null && count != k )
        {
            cur = cur.next;
            count ++;
        }
        // now the rest is our question again i.e k+1 to end 
        if(count == k)
        {
            //apply recursion 
            cur = reverseKGroup(cur, k);
            //reverse the elements in the current group 
            while(count > 0)
            {
                ListNode temp = head.next;
                head.next = cur;
                cur = head;
                head = temp;
                count --;
            }
           head = cur;
        }
        return head;
    }
}