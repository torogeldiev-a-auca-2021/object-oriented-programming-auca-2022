import java.util.Scanner;

public class URI1514 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            boolean nobodySolvedAll = true;
            boolean everyoneSolvedAtLeastOne = true;
            boolean everyProblemSolved = true;
            boolean noProblemSolvedByEveryOne = true;

            int nContestants = inp.nextInt();
            int nProblems = inp.nextInt();

            if (nContestants == 0 && nProblems == 0) {
                break;
            }

            int[] counters = new int[nProblems];

            for (int i = 0; i < nContestants; i++) {
                int sum = 0;
                for (int j = 0; j < nProblems; j++) {
                    int r = inp.nextInt();
                    sum += r;
                    counters[j] += r;
                }
                if (sum == nProblems) {
                    nobodySolvedAll = false;
                }
                if (sum == 0) {
                    everyoneSolvedAtLeastOne = false;
                }
            }
            for (int c : counters) {
                if (c == 0) {
                    everyProblemSolved = false;
                }
                if (c == nContestants) {
                    noProblemSolvedByEveryOne = false;
                }
            }

            int res = 0;
            res += nobodySolvedAll ? 1 : 0;
            res += everyoneSolvedAtLeastOne ? 1 : 0;
            res += everyProblemSolved ? 1 : 0;
            res += noProblemSolvedByEveryOne ? 1 : 0;

            System.out.println(res);
        }
    }
}