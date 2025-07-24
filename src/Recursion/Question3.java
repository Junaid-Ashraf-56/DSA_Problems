package Recursion;

//Question 4: Sum of n Numbers
// Question 4.1 :Sum of digits
public class Question3 {
    public static int Sum(int n){
        if (n==1){
            return 1;
        }
        return n + Sum(n-1);
    }

    public static int sumOfDigits(int n){
        if (n<1){
            return 0;
        }
        int rem = n%10;
        return  rem + sumOfDigits (n/10);
    }
    public static void main(String[] args) {
        System.out.println(Sum(5));
          System.out.println(sumOfDigits(1432));
    }
}
