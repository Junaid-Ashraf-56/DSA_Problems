package Algorithm.Search.TwoD_Search;

import java.util.Arrays;

//Question2:Search in perfect sorted matrix?
public class Question2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(matrix, 5)));
    }
    public static int[] search(int[][] matrix,int target){
        int row = matrix.length;
        int column = matrix[0].length;

        if (row == 1){
            return binarySearch(matrix,0,column-1,0,target);
        }
        int rStart = 0;
        int rEnd = row-1;
        int cMid = column/2;

        while (rStart < (rEnd-1)){
            int mid = rStart + (rEnd-rStart)/2;
            if (matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            } else if (matrix[mid][cMid]<target) {
                rStart = mid;
            }else {
                rEnd = mid;
            }
        }

        if (matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if (matrix[rStart +1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        if (target <= matrix[rStart][cMid-1]){
            return binarySearch(matrix,0,cMid-1,rStart,target);
        }
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][column-1]){
            return binarySearch(matrix,cMid+1,column-1,rStart,target);
        }
        if (target <= matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,0,cMid-1,rStart+1,target);
        }else {
            return binarySearch(matrix,cMid+1,column-1,rStart+1,target);
        }
    }
    static int[] binarySearch(int[][] matrix ,int cStart,int cEnd,int row,int target){
        while (cStart<=cEnd){
            int mid = cStart + (cEnd-cStart)/2;
            if (matrix[row][mid] == target){
                return new int[]{row,mid};
            } else if (matrix[row][mid]<target) {
                cStart = mid+1;
            }else {
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }
}