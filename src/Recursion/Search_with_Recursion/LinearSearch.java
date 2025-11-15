package Recursion.Search_with_Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    //This question just give you single true false whether the solution exist or not
    public static boolean linear(int[] nums, int target,int index ){
        if (nums.length == index) return false;
        if (nums[index] == target)return true;
        return linear(nums,target,index+1);
    }
    //This solution will tell every matched value on the index
    public static List<Integer> linear(int[] nums,int target,int index,List<Integer> ans){
        if (nums.length == index)return ans;
        if (nums[index]==target)ans.add(index);
        return linear(nums,target,index+1,ans);
    }
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int[] nums = {1,2,3,4,4,5,6,7,8,9};
        int target = 4;
        System.out.println(linear(nums,target,0,ans));
    }
}
