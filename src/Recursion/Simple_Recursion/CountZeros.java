package Recursion.Simple_Recursion;

public class CountZeros {
    public static int countZeros(int num,int count){
        if(num == 0){
            return count;
        }
        return num%10 == 0?countZeros(num/10,++count):countZeros(num/10,count);
    }
    public static void main(String[] args) {
        int num = 30204;
        System.out.println(countZeros(num,0));
    }
}
