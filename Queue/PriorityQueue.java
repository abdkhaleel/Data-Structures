package Queue;
import java.util. ArrayList;
public class PriorityQueue {
    void heapify(ArrayList<Integer> hf, int i){
        int size = hf.size();
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < size && hf.get(left) > hf.get(largest)){
            largest = left;
        }
        if(right < size && hf.get(right) > hf.get(largest)){
            largest = right;
        }
        if(largest != i){
            int temp = hf.get(i);
            hf.set(i, hf.get(largest));
            hf.set(largest, temp);
            heapify(hf, largest);
        }
    }
    void insert(ArrayList<Integer> hf, int num){
        int size = hf.size();
        if(size == 0){
            hf.add(num);
            return;
        }
        hf.add(num);
        for(int i = size/2 -1; i>=0; i--){
            heapify(hf, i);
        }

    }
    void delete(ArrayList<Integer> hf, int num){
        int size = hf.size();
        int i;
        for(i = 0; i < size; i++){
            if(hf.get(i) == num){
                break;
            }
        }  
        int temp = hf.get(i);
        hf.set(i, hf.get(size-1));
        hf.set(size-1, temp);

        hf.remove(size-1);
        for(int j = size/2 -1; j >= 0; j--){
            heapify(hf, j);
        }
    }
    void printArray(ArrayList<Integer> array, int size){
        System.out.println("Elements are: ");
        for(Integer i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        ArrayList<Integer> hf = new ArrayList<>();
        pq.insert(hf, 10);
        pq.insert(hf, 20);
        pq.insert(hf, 30);
        pq.insert(hf, 40);
        pq.insert(hf, 50);
        pq.insert(hf, 60);
        pq.insert(hf, 70);
        pq.insert(hf, 80);
        pq.insert(hf, 90);
        pq.insert(hf, 100);
        pq.printArray(hf, hf.size());
        pq.delete(hf, 10);
        pq.printArray(hf, hf.size());
        pq.delete(hf, 20);
        pq.printArray(hf, hf.size());
    }
}
