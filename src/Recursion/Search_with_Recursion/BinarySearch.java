package Recursion.Search_with_Recursion;

public class BinarySearch {

    public static boolean binary(int[] array,int start,int end,int target){
        int mid = start+(end-start)/2;
        if (start>end){
            return false;
        }
        if(array[mid]==target){
            return true;
        } else if (array[mid] > target) {
            binary(array,0,mid-1,target);
        }else {
            binary(array,mid+1,end,target);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        System.out.println(binary(array,0,array.length-1,target));
    }
}
