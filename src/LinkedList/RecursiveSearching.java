package LinkedList;

//Recursive Java program to search
public class RecursiveSearching {
    public static Node1 RSearching(Node1 head,int key) {
        if(head==null) {
            System.out.println("not found ");
            return head;
        }
        if(head.value==key) {
            System.out.println("found ");
            return head;
        }
        return RSearching(head.next,key);
    }

    public static void main(String[] args) {
        Node1 head=new Node1(2);
        head.next=new Node1(3);
        head.next.next=new Node1(5);
        head.next.next.next =new Node1(6);
        head.next.next.next.next =new Node1(7);
        RSearching(head,8);

    }

}
