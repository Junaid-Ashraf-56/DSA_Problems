package Stack;

public class CustomStackMain {
    public static void main(String[] args) throws StackException {

        System.out.println("Custom stack implementation statically");
        CustomStackStatic customStack = new CustomStackStatic();

        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);

        System.out.println(customStack.peek());

        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());


        System.out.println("Custom stack implementation dynamically");
        CustomStackDynamic customStackDynamic = new CustomStackDynamic();

        customStackDynamic.push(1);
        customStackDynamic.push(2);
        customStackDynamic.push(3);
        customStackDynamic.push(4);
        customStackDynamic.push(5);


        System.out.println(customStackDynamic.pop());
        System.out.println(customStackDynamic.pop());
        System.out.println(customStackDynamic.pop());
        System.out.println(customStackDynamic.pop());
        System.out.println(customStackDynamic.pop());

    }
}
