import java.util.Scanner;

public class URI1558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a < 0) {
                System.out.println("NO");
                continue;
            }

            boolean b = false;

            one:
            for (int i = 0; i * i <= a; i++) {
                for (int j = 0; j * j <= a; j++) {
                    if (i * i + j * j == a) {
                        b = true;
                        break one;
                    }
                    if (i * i + j * j > a) {
                        break;
                    }
                }
            }
            if (b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}


