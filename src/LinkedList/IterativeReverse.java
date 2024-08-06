package LinkedList;


public class IterativeReverse {
    public static Node1 IReverse(Node1 head) {

        Node1 curr = head, prev = null, next;
       while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

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
        head= IReverse(head);
        pL(head);

    }

}
