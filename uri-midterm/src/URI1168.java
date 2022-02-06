import java.util.Scanner;

public class URI1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            String number = sc.next();
            int sum = 0;
            char[] c = number.toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (c[j] == '1') {
                    sum += 2;
                }
                if (c[j] == '2') {
                    sum += 5;
                }
                if (c[j] == '3') {
                    sum += 5;
                }
                if (c[j] =='4') {
                    sum += 4;
                }
                if (c[j] == '5') {
                    sum += 5;
                }
                if (c[j] == '6') {
                    sum += 6;
                }
                if (c[j] == '7') {
                    sum += 3;
                }
                if (c[j] == '8') {
                    sum += 7;
                }
                if (c[j] == '9') {
                    sum += 6;
                }
                if (c[j] == '0') {
                    sum += 6;
                }
            }
            System.out.println(sum + " leds");

        }
    }
}

