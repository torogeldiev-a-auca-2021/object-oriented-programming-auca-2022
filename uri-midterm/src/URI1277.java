import java.util.Scanner;

public class URI1277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int number = sc.nextInt();
            String[] students = new String[number];
            String[] marks = new String[number];
            for (int j = 0; j < number; j++) {
                students[j] = sc.next();
            }
            boolean b = false;
            for (int j = 0; j < number; j++) {
                double answer = 0;
                int p = 0, m = 0;
                marks[j] = sc.next();
                int length = marks[j].length();
                char[] r = marks[j].toCharArray();
                for (int k = 0; k < length; k++) {
                    if (r[k] == 'P') {
                        p++;
                    }
                    if (r[k] == 'M') {
                        m++;

                    }
                }
                answer = (double) p / (length - m);
                if (answer < 0.75) {
                    if(b){
                        System.out.print(" ");
                    }
                    System.out.print(students[j]);
                    b = true;
                }

            }
            System.out.println();

        }
    }
}