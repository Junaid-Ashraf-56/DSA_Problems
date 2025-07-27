package Alogrithm.Linear_Search;

//Question 2: find the target within a range
//Question 2.1: find the target in 2D array
public class Question2 {
    public static int linear(int[] nums,int target,int start,int end){
        for (int i = start; i <= end ; i++) {
            if (nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int linear1(int[][] array,int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]==target){
                    return array[i][j];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 6;
        int start = 2;
        int end = 7;
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("In 2D array "+linear1(array,target));
        System.out.println("In simple array "+linear(nums,target,start,end));
    }
}
