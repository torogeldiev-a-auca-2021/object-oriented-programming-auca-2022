import java.util.Scanner;

public class URI1873 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            String msg = sc.next();
            String msg2 = sc.next();
            if(msg2.equals(msg)){
                System.out.println("empate");
            }
            if(msg.equals("cissors") && msg2.equals("paper")){
                System.out.println("rajesh");
            }
        }
    }
}
