import java.util.Locale;
import java.util.Scanner;

public class URi1632 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int answer = 1;
            String msg = sc.next().toLowerCase();
            char [] a  = msg.toCharArray();
            for (int j = 0; j < msg.length(); j++) {
                if(a[j] == 'a' || a[j] == 'e' ||  a[j] == 'i' ||
                        a[j] == 'o' ||  a[j] == 's') {
                    answer *= 3;
                }
                else{
                    answer *= 2;
                }

            }
            System.out.println(answer);
        }
    }
}
