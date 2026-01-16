package Games;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] game = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };

        char player = 'X';
        boolean isWon = false;

        System.out.println(player+" Please! start the game ");

        Scanner scanner = new Scanner(System.in);
        while (!isWon){
            print(game);
            System.out.println("Enter input for "+player+" First enter coordinates");
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            if (row>game.length-1 || column>game[0].length-1 || game[row][column]!=' '){
                System.out.println("Invalid entry");
                continue;
            }

            game[row][column] = player;

            if (check(game,player)){
                isWon = true;
                System.out.println(player+" has won the game");
            }else {
                if (player == 'X'){
                    player = 'O';
                }else {
                    player = 'X';
                }
            }
        }
    }

    private static boolean check(char[][] game,char player){
        //checking the columns
        for (int i = 0; i < game.length; i++) {
            if (game[0][i]==player && game[1][i]==player && game[2][i]==player){
                return true;
            }
        }

        //checking the rows
        for (int i = 0; i < game[0].length; i++) {
            if (game[i][0]==player && game[i][1]==player && game[i][2]==player){
                return true;
            }
        }

        //checking the diagonals

        if (game[0][0] == player && game[1][1]==player&&game[2][2]==player){
            return true;
        }

        return game[0][2] == player && game[1][1] == player && game[2][1] == player;
    }
    private static void print(char[][] game){
        for (char[] chars : game) {
            for (int j = 0; j < game[0].length; j++) {
                System.out.print(chars[j] + " | ");
            }
            System.out.println();
        }
    }
}
