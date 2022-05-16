import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Game2048 game = new Game2048();

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                int x = inp.nextInt();
                game.setAt(r,c,x);
            }
        }
        int userCmd = inp.nextInt();
        switch (userCmd){
            case 0:
                game.moveLeft();
                break;
            case 2:
                game.moveRight();
                break;
            case 1:
                game.moveUp();
                break;
            case 3:
                game.moveDown();
                break;
        }
        game.print();
    }
}