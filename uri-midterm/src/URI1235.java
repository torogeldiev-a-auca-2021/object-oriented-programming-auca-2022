import java.util.Scanner;

public class URI1235 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String msg = sc.nextLine();
            System.out.println(InsideandOut(msg));
        }
    }

    static char[] InsideandOut(String msg) {

        int center;
        char[] chars = msg.toCharArray();
        center = chars.length / 2;
        char temp;
        for (int i = 0, j = center - 1, k = 0; k < msg.length() / 4; i++, j--, k++) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        for (int i = center, j = chars.length - 1, k = 0; k < msg.length() / 4; i++, j--, k++) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return chars;
    }
}
