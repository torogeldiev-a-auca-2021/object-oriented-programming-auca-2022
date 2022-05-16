import java.util.Scanner;

public class URI1285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = 0;
            for (int i = a; i <= b; i++) {
                boolean[] c = new boolean[10];
                boolean count = false;
                int t = i;

                while (t != 0) {
                    if (c[t % 10]) {
                        count = true;
                        break;
                    }
                    c[t % 10] = true;
                    t /= 10;
                }
                if (!count) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}




