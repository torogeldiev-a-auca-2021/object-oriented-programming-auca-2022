import java.util.Scanner;

public class URI1241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for (int i = 0; i < lines; i++) {
            String msg = sc.next();
            String message = sc.next();
            if(msg.endsWith(message)){
                System.out.println("encaixa");
            }
            else{
                System.out.println("nao encaixa");
            }
        }
    }
}







