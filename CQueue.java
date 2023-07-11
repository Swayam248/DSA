import java.util.Scanner;
class Cqu{
    static Scanner scan = new Scanner(System.in);
    int rear=-1;
    int front=-1;
    int size;
    int Q[];
    Cqu(int s){
        size=s;
        Q=new int[s];
    }

    boolean isFull(){
        if((((rear+1)%size)==front)){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isEmpty(){
        if((rear==-1 && front==-1) || (rear==front)){
            return true;
        }
        else{
            return false;
        }
    }

    void enqueue(){
        if(isFull()){
            System.out.println("Queue Overflow");
        }
        else{
            if(front==-1){
                front++;
            }
            rear++;
            System.out.println("enter the element");
            Q[rear]= scan.nextInt();
        }
    }

    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue underflow");
        }
        else{
            System.out.println("Dequeued element= "+ Q[front]);
            front++;
        }
    }
    void display(){
        for(int i= front; front<(rear+1); i=((i+1)%size)){
            System.out.println("Displaying------ " +Q[i]);
        }
    }
}
public class CQueue {
    public static void main(String[] args){
        Cqu ab= new Cqu(5);
        ab.enqueue();
        ab.enqueue();
        ab.enqueue();
        ab.enqueue();
        ab.dequeue();
        ab.dequeue();
        ab.display();
    }
    
}
