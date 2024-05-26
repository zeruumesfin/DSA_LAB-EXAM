import java.util.Stack;
public class q5 {
   

public class stack {
    int[] array;
    int top;
    int maxsize;

    public stack(int size) {
       array = new int[size];
       top = -1;
       maxsize = size;
    }

    public boolean isEmpty() {
        return top == 0;
        }
        public boolean isFull() {
        return top == array.length;
        }

    void push(int value) {
        if(isFull()) {
            System.out.println("Full");
            return;
        }
        array[++top] = value;

    }

    public int peek() {
        if(top >= 0) {
            return array[maxsize-1];
            }
            return -1;
    }
public static void main(String[] args) {
        stack stack = new stack(3);

        stack.push(5);
        stack.push(4);
        stack.push(6);

        System.out.println(stack.peek());



        
    }
}

}
