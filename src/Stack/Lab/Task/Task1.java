package Stack.Lab.Task;

//Write an application using Stack that checks whether the entered string of brackets is balanced, e.g.
//[{( )}] is Balanced while {[( )] } is not Balanced because the priority of the parenthesis is not maintained.

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
            return '\0';
        }

        return arr[--top];
    }

    char peek() {
        if (isEmpty()) return '\0';
        return arr[top - 1];
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


class Balance_Parenthesis{
    Dynamic_Stack dynamicStack = new Dynamic_Stack();

    private boolean balance(char inStack,char outOfStack){
        return(
                (inStack=='{'&&outOfStack=='}')||
                        (inStack=='['&&outOfStack==']')||
                        (inStack=='('&&outOfStack==')')
        );
    }
    private int getPriority(char ch) {
        return switch (ch) {
            case '[' -> 3; // Highest
            case '{' -> 2;
            case '(' -> 1; // Lowest
            default -> 0;
        };
    }
    void check(String para){
        for (int i = 0; i < para.length(); i++) {
            char ch = para.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                if (!dynamicStack.isEmpty() && getPriority(ch) > getPriority(dynamicStack.peek())) {
                    System.out.println("Invalid order at character '" + ch + "'");
                    return;
                }
                dynamicStack.push(ch);
            }else {
                if (ch=='}'|| ch==']'|| ch==')'){
                    char b = dynamicStack.pop();
                    if (!balance(b,ch)){
                        System.out.println("Not Balanced Parenthesis");
                        return;
                    }
                }
            }
        }
        if (dynamicStack.isEmpty()){
            System.out.println("Balanced Parenthesis In Correct Order");
        }else {
            System.out.println("Not Balanced Parenthesis");
        }
    }
}
public class Task1 {
    public static void main(String[] args) {
        Balance_Parenthesis checkParenthesis = new Balance_Parenthesis();
        String para = "{[()]}";
        checkParenthesis.check(para);
    }
}
