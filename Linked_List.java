import java.util.Scanner;

class Node{
    int data;
    Node next;
}
class LL{
    static Scanner scan = new Scanner(System.in);
    static Node Start;
    void create(){
        System.out.println("Enter the element");
        Node a = new Node();
        a.data= scan.nextInt();
        a.next=null;
        Start = a;
        System.out.println("Enter one more? 1- Yes ");
        int op= scan.nextInt();
        while(op==1){
            System.out.println("Enter the element");
            Node b= new Node();
            b.data=scan.nextInt();
            b.next=null;
            a.next=b;
            a=b;
            System.out.println("Enter one more? 1- Yes ");
            op= scan.nextInt();
        }
    }
    void InsertBeg(){
        System.out.println("Enter the element");
        Node x=new Node();
        x.data=scan.nextInt();
        x.next=Start;
        Start=x;
    }
    void InsertEnd(){
        System.out.println("Enter the element");
        Node x=new Node();
        x.data=scan.nextInt();
        x.next=null;
        Node temp=Start;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=x;
    }

    void InsertPos(){
        Node temp = Start;
        System.out.println("Enter the position");
        int pos = scan.nextInt();
        for(int i=1; i<(pos-1);i++ ){
            temp=temp.next;
        }
        System.out.println("Enter the element");
        Node x=new Node();
        x.data=scan.nextInt();
        x.next=temp.next;
        temp.next=x;
    }

    void DelBeg(){
        Start=Start.next;
    }
    
    void DelEnd(){
        Node temp=Start;
        while(temp.next.next!=null){
            temp.next=null;
        }
        temp.next=null;
    }

    void DelPos(){
        Node temp = Start;
        System.out.println("Enter the position");
        int pos = scan.nextInt();
        for(int i= 1; i<(pos-1); i++){
            temp=temp.next;
        }
       temp.next=temp.next.next;

    }

    void DelVal(){
        Node temp = Start;
        System.out.println("Enter the value");
        int val = scan.nextInt();
        while(temp.next.data!=val){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    void Display(){
        Node temp=Start;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Linked_List {
    public static void main(String[] args){
        while(true){
            LL ab= new LL();
            Scanner scan1=new Scanner(System.in);
            System.out.println("1 to create \n2 to Insert at beginning \n3 to Insert at given position \n4 to Insert at end \n5 to Delete from beginning \n6 to delete from given position \n7 delete from end \n8 to Display \n9 to Delete value \n10 to exit");
            int ch= scan1.nextInt();
            switch(ch){
                case 1:
                    ab.create();
                    break;
                case 2:
                    ab.InsertBeg();
                    break;
                case 3:
                    ab.InsertPos();
                    break;
                case 4:
                    ab.InsertEnd();
                    break;
                case 5:
                    ab.DelBeg();
                    break;
                case 6:
                    ab.DelPos();
                    break;
                case 7:
                    ab.DelEnd();
                    break;
                case 8:
                    ab.Display();
                    break;
                case 9:
                    ab.DelVal();
                    break;
                case 10:
                    System.exit(0);
                    break;
            }
        }
    }
    
}
