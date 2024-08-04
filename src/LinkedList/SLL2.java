package LinkedList;
//Insertion after a given pogition -->
//After given Pogition ;
class Node1{
    int value;
    Node1 next;

    Node1(int val){
        this.value =val;
        this.next=null;
    }
}
public class SLL2 {

    public static Node1 IAGP(Node1 head,int key,int val) {

        Node1 pointer1= head; //pointer will point on head


        if(head==null) {
            System.out.println("head is null ");
            return head;
        }
        //finding Key in the LinkedList

        while(pointer1.next!=null) {

            if(pointer1.value==key) {
                break;
            }
            pointer1=pointer1.next;
        }
        //Inserting new node
        Node1 newNode=new Node1(val);
        newNode.next=pointer1.next;
        pointer1.next=newNode;

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

        int key = 3, newData = 4;
        IAGP(head,key,newData);
        PL(head);
    }
}
