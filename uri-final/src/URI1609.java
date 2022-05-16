import java.util.ArrayList;
import java.util.Scanner;

public class URI1609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            ArrayList<Integer> r = new ArrayList<>();
            int res = 0;
            for (int j = 0; j < b; j++) {
                int id = sc.nextInt();

                if (!r.contains(id)) {
                    r.add(id);
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
