package Recursion.Simple_Recursion;
public class Sum {
    public static int reverse_number(int number,int result){
        if (number==0){
            return result;
        }
        return reverse_number(number/10,result*10+(number%10));
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse_number(num,0));
    }
}