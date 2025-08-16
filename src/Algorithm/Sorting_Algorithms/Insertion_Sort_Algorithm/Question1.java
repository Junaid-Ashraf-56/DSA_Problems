package Algorithm.Insertion_Sort_Algorithm;

import java.util.Arrays;

//Question1: Insertion sort algorithm simple?
public class Question1 {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        insertion(nums);
    }
}
