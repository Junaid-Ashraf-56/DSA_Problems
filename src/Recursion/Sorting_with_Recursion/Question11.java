package Recursion.Sorting_with_Recursion;

import java.util.Arrays;

//Question 11:Bubble sort in Recursion?
public class Question11 {
    public static void bubble(int[] arr,int row,int column){
        if(row==0){
            return;
        }
        if (column < row){
            if (arr[column]>arr[column+1]){
                int temp = arr[column];
                arr[column] = arr[column+1];
                arr[column+1] = temp;
            }
            bubble(arr, row, column+1);
        }else {
            bubble(arr,row-1,0);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
}
