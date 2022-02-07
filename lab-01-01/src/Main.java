public class Main {
    static final int SCREEN_HEIGHT = 20;
    static final int SCREEN_WIDTH = 20;

    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;

    static char [][] screen = new char [SCREEN_HEIGHT][SCREEN_WIDTH];

    static int turtleDir;
    static int turtleRow;
    static int turtleCol;
    static boolean turtleIsPenDown;



    public static void main(String[] args) {
        initScreen();
        initTurtle();

        turtlePenDown();
        turtleMove(10);
        turtleRight();
        turtleMove(10);
        turtleLeft();
        turtleMove(7);
        turtleLeft();
        turtleMove(5);
        turtleLeft();
        turtleMove(3);


        printScreen();
    }

    private static void turtleRight() {
        turtleDir = turtleDir == 3 ? UP : turtleDir + 1;
    }

    private static void turtleLeft() {
        turtleDir = turtleDir == 0 ? LEFT : turtleDir - 1;
    }

    private static void turtlePenUp() {
        turtleIsPenDown = false;
    }

    private static void turtlePenDown() {
        turtleIsPenDown = true;
        screen[turtleRow][turtleCol] = '*';
    }

    private static void turtleMove(int steps) {
        for (int i = 0; i < steps; i++){
            switch (turtleDir){
                case UP: turtleRow--;break;
                case DOWN: turtleRow++;break;
                case LEFT: turtleCol--; break;
                case RIGHT: turtleCol++;break;
            }
            if (turtleIsPenDown)
                screen [turtleRow][turtleCol] = '*';
        }
    }

    private static void initTurtle(){
        turtleDir = RIGHT;
        turtleRow = 0;
        turtleCol = 0;
        turtleIsPenDown = false;

    }

    private static void printScreen(){
        for (int row = 0; row < SCREEN_HEIGHT; row++){
            // print current line
            for (int col = 0; col < SCREEN_WIDTH; col++){
                System.out.print(screen[row][col]);
            }
            System.out.println();
        }
    }
    static void initScreen (){
        for (int row = 0; row < SCREEN_HEIGHT; row++){
            for (int col = 0; col < SCREEN_WIDTH; col++){
                screen[row][col] = '_';
            }
        }
    }
}