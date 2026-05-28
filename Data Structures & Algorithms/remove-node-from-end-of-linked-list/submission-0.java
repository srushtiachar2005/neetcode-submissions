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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        int targetCount=count-n;
        if(targetCount==0)
        {
            return head.next;
        }
        temp=head;
        int currentIndex=0;

        while(currentIndex<targetCount-1)
        {
            temp=temp.next;
            currentIndex++;
        }
        temp.next=temp.next.next;
        return head;

    }
}
