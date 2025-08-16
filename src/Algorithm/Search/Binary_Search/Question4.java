package Algorithm.Binary_Search;
//Question 4: Floor of a number?
public class Question4 {
    public static int floorOfNumber(int[] array,int target){
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (array[mid]==target){
                return mid;
            }else if (array[mid]<target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,8,9};
        int target = 7;
        System.out.println(floorOfNumber(array,target));
    }
}
