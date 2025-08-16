package Algorithm.Binary_Search;
//Question 3:Ceiling of a number ?
//Ceiling is the smallest number in the array which is greater than or equal to that number
public class Question3 {
    //This is the brute force that I do for myself I know it will make stackoverflow or array out of bound error
//    public static int ceiling(int[] array,int target){
//        int start = 0;
//        int end = array.length-1;
//        while (start<=end){
//            int mid = start+(end-start)/2;
//            if (array[mid]==target){
//                return mid;
//            }else if (array[mid]<target){
//                start = mid+1;
//            }else {
//                end = mid-1;
//            }
//        }
//        return ceiling(array,target+1);
//    }
    public static int ceiling(int[] array,int target){
        if(target>array[array.length-1]){
            return -1;
        }
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
        return start;
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,8,9};
        int target = 3;
        System.out.println(ceiling(array,target));
    }
}
