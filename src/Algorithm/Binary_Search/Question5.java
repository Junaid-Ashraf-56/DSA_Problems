package Algorithm.Binary_Search;

//Question 5:Find the target element in the array while the array is of infinite length ?
public class Question5 {
    public static int binary(int[] array,int target,int start,int end){
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target>array[mid]){
                start = mid+1;
            }else if(target<array[mid]){
                end = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int findingRange(int[] array,int target){
        int start = 0;
        int end = 1;

        while (target>array[end]){
            int temp = end+2;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return binary(array,target,start,end);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,7,8,9,10,20,30,40,50,60,70,80,90};
        int target = 20;
        System.out.println(findingRange(array,target));
    }
}


