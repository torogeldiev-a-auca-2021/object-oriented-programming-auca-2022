import java.util.Scanner;

public class URI2157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases= sc.nextInt();
        for (int j = 0; j < cases; j++) {
            StringBuilder msg = new StringBuilder();
            int a = sc.nextInt() ;
            int b = sc.nextInt();
            for (int i = a ; i <= b; i++) {
                    msg.append(i);
            }
            System.out.print(msg);
            System.out.print(msg.reverse());
            System.out.println();
        }
    }
}