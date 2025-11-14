package Recursion;

//Question 1 Print all the number n to 1
//Question 1.1 Print all from 1 to n


/*Difference between n-- and --n
 * in n-- the program first pass the value and then decrement by which if we use it in recursion like return num(n--) it will never decrement
 * and give stack overflow error
 *
 * in --n the program first decrement and then pass th value by which it will pass correctly in this case*/


public class Question1 {
    public static int number(int n){
        if (n==1){
            return 1;
        }
        System.out.println(n);
        return number(n-1);
    }

    public static void numberRev(int n){
        if (n==0){
            return ;
        }
        numberRev(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(number(n));
        numberRev(n);
    }
}
