package Recursion.Back_Tracking;

public class NQueens {
    public static void main(String[] args) {
        nQueens(4);
    }

    public static void nQueens(int n){
        boolean[][] matrix = new boolean[n][n];
        System.out.println(queenHelper(matrix,0));
    }

    public static int queenHelper(boolean[][] matrix,int row){
        if (row == matrix.length){
            printQueens(matrix);
            System.out.println();
            return 1;
        }
        int count = 0;

        for (int col = 0; col < matrix.length; col++) {
            if (isSafe(matrix,row,col)){
                matrix[row][col] = true;
                count += queenHelper(matrix,row+1);
                matrix[row][col] = false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] matrix,int row,int col){

        //check vertical
        for (int i = 0; i < row; i++) {
            if (matrix[i][col]){
                return false;
            }
        }

        //check diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if (matrix[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row,matrix.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if (matrix[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    public static void printQueens(boolean[][] matrix){
        for (boolean[] booleans : matrix) {
            System.out.print("{");
            for (int j = 0; j < matrix[0].length; j++) {
                char queen = (booleans[j]) ? 'Q' : '-';
                System.out.print(queen);
            }
            System.out.println("}");
        }
    }
}
