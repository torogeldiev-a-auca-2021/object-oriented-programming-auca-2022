import java.util.Scanner;

public class URI1277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        double result = 0, answer = 0;
        double p = 0, m = 0;
        for (int i = 0; i < t; i++) {
            int number = sc.nextInt();
            sc.nextLine();
            String[] students = new String[number];
            String[] marks = new String[number];
            for (int j = 0; j < number; j++) {
                students[i] = sc.next();
            }
            for (int j = 0; j < number; j++) {
                marks[i] = sc.next();
                result = marks[i].codePointCount(0, marks[i].length());
                char[] r = marks[i].toCharArray();
                for (int k = 0; k < marks[i].length(); k++) {
                    if (r[k] == 'P') {
                        p++;
                    }
                    if (r[k] == 'M') {
                        m++;

                    }
                }
                answer = p / (result - m);
                if (answer < 0.75) {
                    System.out.println(students[i]);
                }
                if (answer >= 0.75) {
                    System.out.println();
                }
            }

        }
    }
}