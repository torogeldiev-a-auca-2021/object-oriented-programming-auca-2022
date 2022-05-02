import java.util.Arrays;
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] board = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = sc.nextInt();
                board[i][j] = x;
                System.out.printf("%5d", board[i][j]);
            }
            System.out.println();
        }

    }

    public void  print(int row , int col, int num){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

            }
        }

    }
}

