import java.util.Scanner;

public class URI1257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            extracted(sc);
        }
    }

    private static void extracted(Scanner sc) {
        int num2 = sc.nextInt();
        int result = 0;
        for (int j = 0; j < num2; j++) {
            String msg = sc.next();
            for (int i = 0; i < msg.length(); i++) {
                result += msg.charAt(i) - 65 + i + j;
            }
        }
        System.out.println(result);
    }
}