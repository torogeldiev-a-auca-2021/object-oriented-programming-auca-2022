import java.util.Scanner;

public class URI1871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        while (sc.hasNextLine()) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int result = a + b;
            String str = Integer.toString(result);
            String replace = str.replace("0", "");
            System.out.println(replace);
        }
    }
}