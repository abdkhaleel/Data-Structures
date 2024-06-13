package Queue;

public class Queue {
    int size = 5;
    int items[] = new int[size];
    int front, rear;

    public Queue(){
        front = -1;
        rear = -1;
    }
    boolean isFull(){
        return rear == size-1;
    }
    boolean isEmpty(){
        return front == -1;
    }
     void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1)
            front = 0;
        rear++;
        items[rear] = element;
     }
     int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = items[front];
        if(front > rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        return element;
    }
     void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue elements are: ");
        for(int i = front; i <= rear; i++){
            System.out.print(items[i] + " ");
        }
        System.err.println();
    }
     public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(11);
        queue.enqueue(20);
        queue.enqueue(4);
        queue.display();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.display();
     }

}
