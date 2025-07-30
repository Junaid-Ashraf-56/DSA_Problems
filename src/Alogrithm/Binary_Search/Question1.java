package Alogrithm.Binary_Search;
//Question 1: Give the target element in an array with the help of binary search?
public class Question1 {
    public static int binary(int[] array,int target){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }else if (target>array[mid]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(binary(array,target));
    }
}
