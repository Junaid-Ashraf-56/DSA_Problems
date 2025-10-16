package Stack.Lab.Activity;

//Implement Dynamic Stack.
class Dynamic_Stack{
    private int size;
    private char[] arr;
    private int top;

    Dynamic_Stack(){
        size = 5;
        arr = new char[size];
        top = 0;
    }

    void resize(){
        size = size*2;
        char[] temp = new char[size];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

    void push(char value){
        if (isFull()){
            resize();
        }

        arr[top++] = value;
    }

    char pop(){
        if (isEmpty()){
            System.out.println("Array is Empty");
            return '0';
        }

        return arr[--top];
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

//public class Activity2 {
//    public static void main(String[] args) {
//        Dynamic_Stack dynamicStack = new Dynamic_Stack();
//        dynamicStack.push(8);
//        dynamicStack.push(7);
//        dynamicStack.push(6);
//        dynamicStack.push(5);
//        dynamicStack.push(4);
//        dynamicStack.push(3);
//
//        dynamicStack.display();
//
//        dynamicStack.pop();
//        dynamicStack.pop();
//        dynamicStack.pop();
//        dynamicStack.pop();
//        dynamicStack.pop();
//
//        dynamicStack.display();
//    }
//}
