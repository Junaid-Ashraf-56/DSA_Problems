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


class Check_Parenthesis{
    Dynamic_Stack dynamicStack = new Dynamic_Stack();

    private boolean balance(char inStack,char outOfStack){
        return(
                (inStack=='{'&&outOfStack=='}')||
                        (inStack=='['&&outOfStack==']')||
                        (inStack=='('&&outOfStack==')')
        );
    }
    void check(String para){
        for (int i = 0; i < para.length(); i++) {
            char a = para.charAt(i);
            if (a=='{'|| a=='['|| a=='(')
            {
                dynamicStack.push(a);
            } else {
                if (a=='}'|| a==']'|| a==')'){
                    if (!balance(dynamicStack.pop(),a)){
                        System.out.println("Not Balanced Parenthesis");
                        return;
                    }
                }
            }
        }
        if (dynamicStack.isEmpty()){
            System.out.println("Balanced Parenthesis");
        }else {
            System.out.println("Not Balanced Parenthesis");
        }
    }
}
public class Task1 {
    public static void main(String[] args) {
        Check_Parenthesis checkParenthesis = new Check_Parenthesis();
        String para = "{[[()]]}";
        checkParenthesis.check(para);
    }
}
