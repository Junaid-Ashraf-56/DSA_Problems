package Recursion;

//Question 7: Linear Search
public class Question7 {
    public static boolean linearSearch(int[] array,int target,int index){
       if (index>=array.length-1){
            return false;
        }
        return array[index]==target||linearSearch(array,target,index+1);
    }
    public static void main(String[] args) {
        int[] array = {1,5,8,9,4,6,7};
        int target = 4;
        System.out.println(linearSearch(array,target,0));
    }
}
