import java.util.Scanner;

public class URI1277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        double result = 0, answer = 0;
        double p = 0, m = 0;
        for (int i = 0; i < t; i++) {
            int number = sc.nextInt();
            for (int j = 0; j < number; j++) {
                String students = sc.nextLine();
                String marks = sc.nextLine();
                result = marks.codePointCount(0, marks.length());
                char[] r = marks.toCharArray();
                for (int k = 0; k < marks.length(); k++) {
                    if (r[k] == 'P') {
                        p++;
                    }
                    if (r[k] == 'M') {
                        m++;

                    }
                    answer = p /( result - m);
                    }
                    if (answer < 0.75){
                        System.out.println(students);
                    }
                    if (answer >= 0.75) {
                        System.out.println();
                    }
                }
            }
        }
    }