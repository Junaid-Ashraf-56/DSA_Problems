package Recursion.Back_Tracking;

//Backtracking in all paths of a maze
public class Question2 {

    public static void backTrack(boolean[][] maze,String p,int r,int c){
        if (r==maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return ;
        }

        if (!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if (r<maze.length-1){
            backTrack(maze,p +"D ",r+1,c);
        }
        if (c<maze[0].length-1){
            backTrack(maze,p+"R ",r,c+1);
        }
        if (r>0){
            backTrack(maze,p+"U ",r-1,c);
        }
        if (c>0){
            backTrack(maze,p+"L ",r,c-1);
        }

        maze[r][c] = true;

    }
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        backTrack(maze,"",0,0);
    }
}
