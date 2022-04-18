import java.util.Scanner;

public class URI1245 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (inp.hasNext()) {
            int n = inp.nextInt();
            int counter = 0;
            int m = 61;
            int [] d = new int[m];
            int [] e = new int[m];
            int max = 10000;

            if (n >= 2 && n <= max && n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    int s = inp.nextInt();
                    char c = inp.next().charAt(0);
                    if (c == 'D') {
                        d[s]++;
                        if (e[s] > 0) {
                            d[s]--;
                            e[s]--;
                            counter++;
                        }
                    } else {
                        e[s]++;
                        if (d[s] > 0) {
                            d[s]--;
                            e[s]--;
                            counter++;
                        }
                    }
                }
                System.out.println(counter);
            }
        }
    }
}