import java.util.*;

public class URI2137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = sc.next();
            }
            Arrays.sort(s);

            for (int i = 0; i < n; i++) {
                System.out.println(s[i]);

            }
        }
    }
}
