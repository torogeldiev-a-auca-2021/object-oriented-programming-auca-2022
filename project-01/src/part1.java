import java.util.Arrays;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] board = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i == 1 && j == 1 ){
                    board[i][j] = 0;
                }
                 else if(i == 2 && j == 2 ){
                    board[i][j] = 0;
                }
                else {
                    board[i][j] = 1;
                }
            }
        }
        System.out.println(board);
    }
}
