package LinkedList;
//Insertion at the beginning-->
class Node2 {
    int value;
    Node2 next;

    Node2(int new_data)
    {
        value = new_data;
        next = null;
    }
}

public class SLL1 {
    public static Node2 IAB(Node2 head,int newVal) {
        Node2 node=new Node2(newVal);
        node.next=head;
        return node;
    }
    //Printing LinkedList-->
    public  static void PL(Node2 list) {
        if(list== null) {
            System.out.println("List is null ");
            return;
        }
        else {
            Node2 curr=list;//curr is a pointer who is pointing to list only
            while(curr!=null) {
                System.out.print(curr.value+"  ");
                curr=curr.next;//means list.next;
                //list=list.next;
                //System.out.print(list .value+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node2 head = new Node2(2);
        head.next=new Node2(3);
        head.next.next=new Node2(4);
        head.next.next.next =new Node2(5);
        head.next.next.next.next =new Node2(6);

        PL(head);
        //int data=1;
        System.out.println("Insertion At the beginning ");
        head= IAB(head, 1);
        PL(head);
    }


}

