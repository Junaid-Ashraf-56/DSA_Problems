package Recursion;

//Question 6: Sorting with the help of Recursion
public class Question6 {
    //One way
    public static boolean sortedArray(int[] array){
        int i = 0;
        int j = 0;
        return helper1(array,i,j);
    }
    public static boolean helper1(int[] array,int i,int j){
        if (j==array.length-1||i==array.length-1){
            return true;
        }
        if (array[i]<array[j+1]){
            return helper1(array,i+1,j+1);
        }else {
            return false;
        }
    }
    //other way
    public static boolean sorted(int[] array,int index){
        if (index==array.length-1){
            return true;
        }
        return array[index]<array[index+1]&&sorted(array,index+1);
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7,9};
        int[] array1 = {1};
        System.out.println("Ans "+ sortedArray(array));
        System.out.println("Ans "+sorted(array,0));
        System.out.println("Ans "+sortedArray(array1));
    }
}
