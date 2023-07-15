package TwoPointer.LinkedList;

public class PrintList {
    public static void printListWithForwardArrow(Node head)
    {
        while (head!=null)
        {
            System.out.print(head.data+"->");
            head=head.next;
        }

    }
}
