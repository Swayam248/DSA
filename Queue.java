import java.util.Scanner;
class QueueIn{
     Scanner scan=new Scanner(System.in);
    int front=-1;
    int rear=-1;
    int size;
    int Q[];
    QueueIn(int s){
        size=s;
        Q = new int[s];
    }

    boolean isFull(){
        if(rear == size-1){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isEmpty(){
        if(front==-1 && rear ==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(){
        if (isFull()){
            System.out.println("Queue overflow");
        }
        else{
            if(front==-1){
                front++;
            }
            System.out.println("enter the element");
            rear++;
            Q[rear]=scan.nextInt();
        } 
    }
    void dequeue(){
        if (isEmpty()){
            System.out.println("Queue underflow");
        }
        else{          
            System.out.println("dequeued element = "+ Q[front]);
            front++;
        }
    }

    void display(){
        for(int i= 0;i<size; i++){
            System.out.println("Displaying ="+ Q[i]);
        }
    }
}
public class Queue {
    public static void main(String[] args){
        QueueIn ab= new QueueIn(5);
        ab.enqueue();
        ab.enqueue();
        ab.enqueue();
        ab.dequeue();
        ab.dequeue();
        ab.display();

    }
}
