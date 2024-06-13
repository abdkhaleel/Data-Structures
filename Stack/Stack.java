package Stack;

public class Stack{
    int arr[];
    int top;
    int capacity;
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public boolean isFull(){
        return top == capacity-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int size(){
        return top+1;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
    public void display(){
        System.err.println("Stack elements:");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(11);
        stack.push(12);
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.display();
        System.out.println("Size of the Stack: " + stack.size());
        System.out.println("Peek element is: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.display();


    }
}
