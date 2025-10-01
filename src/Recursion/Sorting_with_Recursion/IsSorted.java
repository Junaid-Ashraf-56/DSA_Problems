package Recursion.Sorting_with_Recursion;

public class IsSorted {
    public static int isSorted(int[] a,int index){
        if (a.length==1 || index==1){
            return 1;
        }
        if (a[index - 1] < a[index - 2]) {
            return 0;
        }
        return isSorted(a, index - 1);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(a,a.length));
    }
}
