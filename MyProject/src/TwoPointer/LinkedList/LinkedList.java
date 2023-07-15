package TwoPointer.LinkedList;

public class LinkedList<T> {
    private Node head;

    public LinkedList()
    {
       this.head=null;
    }
    public void insertNodeAtHead(Node node)
    {
        if(head==null)
        {
            head=node;
        } else {
            node.next = head;
            head = node;
        }
    }
    public void createLinkedList(int[] lst)
    {
        for (int i = lst.length - 1; i >= 0; i--) {
            Node newNode = new Node(lst[i]);
            insertNodeAtHead(newNode);
        }
    }
}
