package TwoPointer;

import TwoPointer.LinkedList.Node;

public class RemoveNthLastNode {
    public static Node removeNthLastNode(Node head, int n) {
         /*
        1->2->4->3->7->2
        s      f
         */

        Node dummy=new Node(-1);
        dummy.next=head;

        Node slow=dummy;
        Node fast = dummy;

        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;


        return dummy.next;
    }

}
