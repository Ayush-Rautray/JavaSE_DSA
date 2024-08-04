package LinkedList;
//Inserting at a specific position
public class SLL3 {

    public static Node1 IASP(Node1 head,int pos,int val){
        if(head==null) {
            System.out.println("head is null");
            return head;
        }
        Node1 newNode= new Node1(val);
        Node1 ptr=head;
        if(pos==1) {

            newNode.next=head;
            head=newNode;
            return head;
        }

        for(int i=1;i< pos-1&&ptr!=null;i++) {
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next =newNode;
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
        // head=IASP(head,1,9);
        // PL(head);
        head=IASP(head,2,9);
        PL(head);
        head=IASP(head,9,9);
        PL(head);
    }
}
