package LinkedList;
//Insertion at the end -->
public class SLL4 {
    public static Node1 IAL(Node1 head ,int val) {
        Node1 newNode= new Node1(val);
        if (head == null) {
            return newNode;
        }
        Node1 last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return head;
    }

    public static void PL(Node1 list) {

        if(list==null ) {

            System.out.println("list is null");
            return;
        }
        System.out.println("Printing list ");
        Node1 ptr=list;

        while(ptr!=null) {
            System.out.print(ptr.value+"  ");
            ptr=ptr.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        Node1 head=new Node1(2);
        head.next=new Node1(3);
        head.next.next=new Node1(5);
        head.next.next.next =new Node1(6);
        PL(head);
        head=IAL(head,9);
        PL(head);
    }
}
