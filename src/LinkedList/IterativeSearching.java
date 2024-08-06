package LinkedList;

//Iterative Java program to search
public class IterativeSearching {
    public static boolean Isearching(Node1 head,int key) {
        Node1 check=head;
        int i=1;
        if(head==null) {
            System.out.println("head null");
            return false;
        }
        while(check!=null) {
            if(check.value==key) {
                System.out.println("Value "+check.value+ " found at index "+i);
                return true ;
            }
            i++;
            check=check.next;
        }System.out.println("not found");
        return false;
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
        head.next.next.next.next =new Node1(7);
        PL(head);
        Isearching(head,7);
    }
}
