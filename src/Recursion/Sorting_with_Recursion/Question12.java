package Recursion.Sorting_with_Recursion;

import java.util.Arrays;

//Question 12 : Selection sort in Recursion?
public class Question12 {
    public static void selection(int[] arr, int row, int column,int max){
        if(row==0){
            return;
        }
        if (column<row){
            if (arr[column]>arr[max]){
                selection(arr,row,column+1,column);
            }else {
                selection(arr,row,column+1,max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            selection(arr, row-1,0,0);
        }

    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
