package Stack.Lab.Activity;
//Implement a Stack in Array, use class in the implementation so that Stack can be treated as an object
//and its operations as public interface for the user.
class Static_Stack {
    private final int size;
    private final int[] arr;
    private int top;

    Static_Stack(){
        size = 5;
        arr = new int[size];
        top = 0;
    }

    void push(int value){
        if (isFull()){
            System.out.println("Array is Full");
            return;
        }

        arr[top++] = value;
    }

    void pop(){
        if (isEmpty()){
            System.out.println("Array is Empty");
            return;
        }

        System.out.println("Top value is: "+arr[--top]);
    }

    void display(){
        for (int i = top-1; i >= 0 ; i--) {
            System.out.println(arr[i]);
        }
    }

    boolean isFull(){
        return top == size;
    }
    boolean isEmpty(){
        return top == 0;
    }
}
public class Activity1 {
    public static void main(String[] args) {
        Static_Stack stack = new Static_Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();
    }
}
