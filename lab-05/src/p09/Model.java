package p09;

public class Model {
    public static int SIZE = 8;

    private int robotRow;
    private int robotCol;

    void moveUp(){
        if (robotRow > 0){
            robotRow--;
        }
    }

    void moveDown(){
        if (robotRow < 7){
            robotRow++;
        }
    }
    void moveLeft(){
        if (robotCol > 0){
            robotCol--;
        }
    }
    void moveRight(){
        if (robotCol < 7){
            robotCol++;
        }
    }
    public int getRobotRow(){
        return robotRow;
    }
    public int getRobotCol(){
        return robotCol;
    }

}