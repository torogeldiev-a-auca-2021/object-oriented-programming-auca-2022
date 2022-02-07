import java.util.Scanner;

public class URI1332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for (int i = 0; i < lines; i++) {
            String msg = sc.next();
            char[] a = msg.toCharArray();
            if (a[0] != 'o' && a[1] == 'n' && a[2] == 'e' ||
                    a[0] == 'o' && a[1] != 'n' && a[2] == 'e' ||
                    a[0] == 'o' && a[1] == 'n' && a[2] != 'e' ||
                    a[0] == 'o' && a[1] == 'n') {
                System.out.println('1');

            } else if (a[0] != 't' && a[1] == 'w' && a[2] == 'o' ||
                    a[0] == 't' && a[1] != 'w' && a[2] == 'o' ||
                    a[0] == 't' && a[1] == 'w' && a[2] != 'o' ||
                    a[0] == 't' && a[1] == 'w') {
                System.out.println('2');

            } else if (a[0] != 't' && a[1] == 'h' && a[2] == 'r' && a[3] == 'e' && a[4] == 'e' ||
                    a[0] == 't' && a[1] != 'h' && a[2] == 'r' && a[3] == 'e' && a[4] == 'e' ||
                    a[0] == 't' && a[1] == 'h' && a[2] != 'r' && a[3] == 'e' && a[4] == 'e' ||
                    a[0] == 't' && a[1] == 'h' && a[2] == 'r' && a[3] != 'e' && a[4] == 'e' ||
                    a[0] == 't' && a[1] == 'h' && a[2] == 'r' && a[3] == 'e' && a[4] != 'e' ||
                    a[0] == 't' && a[1] == 'h' && a[2] == 'r' && a[3] == 'e') {
                System.out.println('3');
            }
        }
    }
}
