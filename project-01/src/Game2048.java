import java.util.Arrays;
import java.util.List;

class Game2048 {
    private static final List<Integer> POSSIBLE_GOALS = Arrays.asList(8, 16, 32, 64, 128, 256, 1024, 2048);
    private int goal;
    public int[][] data = new int[4][4];

    public Game2048() {
        this.goal = 16;
    }

    public Game2048(int goal) {
        //throws IllegalAccessException {
        if (POSSIBLE_GOALS.contains(goal)) {
            //throw new IllegalAccessException("Incorrect goal");
        }
        this.goal = goal;
        //}
    }

    public void setAt(int row, int col, int value) {
        data[row][col] = value;
    }

    public void print() {
        for (int r = 0; r < 4; ++r) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("%5d", data[r][c]);
            }
            System.out.println();
        }
    }






    public void moveDown() {
        for (int c = 0; c < 4; c++) {
            for (int r = 0; r < 3; r++) {
                if (data[r + 1][c] == 0) {
                    data[r + 1][c] = data[r][c];
                    data[r][c] = 0;
                }
                if (data[r + 1][c] == data[r][c]) {
                    data[r + 1][c] = 2 * data[r][c];
                    data[r][c] = 0;
                }
            }
            for (int r = 0; r < 3; r++) {
                if (data[r + 1][c] == 0) {
                    data[r + 1][c] = data[r][c];
                    data[r][c] = 0;
                }
            }
        }
    }

    public int getGoal() {
        return goal;
    }
}
