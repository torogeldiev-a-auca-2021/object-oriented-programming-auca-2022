import java.util.Scanner;

public class URI1533 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a;
        while ((a = scn.nextInt()) != 0) {
            int m = 0, m2 = 0;
            int index = 0;
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = scn.nextInt();
                if (arr[i] > m) {
                    index = i;
                    m = arr[i];
                }
            }
            int result = 0;
            for (int i = 0; i < a; i++) {
                if (i == index) {
                    continue;
                }
                if (m2 < arr[i]) {
                    m2 = arr[i];
                    result = i;
                }
            }
            System.out.println(result + 1);
        }
    }
}