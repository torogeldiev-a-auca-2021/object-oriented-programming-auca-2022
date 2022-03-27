import java.util.Scanner;

public class URI1257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int res  = 0;
            int sec = sc.nextInt();
            for (int j = 0; j < sec; j++) {
                String msg = sc.next();
                for (int k = 0; k < msg.length(); k++) {
                    res += j + msg.charAt(k) - 65 + k;
                }
            }
            System.out.println(res);
        }
    }
}