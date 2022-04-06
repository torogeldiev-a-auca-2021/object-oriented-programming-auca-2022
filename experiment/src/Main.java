import java.util.Scanner;
public class Main {
    static int WIDTH = 20;
      static char[][] screen = new char[20][20];
    static boolean turtleIsPenDown;

    public static void main(String[] args) {
//        initScreen();
//        PrintScreen();
//        turtlePenDown();
//        TurtleIsPenUp();
        Screen sc = new Screen();
        Screen sc2 = new Screen();

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

class Screen {
    int height;
    int width;
    char [][]screen;
    public void initScreen(){
        height= 20;
        width = 20;
        screen= new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                screen [width][height] = '.';

            }
        }
    }
}
