import java.util.Scanner;

public class URI2484 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String msg = sc.next();
            StringBuilder app = new StringBuilder();
            char[] a = msg.toCharArray();
            for (int i = 0; i < msg.length(); i++) {
                app.append(a[i]);
                if(i < msg.length() - 1)
                app.append(' ');
            }
            System.out.println(app);

            for (int i = 0; i < msg.length() - 1; i++) {
                app.insert(0," ");
                app.delete(app.length() - 2 , app.length());
                System.out.println(app);
            }
            System.out.println();
        }
    }
}