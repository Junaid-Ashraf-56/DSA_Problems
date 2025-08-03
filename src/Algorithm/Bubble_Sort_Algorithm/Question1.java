package Algorithm.Bubble_Sort_Algorithm;

import java.util.Arrays;

public class Question1 {
    public static int[] bubbleSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j]  = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}
