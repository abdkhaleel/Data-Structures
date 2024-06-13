package Queue;

public class Deque {
    static final int MAX = 100;
    int arr[];
    int front, rear;
    int size;
    public Deque(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        arr = new int[MAX];
    }
    public boolean isFull(){
        return (front == 0 && rear == size-1) || (front == rear+1);
    }
    boolean isEmpty(){
        return front == -1;
    }
    void insertfront(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
            rear = 0;
        }
        else if(front == 0){
            front = size-1;
        }
        else{
            front--;
        }
        arr[front] = element;
    }
    void insertrear(int element){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            rear = 0;
            front = 0;
        }
        else if(rear == size-1){
            rear = 0;
        }
        else{
            rear++;
        }
        arr[rear] = element;
    }
    int deletefront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else if(front == size-1){
            front = 0;
        }
        else{
            front++;
        }
        return element;
    }
    int deleterear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element = arr[rear];
        if(rear == front){
            front = -1;
            rear = -1;
        }
        else if(rear == 0){
            rear = size-1;
        }
        else{
            rear--;
        }
        return element;

    }
    int getrear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[rear];
    }
    int getfront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public static void main(String[] args) {
        Deque deque = new Deque(5);
        deque.insertfront(10);
        deque.insertfront(20);
        deque.insertfront(30);
        deque.insertrear(40);
        deque.insertrear(50);
        // deque.insertrear(60);
        System.out.println("Front: " + deque.getfront());
        System.out.println("Rear: " + deque.getrear());
        System.out.println("Delete Front: " + deque.deletefront());
        System.out.println("Front: " + deque.getfront());
        System.out.println("Delete Rear: " + deque.deleterear());
        System.out.println("Rear: " + deque.getrear());
    }

}
