package Algorithm.Binary_Search;

import java.util.Arrays;

//Question 7: Search in 2D array
public class Question7 {
    public static int[] search(int[][] array,int target){
        int row =0;
        int column = array[0].length-1;
        while (row<array.length&&column>=0){
            if (array[row][column]==target){
                return new int[]{row,column};
            }
            if (target < array[row][column]){
                column--;
            }else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] array = {{10,20,30,40},
                         {15,25,35,45},
                         {28,29,37,49},
                         {33,34,38,50}};
        int target = 49;
        System.out.println(Arrays.toString(search(array, target)));
    }
}
