package Recursion;

import java.util.ArrayList;

//Question 7: Linear Search
//Question 7.1 : Linear Search give indexes in ArrayList  while arraylist in the function body and don't take the argument
public class Question7 {
    public static boolean linearSearch(int[] array,int target,int index){
       if (index>=array.length-1){
            return false;
        }
        return array[index]==target||linearSearch(array,target,index+1);
    }

    //if you want index from the linear search target
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static ArrayList<Integer> linearSearchArray(int[] array,int target,int index){
        if (index>=array.length-1){
            return arrayList;
        } else if (array[index]==target) {
            arrayList.add(index);
        }
        return linearSearchArray(array,target,index+1);
    }

    //Question 7.1:
    public static ArrayList<Integer> findIndex(int[] array,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index>=array.length-1){
            return list;
        } else if (array[index]==target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow =  findIndex(array,target,index+1);
        list.addAll(ansFromBelow);

        return list;
    }
    public static void main(String[] args) {
        int[] array = {1,5,8,9,4,4,6,7};
        int target = 4;
        System.out.println(linearSearch(array,target,0));
        System.out.println(linearSearchArray(array,target,0));
        System.out.println(findIndex(array,target,0));
    }
}
