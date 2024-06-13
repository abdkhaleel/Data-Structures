package Queue;
public class CircularQueue{
    int size = 5;
    int front, rear;
    int items[] = new int[size];
    CircularQueue(){
        front = -1;
        rear = -1;
    }
    boolean isFull(){
        return (front == 0 && rear == size-1) || (front == rear+1);
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
        rear = (rear+1)%size;
        items[rear] = element; 
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = items[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front+1)%size;
        }
        return element;


    }
    void  display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Queue Elements: ");
        for(int i = front; i != rear; i = (i+1)%size){
            System.out.print(items[i] + " ");
        }
        System.out.println(items[rear]);
    }
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
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
        queue.enqueue(9);
        queue.display();
        queue.enqueue(55);
        queue.display();
    }
}