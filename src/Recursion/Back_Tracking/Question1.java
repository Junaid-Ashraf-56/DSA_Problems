package Recursion.Back_Tracking;

//I have to move from a 3*3 matrix from position (0,0) to position(2,2)

public class Question1 {

    public static int maze(int r, int c){
        if (r==1 || c==1){
            return 1;
        }
        int left = maze(r-1,c);
        int right = maze(r,c-1);

        return left+right;
    }

    public static void maze(String path,int r, int c){
        if (r==1 && c==1){
            System.out.println(path);
            return;
        }

        if (r>1){
            maze(path+"V ",r-1,c);
        }
        if (c>1){
            maze(path+"H ",r,c-1);
        }
    }
    public static void main(String[] args) {
//        i am moving it from (3,3) to (1,1) if i want to move it from (0,0) to (2,2) just make a tree and move 1 by 1 on both side
        System.out.println(maze(3,3));
        maze("",3,3);
    }
}
