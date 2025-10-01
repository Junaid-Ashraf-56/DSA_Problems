package Stack;

public class CustomStackStatic {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStackStatic(){
        this(DEFAULT_SIZE);
    }
    public CustomStackStatic(int size){
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr ==  -1;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot get value from a empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot get value from a empty stack");
        }
        return data[ptr];
    }
}
