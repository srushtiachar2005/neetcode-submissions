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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null) return head2;
        if(head2==null) return head1;

        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode dummyNode=new ListNode(0);
        ListNode head3=dummyNode;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                head3.next=temp1;
                temp1=temp1.next;
            }
            else{
                head3.next=temp2;
                temp2=temp2.next;
            }
            head3=head3.next;
        }
        if(temp1!=null)
        {
            head3.next=temp1;
        }else{
            head3.next=temp2;
        }
        return dummyNode.next;
    }
}