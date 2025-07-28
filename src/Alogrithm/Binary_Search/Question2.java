package Alogrithm.Binary_Search;

//Question 2:Order Agnostic binary search
public class Question2 {
    public static int binary1(int[] array,int target){
        int start = 0;
        int end = array.length-1;
        boolean isAsce = array[start]<array[end];
        while (start<=end){
            int mid = start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }
            if (isAsce) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array1 ={9,8,7,6,5,4,3,2,1};
        int target = 9;
        System.out.println("In Ascending "+binary1(array,target));
        System.out.println("IN Desc "+binary1(array1,target));
    }
}
