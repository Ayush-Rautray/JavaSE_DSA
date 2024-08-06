package LinkedList;

public class RecursiveReverse {
    static Node1 RReverse(Node1 head) {
        if (head == null || head.next == null)
            return head;
        Node1 rest = RReverse(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }
    public static void pL(Node1 node) {
        while (node != null) {
            System.out.print(" " + node.value);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node1 head=new Node1(2);
        head.next=new Node1(3);
        head.next.next=new Node1(5);
        head.next.next.next =new Node1(6);
        head.next.next.next.next =new Node1(7);
        pL(head);
        head= RReverse(head);
        pL(head);

    }

}


