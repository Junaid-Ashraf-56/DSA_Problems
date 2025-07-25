package Recursion;

//Question 4 : Reverse a Number
//Question 4.1 : Check function is palindrome or not
public class Question4 {
    //One way to do it
    static int sum = 0;
    public static void reverse(int n){
        if (n==0){
            return ;
        }
        int rem = n%10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }


    // Other way
    public static int reverse1(int n){
        int digit = (int)(Math.log10(n)) + 1;
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digit-1)) + helper(n/10,digit-1);
    }


    //Palindrome
    public static boolean checkPalindrome(int n){
        return reverse1(n) == n;
    }

    public static void main(String[] args) {
       reverse(1234);
       System.out.println(sum);
       System.out.println();
       System.out.println(reverse1(1234));
       System.out.println(checkPalindrome(1221));
    }

}
