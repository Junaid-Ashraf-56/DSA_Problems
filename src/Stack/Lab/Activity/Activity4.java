package Stack.Lab.Activity;

//Using the stack check that the given expression has balanced parenthesis or not.
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
public class Activity4 {
    public static void main(String[] args) {
        Check_Parenthesis checkParenthesis = new Check_Parenthesis();
        String para = "{[[()]]}";
        checkParenthesis.check(para);
    }
}
