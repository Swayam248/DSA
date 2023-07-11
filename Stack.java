import java.util.Scanner;
class StackIn {
    static Scanner scan = new Scanner(System.in);
    int top=-1;
    int size;
    int Stk[];
    StackIn(int s){
        size = s;
        Stk=new int[s];
    }
    boolean isFull(){
        if (top == size-1){
            return true;
        }
        else{
            return false;
        }
    }

    boolean isEmpty(){
        if (top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void push(){
        if (isFull()){
            System.out.println("Stack Overflow");
        }
        else{
            System.out.println("Enter the element to push");
            top++;
            Stk[top]=scan.nextInt();
        }     
     }
     void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println("popped element = "+Stk[top]);
            top--;
        }
     }
     void display(){
        for(int i=0;i<size;i++){
            System.out.println("Displaying --- "+Stk[i]);
        }
     }
}
public class Stack{
    public static void main(String[] args){
        StackIn ab = new StackIn(6);
        ab.push();
        ab.push();
        ab.push();
        ab.push();
        ab.pop();
        ab.pop();
        ab.push();
        ab.push();
        ab.display();
    }
}
