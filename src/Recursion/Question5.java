package Recursion;

//Question 5 :  Zeros in a number
public class Question5 {
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    public static int helper(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }

        return helper(num-1,steps+1);
    }

    public static void main(String[] args) {
        int nums = 14;
        System.out.println(numberOfSteps(nums));
    }
}
