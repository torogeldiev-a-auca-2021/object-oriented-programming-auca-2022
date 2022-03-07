
import java.util.Scanner;

public class URI2062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i <= n;i++){
            String msg = sc.nextLine();
            if (msg.startsWith("OB") && msg.length() == 3) {
                System.out.print("OBI ");
            } else if (msg.startsWith("UR") && msg.length() == 3) {
                System.out.print("URI ");
            } else if (!msg.startsWith("OB")) {
                System.out.print(msg);
            } else if (!msg.startsWith("UR")) {
                System.out.print(msg);
            }
        }
        System.out.println();
    }
}

