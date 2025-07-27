package Alogrithm.Linear_Search;

//Question 3:Find the minimum number
//Question 3.1:Search in 2D array
public class Question3 {
    public static int min(int[] nums){
        int min = nums[0];
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
    public static int min2D(int[][]array){
        int min = array[0][0];
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {9,8,-4,2,0,1,8};
        int[][] array = {{5,2,3},{6,8,9},{-1,5,6}};
        System.out.println("In 2D array "+min2D(array));
        System.out.println("In array "+min(nums));
    }
}
