import java.util.Scanner;

public class URI1239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String msg = sc.nextLine();
            String res = null;
            int counter = 0;
            int counter2 = 0;
            for (int i = 0; i < msg.length(); i++) {
                if (msg.charAt(i) == '_' && counter % 2 == 0) {
                    counter++;
                     res = msg.replace("_", "<i>");

                } else if (msg.charAt(i) == '_' && counter% 2 != 0) {
                    counter++;
                     res = msg.replace("_", "</i>");

                }
                if (msg.charAt(i) == '*' && counter2 % 2 == 0) {
                    counter2++;
                     res = msg.replace("_", "<b>");

                } else if (msg.charAt(i) == '*' && counter2 % 2 != 0) {
                    counter2++;
                     res = msg.replace("_", "</b>");

                }
            }
            msg = msg.replace("_", "<i>");
            System.out.println(res);
            System.out.println(msg);
        }
    }
}
