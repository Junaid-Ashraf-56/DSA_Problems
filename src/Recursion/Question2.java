package Recursion;

//Question 2. Factorial of a number?
public class Question2 {
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }

        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
