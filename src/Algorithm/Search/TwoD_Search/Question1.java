package Algorithm.Search.TwoD_Search;

import java.util.Arrays;

public class Question1 {
    //Question1 : Search in 2D matrix(sorted in row and column wise manner)
    public static void main(String[] args){
        int[][] nums = {{1,3}};
        int target = 3;
        System.out.print(Arrays.toString(search(nums,target)));
    }
    static int[] search(int[][] nums,int target){
        int r = 0;
        int c = nums[0].length-1;
        while (r < nums.length && c >=0) {
            if (nums[r][c] == target){
                return new int[]{r,c};
            } else if (nums[r][c] < target) {
               r++;
            }else {
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}