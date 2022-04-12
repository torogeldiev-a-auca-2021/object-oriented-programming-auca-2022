import java.util.Scanner;

public class URI1329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {

            int counter = 0, counter1 = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num == 1) {
                    counter++;
                }
                if (num == 0) {
                    counter1++;
                }
            }
            System.out.println("Mary won " + counter1 + " times and John won " + counter + " times");
        }
    }
}
