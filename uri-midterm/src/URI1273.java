import java.util.Scanner;

public class URI1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        while (true) {
            String longest = "";
            String[] msg = new String[str];
            String aaa = "";
            StringBuilder aa = new StringBuilder();
            for (int i = 0; i < str; i++) {
                msg[i] = sc.next();
                for (int j = 0; j < msg.length; j++) {
                    if (msg[i].length() > longest.length()) {
                        longest = msg[i];
                    }
                }
            }
            for (int j = 1; j < msg.length; j++) {
                for (int i = 0; i < longest.length() - msg[j].length(); i++) {
                    System.out.print(" ");
                }
                System.out.println(msg[j]);

            }
            if (str == 0) {
                break;
            }
        }
    }
}