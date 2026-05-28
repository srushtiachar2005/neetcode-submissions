/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node curr=head;
        //Inserting the Node
        while(curr!=null)
        {
            Node nextNode=curr.next;
            Node copy=new Node(curr.val);
            curr.next=copy;
            copy.next=nextNode;
            curr=nextNode;
        }

        //Connect to the random Pointers

        curr=head;
        while(curr!=null){
            if(curr.random!=null)
            {
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }

        //Detach the List

        Node dummy=new Node(0);
        Node res=dummy;
        curr=head;
        while(curr!=null)
        {
            res.next=curr.next;
            res=res.next;
            curr.next=curr.next.next;
            curr=curr.next;
        }
        return dummy.next;
    }
}
