import java.util.Scanner;
public class Main {
    static int WIDTH = 20;
      static char[][] screen = new char[20][20];
    static boolean turtleIsPenDown;

    public static void main(String[] args) {
        initScreen();
        PrintScreen();
        turtlePenDown();
        TurtleIsPenUp();
    }

    private static void TurtleIsPenUp() {
        turtleIsPenDown = false;
    }

    private static void turtlePenDown() {
        turtleIsPenDown = true;
    }


    private static void PrintScreen() {
        for (int i = 1; i < 20; i++) {
            System.out.println();
            for (int j = 1; j < 20; j++) {
                System.out.print(screen[i][j]);
            }
        }
    }

    private static void initScreen() {
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                screen[i][j] = '.';
            }
        }
    }
}
