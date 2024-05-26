import java.util.Queue;

public class queue {
    
    int[] array;
    int front;
    int rear;
    int maxsize;
    int count;

    public queue(int size){
            array = new int[size];
            front = 0;
             rear = -1;
             maxsize = size;
             count = 0;

        }

    public boolean isEmpty() {
            return count == 0;
    }
    public boolean isFull() {
            return count == maxsize;
    }
        
    public int peek() {
            if (isEmpty()) {
               System.out.println("The Queue is Empty.");
            }
            return array[front];
    }
    public void enqueue(int value) {
            if(isFull()) {
                System.out.println("The Queue is Full");
                return;
            }
            array[++rear] = value;
            count++;
    }

    public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                }
                int frontValue = array[front++];
                if (front == maxsize) {
                front = 0; 
                }
                count--;
                return frontValue;
    }

    public static void main(String[] args) {
        queue queue = new queue(3);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();

        System.out.println(queue.peek());

        
        queue.enqueue(4);
       

        System.out.println(queue.peek());

        

        System.out.println(queue.peek());

    }


    
}


















