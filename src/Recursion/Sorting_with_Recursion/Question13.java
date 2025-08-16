package Recursion;

import java.util.Arrays;

//Question 13:Merge Sort Algorithm?
public class Question13 {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(nums)));
    }
    public static int[] mergeSort(int[] nums){
        if (nums.length==1){
            return nums;
        }
        int mid = nums.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }
    public static int[] merge(int[] first,int[] second){
        int[] ans = new int[first.length+second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< first.length&&j< second.length){
            if (first[i]<second[j]){
                ans[k] = first[i];
                i++;
            }else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while(i< first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
