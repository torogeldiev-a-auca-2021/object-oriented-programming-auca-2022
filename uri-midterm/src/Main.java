
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int   t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String msg = sc.nextLine();
            char [] a = msg.toCharArray();
            boolean b = false;
            int counter = 0;

            for (int j = 0; j < msg.length(); j++) {
             if(a[j] >= 65 && a[j] <= 90 || a[j] >= 97 && a[j] <= 122){
                 b = true;
                     counter++;
             }

            }
            if(b) {
                System.out.println("frase completa");
            }
            if(counter > 13){
                System.out.println("frase quase completa");
            }else {
                System.out.println("frase mal elaborada");
            }

        }

    }
}