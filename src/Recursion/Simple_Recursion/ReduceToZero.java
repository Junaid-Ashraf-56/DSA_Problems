package Recursion.Simple_Recursion;

public class ReduceToZero {
    public static int reduce(int num,int steps){
        if (num == 0){
            return steps;
        }
        return num%2 == 0? reduce(num/2,++steps):reduce(num-1,++steps);
    }
    public static void main(String[] args) {
        int num = 14;
        System.out.println(reduce(num,0));
    }
}
