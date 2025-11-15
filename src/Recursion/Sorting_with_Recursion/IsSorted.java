package Recursion.Sorting_with_Recursion;

public class IsSorted {
    public static boolean isSorted(int[] a,int index){
        if(index == a.length) return true;
        if(a[index]<a[index-1])return false;
        return isSorted(a,index+1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(a,1));
    }
}
