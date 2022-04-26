import java.util.Scanner;

public class URI1437 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a;
        int north = 1;
        while ((a = scn.nextInt()) != 0) {
            scn.nextLine();
            String d = scn.nextLine();
            int cDir = north;
            for (int j = 0; j < d.length(); j++) {
                if (d.charAt(j) == 'E') {
                    if (cDir == 0) {
                        cDir = 4;
                    }
                    cDir--;
                } else {
                    if (cDir == 3) {
                        cDir = -1;
                    }
                    cDir++;
                }
            }
            char res = ' ';
            switch (cDir) {
                case 0:
                    res = 'O';
                    break;
                case 1:
                    res = 'N';
                    break;
                case 2:
                    res = 'L';
                    break;
                case 3:
                    res = 'S';
                    break;
            }
            System.out.println(res);
        }
    }
}

